package day02;
/**
 * �ַ���֧��������ʽ������:
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���
 * @author L
 *
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String str = "abc123def456ghi789jkl";
		//�����ֲ����滻Ϊ#NUMBER#
		String str2 = str.replaceAll("[\\d]", "#NUMBER#");//�滻
		System.out.println(str2);
	}

}
