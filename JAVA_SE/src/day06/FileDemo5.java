package day06;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author L
 *
 */
public class FileDemo5 {

	public static void main(String[] args) {
		//��ȡfile����
		File dir = new File("a"+File.separator+"b"+File.separator+"c"+File.separator+"d"+File.separator+"e"+File.separator+"f");
		/*
		 * �ڴ�����ǰĿ¼��ͬʱ�Ὣ�����ڵ�Ŀ¼һ�𴴽�����
		 */
		//�����༶Ŀ¼
		if (!dir.exists()) {
			System.out.println("����Ŀ¼");
			dir.mkdirs();
		} else {
			System.out.println("��Ŀ¼�Ѵ���");
		}
	}

}
