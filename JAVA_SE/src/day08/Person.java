package day08;
/**
 * ��������throw��throws
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
/**
 * ��һ��������throw�׳��쳣ʱ
 * ��Ҫ�ڸ÷�����ʹ��throws���������쳣���׳���֪ͨ�����߽��
 * ֻҪRuntimeException���������쳣ʹ��throw�׳��ǲ�ǿ��Ҫ��
 * ����ʹ��throws����  �����쳣����ǿ��Ҫ���
 * ������벻ͨ��
 * @param age
 * @throws Exception
 */
	public void setAge(int age) throws IllegalAgeException{
		if (age<0||age>100) {
			throw new IllegalAgeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
	
	
}
