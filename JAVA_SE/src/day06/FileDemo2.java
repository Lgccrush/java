package day06;

import java.io.File;
import java.io.IOException;

/**
 * ����һ���ļ�
 * @author L
 *
 */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰĿ¼�´����ļ�test.txt
		 * Ĭ��·�����ǵ�ǰĿ¼��"./"���Կ��Բ�д
		 */
		File file = new File("test.txt");//�����ļ�
		/*
		 * boolean exists
		 * �жϸ��ļ��Ƿ����
		 */
		if (!file.exists()) {//�ж��ļ��Ƿ����
			file.createNewFile();
			System.out.println("�������");
		} else {
			System.out.println("���ļ��Ѵ���");
		}
		
		
		
	}

}
