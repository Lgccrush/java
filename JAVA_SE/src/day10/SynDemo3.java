package day10;
/**
 * ��̬������ͬ��
 * ��һ����̬������synchronize���κ�,
 * ��ô�÷���Ϊͬ������
 * ���ھ�̬����������.ȫ�־�һ��
 * ����ͬ���ľ�̬������һ������ͬ��Ч��,������޹�
 * @author L
 *
 */
public class SynDemo3 {
	public static void main(String[] args) {
		 Foo f1 = new Foo();
		 Foo f2 = new Foo();
		Thread t1 = new Thread(){
			public void run() {
				f2.dosome();//������޹�
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				f1.dosome();
			}
		};
		t1.start();
		t2.start();
	}

}
class Foo{
	public synchronized static void  dosome() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":"+"����ִ��dosome����");
			t.sleep(5000);
			System.out.println(t.getName()+":"+"ִ�����");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}