package day08;
/**
 * Exception常用方法
 * @author L
 *
 */
public class ExceptionDemo6 {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "abc";
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("程序结束了");
	}

}
