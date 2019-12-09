package day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池主要有两个作用:
 * 1:重用线程
 * 2:控制线程数量
 * 当我们的应用需要创建大量线程或者分析线程会频繁创建和销毁时,
 * 应当考虑使用线程池来维护线程
 * @author L
 *
 */
public class ThreadPlooDemo1 {

	public static void main(String[] args) {
		//创建线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			Runnable runn = new Runnable() {
				public void run() {
					Thread t = Thread.currentThread();
				try {
					System.out.println(t.getName()+"正在运行任务");	
					Thread.sleep(5000);
					System.out.println(t.getName()+"运行任务结束");
				} catch (Exception e) {
					System.out.println("线程被中断了");//抛出被中断异常
				}
				}
			};
			threadPool.execute(runn);//线程池运行任务
		}
		
		System.out.println("指派了一个任务给线程池");
		threadPool.shutdownNow();//马上中断正在运行的线程
//		threadPool.shutdown();//中断线程池,线程池会完成任务后停止运行
		System.out.println("中断线程任务");
	}

}
