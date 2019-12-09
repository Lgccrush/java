package day10;
/**
 * 互斥锁
 * synchronize也叫互斥锁
 * 即:使用synchronize修饰多段代码,只要他们同步监视对象相同,
 * 那么这几段代码就是互斥关系,
 * 即:多线程不能同时执行这行代码
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
			System.out.println(t.getName()+":"+"正在执行A方法");
			t.sleep(5000);
			System.out.println(t.getName()+":"+"执行A方法结束");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public synchronized void B() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":"+"正在执行B方法");
			t.sleep(5000);
			System.out.println(t.getName()+":"+"执行B方法结束");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
