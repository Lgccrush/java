package day02;

/**
 * ʹ�ø���������object��ط�����д �����ÿ��ʵ����ʾֱ�������ϵ�һ����
 * 
 * @author L
 *
 */
public class Point {

	private int x;// ����X����
	private int y;// ����Y����

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
	 * ͨ������Ҫʹ��һ�����toString������ ��Ӧ����д�÷��� Object�����toString�������ص��� ����@��ַ ������ûʲô����
	 * �������Ը����������,��д�÷���
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
	 * ͨ��������Ҫʹ��һ�����equals����ʱ ��Ӧ����д�� equals�����������ǱȽϵ�ǰ������������������Ƿ�һ��
	 * Object�ṩ��equals�����ڲ�������"=="ʵ�ֵ�,û������ ���Ը���ʵ���������
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
