package day02;
/**
 * 使用replaceAll实现图片重命名
 * @author L
 *
 */
public class Test1 {

	public static void main(String[] args) {
		String imgname = "1.png";
		imgname = imgname.replaceAll(".+\\.", System.currentTimeMillis()+".");//替换
		System.out.println(imgname);
	}

}
