package day01StingMethod;
/**
 * int indexOf(String str)
 * �÷���ʹ�������Ҹ����ַ����ڵ�ǰ�ַ����е�λ��
 * �÷����м������ط���
 * @author L
 *
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String string = "thinking in java";
		//����in��str�ַ����е�λ��,��û�з���-1
		int index = string.indexOf("in");
		System.out.println("index="+index);
		
		/*
		 * ���ط��������ָ��λ�ò���
		 */
		index = string.indexOf("in", 3);
		System.out.println("index="+index);
		
		/*
		 *�������һ�γ���ָ���ַ�����λ��
		 */
		index = string.lastIndexOf("in");
		System.out.println("index="+index);
	}

}
