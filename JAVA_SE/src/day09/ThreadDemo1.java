package day09;
/**
 * 第一种创建线程的方式
 * 继承Thread并重写run方法来定义线程要执行的任务 
 * 
 * 这种方式创建 线程有两点不足
 * 1:由于java是单继承.那么继承Thread就无法继承其他类
 * 2:由于继承Thread要重写run方法规定了线程要执行任务,
 * 这导致线程和任务有一个必然的耦合型关系.不利于线程的重用
 * @author L
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {
		//创建线程
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		/**
		 * 启动线程调用start方法,而不是run方法.
		 * run方法是线程执行的任务,当线程start方法被调用后
		 * 线程进入runnable状态,一旦获取CPU时间
		 * run方法会自动被调用
		 */
		 //调用start方法
		t1.start();
		t2.start();
	}

}
//继承Tread
class MyThread1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("你是谁啊?");
		}
	}
	
	
}
class MyThread2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是查水表的");
		}
	}
	
	
}
