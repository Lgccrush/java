package day04;
/**
 * ���͵�ԭ����Object
 * ���巺�����Ǳ���������һЩУ�鹤��
 * �����ǶԷ�����������ֵ��,ȥ����Ƿ���������Ҫ��
 * �����ǻ��һ���������͵�ֵ��,���Զ���������ת��
 * @author L
 *
 */
public class PointTest2 {

	public static void main(String[] args) {
		/*
		 * ����ָ�����͵�ʵ������ΪInteger
		 * ��ʵ����,������Point������,x,y������Object����
		 * ����ֻ��Ӧ����������Integer����
		 */
		Point<Integer> p1 = new Point<Integer>(1, 2);
		/*
		 * ���ڲ�����T,�������֤ʵ���Ƿ�ΪInteger
		 *�粻��,����ʧ��
		 *���Դ����������,��Ϊ�����Զ�װ�� 
		 */
		p1.setX(1);
		/*
		 * ��ȡʱ,Ҳ���Զ�װ��,����������ʾ�Ľ�������ת��
		 */
		int x1 = p1.getX();
		/*
		 * ����ָ������,��ʹ��Ĭ�ϵ�Object����
		 */
		Point p2 = p1;//p1�ѵ�ַ��ֵ��p2
		p2.setX("һ");
		String x2 = (String)p2.getX();//X��ǿתΪString����
		System.out.println("x2:"+x2);
		//��ת���쳣
		x1 = p1.getX();
		System.out.println("x1:"+x1);
	}

}
