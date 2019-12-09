package day10;
/**
 * 静态方法的同步
 * 当一个静态方法被synchronize修饰后,
 * 那么该方法为同步方法
 * 用于静态方法所属类.全局就一份
 * 所以同步的静态方法就一定具有同步效果,与对象无关
 * @author L
 *
 */
public class SynDemo3 {
	public static void main(String[] args) {
		 Foo f1 = new Foo();
		 Foo f2 = new Foo();
		Thread t1 = new Thread(){
			public void run() {
				f2.dosome();//与对象无关
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
			System.out.println(t.getName()+":"+"正在执行dosome方法");
			t.sleep(5000);
			System.out.println(t.getName()+":"+"执行完毕");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}