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
 * �����ҷ����
 * 
 * @author L
 *
 */
public class Server {
	/*
	 * �����ڷ���˵�ServerSocket��Ҫ����: 1:��ϵͳ�������˿� �ͻ��˾���ͨ�������֮����
	 * 2:��������ķ���˿�,��һ���ͻ���ͨ���ö˿ڳ��Խ�������ʱ, ServerSocket���ڷ���˴���һ��Socket��ͻ��˽�������
	 */
	private ServerSocket server;
	/*
	 * �������пͻ���������ļ���
	 */
	private List<PrintWriter> allOut;

	/**
	 * ������ʼ������˵�
	 */
	public Server() throws Exception {
		/*
		 * ��ʼ����ͬʱ�������˿�
		 */
		server = new ServerSocket(8088);

		allOut = new ArrayList<PrintWriter>();
	}

	/**
	 * �����������������빲����
	 * 
	 * @param out
	 */
	private synchronized void addOut(PrintWriter out) {
		allOut.add(out);
	}

	/**
	 * ���������������Ӽ�����ɾ��
	 * 
	 * @param out
	 */
	private synchronized void removeOut(PrintWriter out) {
		allOut.remove(out);
	}

	/**
	 * �͸�������Ϣ���͸�ʹ�ÿͻ���
	 * 
	 * @param message
	 */
	private synchronized void sendMessage(String message) {
		for (PrintWriter out : allOut) {
			out.println(message);
		}
	}

	/**
	 * ����˿�ʼ�����ķ���
	 */
	public void start() {
		try {
			/*
			 * ServerSocket ��accept������һ����������, �����Ǽ�������˿�,ֱ��һ���ͻ������Ӳ�����һ��socket,
			 * ʹ�ø�Socket����������ӵĿͻ��˽��н���
			 */
			System.out.println("�ȴ��ͻ�������...");
			Socket socket = server.accept();
			System.out.println("һ���ͻ���������");
			// ���߳̿��Խ��ܶ���ͻ���
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
			System.out.println("���������ʧ��");
		}
	}

	class ClientHandler implements Runnable {
		
		private Socket socket;// ���̴߳���ͻ���Socket
		private String host;//�ͻ��˵ĵ�ַ��Ϣ
		private String nickName;//���û��ǳ�

		public ClientHandler(Socket socket) {
			this.socket = socket;
			// ͨ��Socket���Ի��Զ�˼�����ĵ�ַ��Ϣ
			host = socket.getInetAddress().getHostAddress();
		}

		// ����һ���ͻ��˵Ľ���
		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * 
				 * InputStream getInputStream �÷������Ի�ȡһ��������,�Ӹ�����ȡ�����ݾ��Ǵ�Զ�˼������������
				 */
				
				InputStream in = socket.getInputStream();// ��ȡ�ֽ�������
				InputStreamReader isr = new InputStreamReader(in, "UTF-8");// ��ȡת����,��ָ���ַ���
				BufferedReader br = new BufferedReader(isr);// ��ȡ�ַ�������
				//���ȶ�ȡһ���ַ���Ϊ�ǳ�
				nickName=br.readLine();
				sendMessage(nickName + "������");
				
				OutputStream out = socket.getOutputStream();// ��ȡ�ֽ�������
				OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");// ��ȡת����
																				// ��ָ���ַ���
				pw = new PrintWriter(osw, true);// ��ȡ�ַ������
				/*
				 * ���ÿͻ��˵���������뵽��������
				 */
				addOut(pw);

				String message = null;
				/*
				 * br.readLine()�ڶ�ȡ�ͻ��˷���������Ϣʱ, ���ڿͻ�������,�������ϵͳ�Ĳ�ͬ,��ȡ�����ͬ
				 * ��Windows�Ŀͻ��˶Ͽ�: br.readLine()�׳��쳣 ��Linux�Ŀͻ��˶Ͽ�:
				 * br.readLine()����null
				 */
				while ((message = br.readLine()) != null) {
					// ��ȡ����,д����Ϣ

					// pw.println(host+"˵:"+masagge);
					// �㲥��Ϣ
					sendMessage(nickName + "˵:" + message);
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {// ����ͻ��˶Ͽ�����߼�

				// ���ÿͻ���������ڹ�������ɾ��
				removeOut(pw);
				sendMessage(nickName + "������");
				try {
					socket.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}

		}

	}
}
