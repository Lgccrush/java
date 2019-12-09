package day02;

/**
 * 使用该类来测试object相关方法重写 该类的每个实例表示直角坐标上的一个点
 * 
 * @author L
 *
 */
public class Point {

	private int x;// 定义X坐标
	private int y;// 定义Y坐标

	public void setx(int x) {
		this.x = x;
	}

	public int getx() {
		return this.x;
	}

	public void sety(int y) {
		this.y = y;
	}

	public int gety() {
		return this.y;
	}

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * 通常我们要使用一个类的toString方法是 就应当重写该方法 Object自身的toString方法返回的是 类名@地址 对我们没什么意义
	 * 将来可以根据需求而定,重写该方法
	 * 
	 * @return
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	/*
	 * @Override public String toString() { return "Point [x=" + x + ", y=" + y
	 * + "]"; }
	 */

	/*
	 * 通常我们需要使用一个类的equals方法时 就应当重写它 equals方法的作用是比较当前对象与给定对象内容是否一样
	 * Object提供的equals方法内部就是用"=="实现的,没有意义 所以根据实际需求而定
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return this.x == p.x && this.y == p.y;
		}
		return false;
	}

}
