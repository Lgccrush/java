package day02;
/**
 * ͼƬ������
 * @author L
 *
 */
public class Test2 {

	public static void main(String[] args) {
		String imgName = "1.png";//ԭͼ
		String regex = "\\.";//�и�.
		String[] name = imgName.split(regex);
		imgName = System.currentTimeMillis()+"."+name[1];//ƴ��
		System.out.println(imgName);
	}

}
