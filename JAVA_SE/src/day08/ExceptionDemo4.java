package day08;
/**
 * 测试异常的抛出
 * @author L
 *
 */
public class ExceptionDemo4 {

	public static void main(String[] args) {
		 Person person = new Person();//创建person对象
		 /*
		  * 当调用一个含用throws声明的异常抛出的方法时,
		  * 编译器要求必须处理该异常
		  * 处理手段有两种
		  * 1:使用try-catch捕获并处理
		  * 2:在当前方法上继续使用throws声明
		  */
		
			try {
				person.setAge(20);
			} catch (IllegalAgeException e) {
				
				e.printStackTrace();
			}
		
		 System.out.println("年龄为"+person.getAge());
	}

}
