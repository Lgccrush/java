package day10;
/**
 * ͬ����
 * ��Ч����Сͬ����Χ.���Ա�֤������ȫ��ͬʱ�������ṩ����Ч��.
 * @author L
 *
 */
public class SynDemo2 {

	public static void main(String[] args) {
		final shop shop = new shop();//�����̵�
		Thread t1 = new Thread(){
			public void run() {
		shop.buy();		
			}
		};
		Thread t2 = new Thread(){
			public void run() {
				shop.buy();		
			}
		};
		t1.start();
		t2.start();
	}

}
class shop{
	public  void buy() {
		//��ȡ�߳�����
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":"+"�������·�");
			
				t.sleep(5000);
				/**
				 * ͬ�������Ҫ�����߳�,�Ըÿ��ڵĴ����Ŷ�ִ��,
				 * ����ǰ��������ͬ������������(�����Ķ���)
				 * Ҫ�������󿴵��ı�����ͬһ��
				 * 
				 * synchronize(ͬ������������){
				 * 	  ��Ҫͬ���Ĵ���
				 * }
				 * ��νͬ��ִ�м�:����̱߳����Ŷ�ִ��
				 * ��ν�첽ִ�м�:����߳̿���ͬʱִ��
				 */
			synchronized (this) {
				System.out.println(t.getName()+":"+"�������·�");
				t.sleep(5000);
			}
			
			
			System.out.println(t.getName()+":"+"��������");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
