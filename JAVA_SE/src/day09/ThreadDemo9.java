package day09;
/*
 * void join()
 * join方法可以使调用该方法的进程进入阻塞状态,
 * 直到该方法所属进程完成工作才会解除调用该方法线程的阻塞状态,
 * jion方法一般用来完成多个线程之间同步工作问题
 */
public class ThreadDemo9 {
	//表示图片是否下载完毕
	public static boolean isFinish = false;
	public static void main(String[] args) {
		Thread download = new Thread(){
			public void run() {
				System.out.println("开始下载图片");
				for (int i = 0; i <= 100; i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				System.out.println("down:图片下载成功");
				isFinish = true;
			}
		};
		Thread show = new Thread(){
			public void run() {
				System.out.println("开始显示图片");
				/**
				 * 先等待download把图片下载完毕
				 */
				try {
					download.join();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				if (!isFinish) {
					throw new RuntimeException("图片没有下载完毕");
				}
				System.out.println("show:图片显示完毕");
			}
		};
		
		download.start();
		show.start();
	}

}
