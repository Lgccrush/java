package day01test;

/**
 * API��һ����ϰ
 * 
 * @author L
 *
 */
public class Test {

	public static void main(String[] args) {
		String string = "HelloWorld";
		// ����ַ���"HelloWorld"���ַ�������
		int leng = string.length();
		System.out.println("leng:" + leng);
		// ����ַ���"HelloWorld"��"O"��λ��
		int index = string.indexOf("o");
		System.out.println("index:" + index);
		// ����ַ���"HelloWorld"�д��±�5����ʼ��һ�γ���"O"��λ��
		int index1 = string.indexOf("o", 5);
		System.out.println("index1:" + index1);
		// ��ȡ�ַ���"HelloWorld"�е�"Hello"�����
		String sub = string.substring(0, 5);
		System.out.println("sub:" + sub);
		// ��ȡ�ַ���"HelloWorld"�е�"World"�����
		String sbu2 = string.substring(5);
		System.out.println("sub2:" + sbu2);
		// ���ַ���" Hello "�����߿հ�ȥ�������
		String string2 = "  Hello  ";
		String str1 = string2.trim();
		System.out.println("str1=" + str1);
		// ����ַ���"HelloWorld"�е������ַ�"W"
		char c = string.charAt(5);
		System.out.println("c:" + c);
		// ����ַ���"HelloWorld"�Ƿ�����"H"��ͷ��"ld"��β��
		boolean flag1 = string.startsWith("H");
		boolean flag2 = string.endsWith("ld");
		System.out.println("flag1:" + flag1);
		System.out.println("flag2:" + flag2);
		// ��"HelloWorld"�ֱ�ת��Ϊȫ��д��ȫСд�����
		String string3 = string.toUpperCase();
		String string4 = string.toLowerCase();
		System.out.println("string3:" + string3);
		System.out.println("string4:" + string4);
	}

}
