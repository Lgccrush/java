package day09;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 使用匿名内部类的方式来完成方式一方式二的线程的创建
 * @author L
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		//使用匿名内部类创建线程
		Thread t1 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("你是谁啊");
				}
			}
		};
	/*	Thread t2 = new Thread(){
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("我是查水表的");
				}
			}
		};*/
		t1.start();//调用start方法
//		t2.start();
		//使用匿名内部类创建线程2
		Runnable r1 = new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("我是查水表的");
				}
			}
		};
		Thread t2 = new Thread(r1);
		t2.start();//调用start方法
		
		new Thread( new Runnable() {
			public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("这是以后的写法");
			}	
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("要努力");
				}
			}
		}).start();
	}

}
