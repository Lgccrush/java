package day09;
/**
 * 获取线程相关信息的方法
 * @author L
 *
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		//获取运行main方法的线程
		Thread main = Thread.currentThread();
		//获取id
		long id = main.getId();
		System.out.println("ID:"+id);
		//获取名字
		String name = main.getName();
		System.out.println("线程的名字:"+name);
		//获取优先级
		int priority = main.getPriority();
		System.out.println("优先级:"+priority);
		
		boolean daemon = main.isDaemon();
		System.out.println("是否为守护线程:"+daemon);
		
		boolean alive = main.isAlive();
		System.out.println("是否存活:"+alive);
		
		boolean interrupted = main.isInterrupted();
		System.out.println("是否中断:"+interrupted);
	}

}
