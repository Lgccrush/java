package day02test;
/**
 * 这是Person类的练习
 * @author L
 *
 */
public class Person {
	private String name;//名字
	private int age;//年龄
	private int salary;//工资
	public Person() {
		super();
		
	}
	public Person(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj==null) {
			return false;
		}
		if (obj==this) {
			return true;
		}if (obj instanceof Person) {
			
			return ((Person) obj).name==this.name;
		}
		return false;
	}
	
	
}
