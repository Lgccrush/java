package day08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * �ַ����Ķ�д��λΪ�ַ�.
 * �ַ������Ǹ߼���,��Ȼ���ַ�Ϊ��λ��ȡ����
 * ����ʵ�ʵײ㻹�Ƕ�ȡ�ֽ�,ֻ�Ǵ��ֽڵ��ַ���ת�������������ַ��������
 * java.io.Reader:�ַ��������ĸ���
 * java.io.writer:�ַ�������ĸ���
 * 
 * ת����
 * ֮���Գ�OutputStreamWriter��InputStreamReaderΪת����
 * ����Ϊ�󲿷��ַ���ֻ���������ַ���,���ͼ��������ֽ���,��͵����ַ������ܴ����ֽ���������
 * ת�����൱��һ��ת����������,���ǿ����Ƚ��ֽ���תΪ�ַ���,�����������ַ����Ϳ��Դ�����
 * java.io.OutputStreamWriter
 * �ַ������
 * �ص��ǿ��԰���ָ�����ַ���д�ַ�
 * @author L
 *
 */
public class OSWDemo {

	public static void main(String[] args) throws IOException {
		//�����ļ������
		FileOutputStream fos = new FileOutputStream("osw.txt");
		//�����ַ������,��ָ���ַ�����
		OutputStreamWriter writer = new OutputStreamWriter(fos,"utf-8");
		writer.write("�Ұ������찲��");//д������
		writer.write("�찲����̫����");
		writer.close();//����
		
	}

}
