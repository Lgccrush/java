package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * 
 * @author L
 *
 */
public class Client {
	/*
	 * java.net.Socket 封装了TCP协议,使用它就可以基于TCP协议进行网络通信 Socket 是运行在客户端的
	 */
	private Socket socket;

	/**
	 * 构造方法,用来初始化客户端 实例化Socket的时候需要传入两个参数, 1:服务端地址:通过IP地址可以找到服务的那个计算机
	 * 2:服务端端口:通过端口可以找到服务端计算机上的服务端应用程序 实例化Socket的过程就是连接的过程,若远端计算机没有响应就会抛出异常
	 */

	public Client() throws Exception {
		System.out.println("正在连接服务端...");
		socket = new Socket("localhost", 8088);
		System.out.println("已于服务端建立连接");

	}

	/**
	 * 启动客户端方法
	 */
	public void start() {

		try {
			// 获取键盘输入
			Scanner scanner = new Scanner(System.in);
			/*
			 * 先要求用户输入昵称
			 */
//			String name = scanner.nextLine();
			String nickName = null;
			while (true) {//做判断
				System.out.println("请输入用户名");
				nickName=scanner.nextLine();
				if (nickName.length()>0) {
					break;
				}
				System.out.println("输入有误");
			}
			System.out.println("欢迎你,"+nickName+"!开始聊天吧!");
			/*
			 * Socket提供方法,OutputStream getOutputStream
			 * 获取一个字节输出流,通过该流写出的数据会被发送至远端计算机
			 */
			// 获取字节输出流
			OutputStream out = socket.getOutputStream();
			// 获取字符转换流,并指定字符集
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			// 获取字符流,并自动行刷新
			PrintWriter pw = new PrintWriter(osw, true);
			//先将昵称发送给服务器
			pw.println(nickName);
			
			
			
			
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();

			while (true) {
				// 向服务端发送信息
				pw.println(scanner.nextLine());
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {// 启动客户端
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("客户端启动失败");
		}

	}

	class ServerHandler implements Runnable {

		@Override
		public void run() {
			try {

				InputStream in = socket.getInputStream();// 获取字节输入流
				InputStreamReader isr = new InputStreamReader(in, "utf-8");// 获取转换流,指定字符集
				BufferedReader br = new BufferedReader(isr);// 获取字符流
				String message = null;
				while ((message = br.readLine()) != null) {
					// 读取信息
					System.out.println(message);
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
