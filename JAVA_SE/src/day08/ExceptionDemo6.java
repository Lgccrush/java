package day08;
/**
 * Exception���÷���
 * @author L
 *
 */
public class ExceptionDemo6 {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str = "abc";
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("���������");
	}

}
