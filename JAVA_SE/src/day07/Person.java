package day07;

import java.io.Serializable;
import java.util.List;

/**
 * �������ڲ��Զ�������д����ʹ��
 * �������ڲ��Զ�������д����ʹ��
 * ��һ����Ҫ����������д,��ô�������ʵ��java.Serializable�ӿ�
 * @author L
 *
 */
public class Person implements Serializable{
	/**
	 * ��һ����ʵ����serialazable�ӿں�
	 * Ӧ�����һ������serialVersionUID,
	 * �ó���Ϊ��ǰ������л��汾��,��������ϵͳ����ݵ�ǰ��Ľṹ����
	 * ����ֻҪ��Ľṹ�����ı�,�汾��Ҳ�ᷢ����Ӧ�ĸı�
	 * 
	 * �汾��Ӱ���ŷ����л��Ľ��.��
	 * ��ois��һ��������з����л�ʱ,����ö������������Ƿ�һ��
	 * ��һ��:�����л��ɹ�,���Ǹö������Ľṹ��һ��ʱ,����ü���ģʽ
	 * �ܻ�ԭ�Ķ���ԭ
	 * ����һ��:�����л�ֱ���׳��汾��һ���쳣
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * transient�ؼ���������������,�������κ�,����ʵ��ʹ��
	 * oos�������л�ʱ,�����Իᱻ����,�Ӷ��ﵽ����"����"��Ŀ��
	 */
	private transient List<String> otherInfo;

	public Person() {
		super();

	}

	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + gender + ", " + otherInfo;
	}

}
