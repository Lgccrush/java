package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.BufferdInputStrean
 * java.io.BufferdOutputStream
 * �����ֽ�������������ԶԸ߼���,ʹ�����ǿ��Լӿ��дЧ��
 * 
 * �߼������Դ���������,������������˶��ٸ߼���,����¶�Ҫ�еͼ���,��Ϊ�ͼ���������ʵ��д���ݵ���
 * �߼������Ǵ������ݵ�,�߼����������������γ�����������,
 * ������Ч����ϲ�ͬ�ĸ߼������Եõ�����Ч��
 * @author L
 *
 */
public class CopyDemo2 {

	public static void main(String[] args) throws IOException {
		//�����ͼ���
		FileInputStream fis = new FileInputStream("demo1.txt");
		//װ�ϸ߼���
		BufferedInputStream bis = new BufferedInputStream(fis);
		//���������
		FileOutputStream fos = new FileOutputStream("demo2.txt");
		//װ�ϸ߼���
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = -1;
		/*
		 * �������ڲ���һ��������
		 * ��bis.read������ȡ��һ���ֽڵ�ʱ��,
		 * ʵ����BIS��һ���Զ�ȡһ���ֽڲ������ڲ��ֽ�������
		 * Ȼ�󽫵�һ���ֽڷ���,���ٴε���read����ʱ,BISֱ�Ӵ��ֽ������н��ڶ����ֽڷ���
		 * ֱ�������ֽ������������ֽ�ȫ�����غ�,�Ż��ٴζ�ȡһ���ֽ�,
		 * ���Ի�����Ҳ���������һ�ζ�д�����������ٶ�д���������Ч�ʵ�
		 */
		while ((len=bis.read())!=-1) {//��д����
			bos.write(len);
		}
		bis.close();
		bos.close();
	}

}
