package day05;

/**
 * ��������תΪ���ϵ�Ԫ��
 * 
 * @author L
 *
 */
public class Point implements Comparable<Point> {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;

		}
		if (obj == this) {
			return true;
		}
		if (obj instanceof Point) {
			Point p = (Point) obj;
			return p.x == this.x && p.y == this.y;
		}
		return false;
	}

	/**
	 * ��ʵ����Comparable�ӿ�,Ҫ����д����ķ��� �÷����������Ƕ��嵱ǰ�������������Ƚϴ�С�Ĺ���
	 * ����ֵ��һ��intֵ,��ֵ��ʾ��С��ϵ,������ע�����ֵ�Ƕ���,��עȡֵ��Χ ������ֵ>0ʱ,��ǰ����Ȳ��������
	 * ������ֵ<0ʱ,��ǰ����Ȳ�������С ������ֵ=0ʱ,�����������
	 */
	public int compareTo(Point o) {
		/*
		 * �ȽϹ���,�㵽ԭ��ľ���
		 */
		int len = this.x * this.x + this.y * this.y;
		int olen = o.x * o.x + o.y * o.y;
		return len - olen;
	}

}
