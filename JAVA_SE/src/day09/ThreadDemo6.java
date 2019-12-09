package day09;
/**
 * 线程优先级
 * 线程的时间片分配完全听线程调度的,线程只能被动的分配时间,
 * 对于线程调度的工作不能干预,
 * 但是可以通过提高线程的优先级来达到尽可能干预的目的,
 * 理论上,优先级越高的线程,获取CPU时间片的次数就越多
 * @author L
 *
 */
public class ThreadDemo6 {

	public static void main(String[] args) {
		//创建3个线程
		Thread min = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					
					System.out.println("min");
				}
			}
		};
		
		Thread norm = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					
					System.out.println("nor");
				}
			}
		};
		
		Thread max = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					
					System.out.println("max");
				}
			}
		};
		//设置优先级
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		//调用start方法
		max.start();
		min.start();
		norm.start();
	}

}
