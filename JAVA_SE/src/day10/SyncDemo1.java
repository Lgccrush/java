package day10;
/**
 * ���̲߳�������һ���߳�ʱ,�ͻ��γ�"��"������,�����߳��л�ʱ����ȷ��,
 * ���ܵ���ִ�д���Ļ���,����ʱ�ᵼ��ϵͳ̱��
 * @author L
 *
 */
public class SyncDemo1 {

	public static void main(String[] args) {
		Table table = new Table();//�������Ӷ���
		//�����߳�1
		Thread t1 = new Thread(){
			public void run() {
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		//�����߳�2
		Thread t2 = new Thread(){
			public void run() {
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}

}

class Table{
	private int beans = 20;
	/*
	 * ����synchronized
	 * ��һ��������synchronize���κ�,�÷���Ϊͬ������,��:�����������ͬʱ���뷽���ڲ�ִ��,
	 * ���ڳ�Ա��������,synchronize����һ���̵߳��ø÷���ʱ���÷��������������,�����߳���ִ�и÷���ʱ,
	 * ����ִ�з������߳�û���ͷ���,����ֻ���ڷ���������,ֱ�����з��������߳̽�����ִ�����,
	 * ����,������̲߳���ִ�а�ȫ����İ취���ǽ�"��"��Ϊ"�Ŷ�"
	 */
	public synchronized int  getBean() {
		if (beans==0) {
			throw new RuntimeException("û�ж�����");
		}
		Thread.yield();
		return beans--;
	}
}
