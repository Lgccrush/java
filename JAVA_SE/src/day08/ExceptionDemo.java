package day08;
/**
 * finally��
 * finally�鶨�����쳣������Ƶ����
 * ����ֱ�Ӹ���try��֮��������һ��catch��֮��
 * finally���еĴ���һ��ִ��,����try���еĴ����Ƿ��׳��쳣
 * ����ͨ������ͷ���Դ�Ȳ�������finally��,����ر���
 * @author L
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "";
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("���������");
		}finally{
			System.out.println("finally�Ĵ����ִ����");
		}
		
		System.out.println("���������");
	}

}
