package day08;
/**
 * �����쳣���׳�
 * @author L
 *
 */
public class ExceptionDemo4 {

	public static void main(String[] args) {
		 Person person = new Person();//����person����
		 /*
		  * ������һ������throws�������쳣�׳��ķ���ʱ,
		  * ������Ҫ����봦����쳣
		  * �����ֶ�������
		  * 1:ʹ��try-catch���񲢴���
		  * 2:�ڵ�ǰ�����ϼ���ʹ��throws����
		  */
		
			try {
				person.setAge(20);
			} catch (IllegalAgeException e) {
				
				e.printStackTrace();
			}
		
		 System.out.println("����Ϊ"+person.getAge());
	}

}
