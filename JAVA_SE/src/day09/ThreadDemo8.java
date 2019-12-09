package day09;
/**
 * 守护线程,又称为后台线程
 * 当一个进程中所有的前台线程都结束时,进程就要结束,若还有后台线程,
 * 那么后台线程会被强转结束
 * @author L
 *
 */
public class ThreadDemo8 {

	public static void main(String[] args) {
		//rose:前台线程
		Thread rose = new Thread(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				System.out.println("啊啊啊啊啊啊啊AAAaaaaaa");
				System.out.println("音效:噗通...");
			}
		};
		
		Thread jake = new Thread(){
			public void run() {
				while (true) {
					System.out.println("you jum! I jum");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		};
		//设置Jake为守护线程.要在start前调用
		jake.setDaemon(true);
		rose.start();
		jake.start();
		/*
		 * 不是main结束就结束
		 * main方法是前台线程 只要有前台线程活着 后台线程就活着
		 */
		while(true);
	}

}
