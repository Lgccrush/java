package day02;
/**
 *��֤�ֻ������������ʽ 
 * @author L
 *
 */
public class StringDemo2 {

	public static void main(String[] args) {
		//�����ֻ�������ʽ
		String regex ="[1]{1}[873]{1}[\\d]{9}";
		//��֤�ֻ�����
		String num = "13540493165";
		boolean flag = num.matches(regex);
		if (flag) {
			System.out.println("���ֻ�����");
		} else {
			System.out.println("�����ֻ�����");
		}
		/*
		 * Ҫ���û�����һ���ֻ�����
		 * Ȼ�󾭹���֤�Ƿ����ֻ�����
		 */
		
	}

}
