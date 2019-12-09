package day07;

import java.io.Serializable;
import java.util.List;

/**
 * 该类用于测试对象流读写对象使用
 * 该类用于测试对象流读写对象使用
 * 当一个类要被对象流读写,那么该类必须实现java.Serializable接口
 * @author L
 *
 */
public class Person implements Serializable{
	/**
	 * 当一个类实现了serialazable接口后
	 * 应当添加一个常量serialVersionUID,
	 * 该常量为当前类的序列化版本号,若不定义系统会根据当前类的结构生成
	 * 但是只要类的结构发生改变,版本号也会发生相应的改变
	 * 
	 * 版本号影响着反序列化的结果.即
	 * 当ois对一个对象进行反序列化时,会检查该对象和类的属性是否一致
	 * 若一致:反序列化成功,但是该对象和类的结构不一致时,则采用兼容模式
	 * 能还原的都还原
	 * 若不一致:反序列化直接抛出版本不一致异常
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	/*
	 * transient关键字用来修饰属性,当被修饰后,该类实例使用
	 * oos进行序列化时,该属性会被忽略,从而达到对象"瘦身"的目的
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
