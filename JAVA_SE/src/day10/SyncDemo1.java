package day10;
/**
 * 多线程并发访问一个线程时,就会形成"抢"的现象,由于线程切换时机不确定,
 * 可能导致执行代码的混乱,严重时会导致系统瘫痪
 * @author L
 *
 */
public class SyncDemo1 {

	public static void main(String[] args) {
		Table table = new Table();//创建桌子对象
		//创建线程1
		Thread t1 = new Thread(){
			public void run() {
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		//创建线程2
		Thread t2 = new Thread(){
			public void run() {
				while (true) {
					int bean = table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}

}

class Table{
	private int beans = 20;
	/*
	 * 加锁synchronized
	 * 当一个方法被synchronize修饰后,该方法为同步方法,即:多个方法不能同时进入方法内部执行,
	 * 对于成员方法而言,synchronize会在一个线程调用该方法时将该方法所属对象加锁,其他线程在执行该方法时,
	 * 由于执行方法的线程没有释放锁,所以只能在方法外阻塞,直到持有方法锁的线程将方法执行完毕,
	 * 所以,解决多线程并发执行安全问题的办法就是将"抢"变为"排队"
	 */
	public synchronized int  getBean() {
		if (beans==0) {
			throw new RuntimeException("没有豆子了");
		}
		Thread.yield();
		return beans--;
	}
}
