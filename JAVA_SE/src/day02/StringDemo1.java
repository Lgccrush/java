package day02;
/**
 * �ַ���֧��������ʽ������:
 * String[] split(String regex)
 * ����ǰ�ַ�����������������ʽ�Ĳ��ֽ��в��
 * ���ز�ֺ��ÿ������
 * @author L
 *
 */
public class StringDemo1 {

	public static void main(String[] args) {
		//�������ֲ��,�������е�Ӣ����ĸ����
		String str = "abc123def456ghi789jkl";
		String regex = "[0-9]+";//��������������ʽ
//		String regex = "[0-9]";//û��+���г����ַ���
		String[] split = str .split(regex);//�з�Ŀ���ַ������ֲ���
		System.out.println(split.length);
		for (int i = 0; i < split.length; i++) {//����
			System.out.println(split[i]);
		}
	}

}
