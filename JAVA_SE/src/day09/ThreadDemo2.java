package day09;
/**
 * �ڶ��ִ����̵߳ķ�ʽ
 * ʵ��Runnable�ӿڲ���дrun����
 * @author L
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		//������������
		Runnable r1 = new Myrunnable1();
		Runnable r2 = new Myrunnable2();
		//�����߳�
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//����start����
		t1.start();
		t2.start();
	}

}

class Myrunnable1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("����˭��");
		}
	}
	
	
}
class Myrunnable2 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("���ǲ�ˮ���");
		}
	}
	
	
}
