package day01StingMethod;
/**
 * boolean stratWhith(String str)
 * boolean endWhith(String str)
 * �жϵ�ǰ�ַ����Ƿ���ָ���ַ�����ʼ���߽�β��
 * @author L
 *
 */
public class StringDemo6 {

	public static void main(String[] args) {
		String string = "thinking in java";
		boolean b1 = string.startsWith("t");
		boolean b = string.endsWith("va");
		System.out.println(b);
		System.out.println(b1);
	}

}
