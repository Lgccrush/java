package day02;
/**
 * �ַ���֧��������ʽ�ķ���һ:
 * boolean matches(String regex)
 * ���ݸ�����������ʽ��֤��ǰ�ַ����Ƿ������ʽҪ��
 * ���㷵��true,���򷵻�false
 * 
 * @author L
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		
		/*
		 * ���������������ʽ:
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z0-9_]+)+
		 */
		String str ="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)+";
		String email = "heima@qq.com";
		boolean b = email.matches(str);
		if (b) {
			System.out.println("������");
		} else {
			System.out.println("��������");
		}
	}

}
