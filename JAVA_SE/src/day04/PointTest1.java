package day04;

public class PointTest1 {

	public static void main(String[] args) {
		Point<Integer> p1 = new Point<Integer>(1, 2);
		p1.setX(2);
		p1.getX();
		System.out.println(p1);
		
		Point<Double> p2 = new Point<Double>(1.1, 2.2);
		p2.setX(2.1);
		p2.getX();
		System.out.println(p2);
		
		Point<String> p3 = new Point<String>("Ò»", "¶þ");
		p3.setX("ËÄ");
		p3.getX();
		System.out.println(p3);
	}

}
