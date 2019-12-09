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
 * �����ҿͻ���
 * 
 * @author L
 *
 */
public class Client {
	/*
	 * java.net.Socket ��װ��TCPЭ��,ʹ�����Ϳ��Ի���TCPЭ���������ͨ�� Socket �������ڿͻ��˵�
	 */
	private Socket socket;

	/**
	 * ���췽��,������ʼ���ͻ��� ʵ����Socket��ʱ����Ҫ������������, 1:����˵�ַ:ͨ��IP��ַ�����ҵ�������Ǹ������
	 * 2:����˶˿�:ͨ���˿ڿ����ҵ�����˼�����ϵķ����Ӧ�ó��� ʵ����Socket�Ĺ��̾������ӵĹ���,��Զ�˼����û����Ӧ�ͻ��׳��쳣
	 */

	public Client() throws Exception {
		System.out.println("�������ӷ����...");
		socket = new Socket("localhost", 8088);
		System.out.println("���ڷ���˽�������");

	}

	/**
	 * �����ͻ��˷���
	 */
	public void start() {

		try {
			// ��ȡ��������
			Scanner scanner = new Scanner(System.in);
			/*
			 * ��Ҫ���û������ǳ�
			 */
//			String name = scanner.nextLine();
			String nickName = null;
			while (true) {//���ж�
				System.out.println("�������û���");
				nickName=scanner.nextLine();
				if (nickName.length()>0) {
					break;
				}
				System.out.println("��������");
			}
			System.out.println("��ӭ��,"+nickName+"!��ʼ�����!");
			/*
			 * Socket�ṩ����,OutputStream getOutputStream
			 * ��ȡһ���ֽ������,ͨ������д�������ݻᱻ������Զ�˼����
			 */
			// ��ȡ�ֽ������
			OutputStream out = socket.getOutputStream();
			// ��ȡ�ַ�ת����,��ָ���ַ���
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			// ��ȡ�ַ���,���Զ���ˢ��
			PrintWriter pw = new PrintWriter(osw, true);
			//�Ƚ��ǳƷ��͸�������
			pw.println(nickName);
			
			
			
			
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();

			while (true) {
				// �����˷�����Ϣ
				pw.println(scanner.nextLine());
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {// �����ͻ���
			Client client = new Client();
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�ͻ�������ʧ��");
		}

	}

	class ServerHandler implements Runnable {

		@Override
		public void run() {
			try {

				InputStream in = socket.getInputStream();// ��ȡ�ֽ�������
				InputStreamReader isr = new InputStreamReader(in, "utf-8");// ��ȡת����,ָ���ַ���
				BufferedReader br = new BufferedReader(isr);// ��ȡ�ַ���
				String message = null;
				while ((message = br.readLine()) != null) {
					// ��ȡ��Ϣ
					System.out.println(message);
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
