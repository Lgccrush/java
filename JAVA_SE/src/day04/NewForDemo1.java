package day04;

/**
 * JDK5.0֮���Ƴ���һ�������� ��ǿforѭ��,�ֽ�����ѭ��,for each ��ѭ�����������ͳѭ��,���ý��������������Ϻ������
 * 
 * @author L
 *
 */
public class NewForDemo1 {

	public static void main(String[] args) {
		String[] array = { "one", "tow", "three", "four" };// �����ַ�������
		for (int i = 0; i < array.length; i++) {// ��ͳѭ������
			System.out.println(array[i]);
		}
		for (String str : array) {// ��ѭ������
			System.out.println(str);
		}
	}

}
