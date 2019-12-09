package day01StingMethod;


/*
 * String substring(int strat,int end)
 * 截取字符串,从指定位置(start)开始截取到指定的位置(end)
 * java API有一个特点,通常用两个数字表示范围时,都是包含头不包含尾的
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String str = "thinking in java";
		//截取ing
		String str2 = str.substring(5,8);
		System.out.println("str2="+str2);
		
		String host = "www.tedu.cn";
		String sub=host.substring(4, 8);
		System.out.println("sub="+sub);
		/*
		 * 如只串入一个参数,是从指定位置开始截取到字符串末尾
		 */
		String sub2 = host.substring(4);
		
	}

}
