package day02;
/**
 * ʹ��replaceAllʵ��ͼƬ������
 * @author L
 *
 */
public class Test1 {

	public static void main(String[] args) {
		String imgname = "1.png";
		imgname = imgname.replaceAll(".+\\.", System.currentTimeMillis()+".");//�滻
		System.out.println(imgname);
	}

}
