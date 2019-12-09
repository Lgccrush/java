package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室服务端
 * 
 * @author L
 *
 */
public class Server {
	/*
	 * 运行在服务端的ServerSocket主要负责: 1:向系统申请服务端口 客户端就是通过这个与之连接
	 * 2:监听申请的服务端口,当一个客户端通过该端口尝试建立连接时, ServerSocket会在服务端创建一个Socket与客户端建立连接
	 */
	private ServerSocket server;
	/*
	 * 保存所有客户端输出流的集合
	 */
	private List<PrintWriter> allOut;

	/**
	 * 用来初始化服务端的
	 */
	public Server() throws Exception {
		/*
		 * 初始化的同时申请服务端口
		 */
		server = new ServerSocket(8088);

		allOut = new ArrayList<PrintWriter>();
	}

	/**
	 * 将给定的输入流存入共享集合
	 * 
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out) {
		allOut.add(out);
	}

	/**
	 * 将给定的输入流从集合中删除
	 * 
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out) {
		allOut.remove(out);
	}

	/**
	 * 就给定的信息发送给使用客户端
	 * 
	 * @param message
	 */
	private synchronized void sendMessage(String message) {
		for (PrintWriter out : allOut) {
			out.println(message);
		}
	}

	/**
	 * 服务端开始工作的方法
	 */
	public void start() {
		try {
			/*
			 * ServerSocket 的accept方法是一个阻塞方法, 作用是监听服务端口,直到一个客户端连接并创建一个socket,
			 * 使用该Socket即可与刚连接的客户端进行交互
			 */
			System.out.println("等待客户端连接...");
			Socket socket = server.accept();
			System.out.println("一个客户端连接了");
			// 用线程可以接受多个客户端
			ClientHandler handler = new ClientHandler(socket);
			Thread t = new Thread(handler);
			t.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("服务端启动失败");
		}
	}

	class ClientHandler implements Runnable {
		
		private Socket socket;// 该线程处理客户端Socket
		private String host;//客户端的地址信息
		private String nickName;//该用户昵称

		public ClientHandler(Socket socket) {
			this.socket = socket;
			// 通过Socket可以获得远端计算机的地址信息
			host = socket.getInetAddress().getHostAddress();
		}

		// 处理一个客户端的交互
		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * 
				 * InputStream getInputStream 该方法可以获取一个输入流,从该流读取的数据就是从远端计算机发过来的
				 */
				
				InputStream in = socket.getInputStream();// 获取字节输入流
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");// 获取转换流,并指定字符集
				BufferedReader br = new BufferedReader(isr);// 获取字符输入流
				//首先读取一行字符串为昵称
				nickName=br.readLine();
				sendMessage(nickName + "上线了");
				
				OutputStream out = socket.getOutputStream();// 获取字节输入流
				OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");// 获取转换流
																				// 并指定字符集
				pw = new PrintWriter(osw, true);// 获取字符输出流
				/*
				 * 将该客户端的输出流存入到共享集合中
				 */
				addOut(pw);

				String message = null;
				/*
				 * br.readLine()在读取客户端发过来的信息时, 由于客户端下线,而其操作系统的不同,读取结果不同
				 * 当Windows的客户端断开: br.readLine()抛出异常 当Linux的客户端断开:
				 * br.readLine()返回null
				 */
				while ((message = br.readLine()) != null) {
					// 读取数据,写出信息

					// pw.println(host+"说:"+masagge);
					// 广播信息
					sendMessage(nickName + "说:" + message);
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {// 处理客户端断开后的逻辑

				// 将该客户的输出流在共享集合中删除
				removeOut(pw);
				sendMessage(nickName + "下线了");
				try {
					socket.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}

		}

	}
}
