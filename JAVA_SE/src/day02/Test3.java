package day02;
/**
 * 和谐用语
 * @author L
 *
 */
public class Test3 {

	public static void main(String[] args) {
		String regex = "(nc|fw)";//出现此类用语和谐
		String string = "你个nc,你个fw";
		String replaceAll = string .replaceAll(regex, "****");//用*替换
		System.out.println(replaceAll);
		
		
	}

}
