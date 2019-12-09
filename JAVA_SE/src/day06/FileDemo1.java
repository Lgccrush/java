package day06;

import java.io.File;

/**
 * java.io.File
 * File��ÿһ��ʵ�����Ա�ʾ�ļ�ϵͳ���ļ���Ŀ¼
 * ʹ��File����:
 * 1:�����ļ���Ŀ¼������(��:��С,����,�޸�ʱ���)
 * 2:�����ļ���Ŀ¼(����,ɾ���ļ���Ŀ¼)
 * 3:����Ŀ¼����������
 * ���ǲ�����:�����ļ�����
 * @author L
 *
 */
public class FileDemo1 {

	public static void main(String[] args) {
		File file = new File("."+File.separator+"demo.txt");//����file����
		//��ȡ����
		String name = file.getName();
		System.out.println(name);
		//��ȡ����
		long leng = file.length();
		System.out.println(leng);
		//�ж��Ƿ�ɶ� ��д
		boolean canRand =file.canRead();
		boolean canWite = file.canWrite();
		System.out.println(canRand);
		System.out.println(canWite);
		//�ж��Ƿ�����
		boolean isHidden = file.isHidden();
		System.out.println(isHidden);
		
	}

}
