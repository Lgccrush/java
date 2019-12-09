package day09;
/**
 * static Thread currentThread()
 * 获取运行当前方法的线程
 * @author L
 *
 */
public class ThreadDemo4 {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程是:"+main);
		
		dosome();
		Thread t = new Thread(){
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("运行自定义线程的方法是:"+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("运行dosome方法的线程是:"+t);
	}

}
