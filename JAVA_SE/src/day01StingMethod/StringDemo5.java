package day01StingMethod;
/**
 * char charAt(int index)
 * ��ȡ��ǰ�ַ���ָ���±��Ӧ���ַ�
 * @author L
 *
 */
public class StringDemo5 {

	public static void main(String[] args) {
		String string = "thinking in java";
		//���ҵ�����ַ���ʲô
		char c = string.charAt(4);
		System.out.println("������ַ���"+c);
		
		/*
		 * ���һ���ַ����Ƿ�Ϊ����(������������һ��)
		 */
		String string2 = "�Ϻ�����ˮ���Ժ���";
		for (int i = 0; i < string2.length()/2; i++) {
			if (string2.charAt(i)!=string2.charAt(string2.length()-i-1)) {
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");
		
	}

}
