package day08;
/**
 * java异常捕获中的try-catch
 * try块是用来扩上可能出错的代码
 * catch块是用来捕获try块中代码抛出的错误,并解决
 * @author L
 *
 */
public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try {
			String str = "a";
			/*
			 * JVM在执行代码的过程中如果发现了异常
			 * 则会实例化这种情况的异常实例,并将代码整个执行过程完整设置到异常中来表示该错误报告
			 * 设置完毕将该异常抛出
			 * 若抛出异常的代码有被try包围,
			 * 这jvm会检查catch中是否有关注该异常,
			 * 关注则交给catch并解决
			 * 否则会将该异常抛出到当前方法外,
			 * 由调用当前方法的代码解决该代码
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
		} catch (NullPointerException e) {
			
			System.out.println("出现了空指针异常");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界了");
		}catch (Exception e) {
		System.out.println("反正就是出了错");
		}
		/*
		 * 应当养成一个好习惯
		 * 在最后一个catch中捕获exception
		 * 避免因未捕获异常导致程序中断,
		 * 当多个catch捕获不同异常时,这些异常存在继承关系
		 * 那么子类异常在上先行捕获.父类异常在下
		 */
		
		
		System.out.println("程序结束了");
	}

}
