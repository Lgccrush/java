package day02;
/**
 * ��г����
 * @author L
 *
 */
public class Test3 {

	public static void main(String[] args) {
		String regex = "(nc|fw)";//���ִ��������г
		String string = "���nc,���fw";
		String replaceAll = string .replaceAll(regex, "****");//��*�滻
		System.out.println(replaceAll);
		
		
	}

}
