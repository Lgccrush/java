package day09;
/**
 * 第二种创建线程的方式
 * 实现Runnable接口并重写run方法
 * @author L
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		//单独创建任务
		Runnable r1 = new Myrunnable1();
		Runnable r2 = new Myrunnable2();
		//创建线程
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//调用start方法
		t1.start();
		t2.start();
	}

}

class Myrunnable1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("你是谁啊");
		}
	}
	
	
}
class Myrunnable2 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是查水表的");
		}
	}
	
	
}
