package day08;
/**
 * finally块
 * finally块定义在异常捕获机制的最后
 * 可以直接跟在try块之后或者最后一个catch块之后
 * finally块中的代码一定执行,无论try块中的代码是否抛出异常
 * 所以通常会吧释放资源等操作放在finally中,列如关闭流
 * @author L
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str = "";
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("程序出错了");
		}finally{
			System.out.println("finally的代码块执行了");
		}
		
		System.out.println("程序结束了");
	}

}
