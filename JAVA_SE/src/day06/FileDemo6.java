package day06;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * delete��������ɾ��һ��Ŀ¼,����ǰ���Ǹ�Ŀ¼��һ����Ŀ¼
 * @author L
 *
 */
public class FileDemo6 {

	public static void main(String[] args) {
		File dir  = new File("a"+File.separator+"b");
		if (!dir.exists()) {
//			System.out.println("ɾ��Ŀ¼");
			dir.mkdirs();
		}
	}

}
