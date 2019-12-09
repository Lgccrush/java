package day10;
/**
 * ������
 * synchronizeҲ�л�����
 * ��:ʹ��synchronize���ζ�δ���,ֻҪ����ͬ�����Ӷ�����ͬ,
 * ��ô�⼸�δ�����ǻ����ϵ,
 * ��:���̲߳���ͬʱִ�����д���
 * @author L
 *
 */
public class SynDemo4 {

	public static void main(String[] args) {
		Boo boo = new Boo();
		Thread t1 = new Thread(){
			public void run() {
				boo.A();
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				boo.B();
			}
		};
		t1.start();
		t2.start();
	}

}
class Boo{
	public synchronized void A() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":"+"����ִ��A����");
			t.sleep(5000);
			System.out.println(t.getName()+":"+"ִ��A��������");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public synchronized void B() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":"+"����ִ��B����");
			t.sleep(5000);
			System.out.println(t.getName()+":"+"ִ��B��������");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
