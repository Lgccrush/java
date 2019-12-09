package day10;
/**
 * 同步块
 * 有效的缩小同步范围.可以保证并发安全的同时尽可能提供开发效率.
 * @author L
 *
 */
public class SynDemo2 {

	public static void main(String[] args) {
		final shop shop = new shop();//创建商店
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
		//获取线程名字
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":"+"正在挑衣服");
			
				t.sleep(5000);
				/**
				 * 同步块可以要求多个线程,对该块内的代码排队执行,
				 * 但是前提条件是同步监视器对象即(上锁的对象)
				 * 要求多个对象看到的必须是同一个
				 * 
				 * synchronize(同步监视器对象){
				 * 	  需要同步的代码
				 * }
				 * 所谓同步执行即:多个线程必须排队执行
				 * 所谓异步执行即:多个线程可以同时执行
				 */
			synchronized (this) {
				System.out.println(t.getName()+":"+"正在试衣服");
				t.sleep(5000);
			}
			
			
			System.out.println(t.getName()+":"+"结账走了");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
