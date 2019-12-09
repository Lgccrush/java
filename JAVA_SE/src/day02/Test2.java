package day02;
/**
 * 图片重命名
 * @author L
 *
 */
public class Test2 {

	public static void main(String[] args) {
		String imgName = "1.png";//原图
		String regex = "\\.";//切割.
		String[] name = imgName.split(regex);
		imgName = System.currentTimeMillis()+"."+name[1];//拼接
		System.out.println(imgName);
	}

}
