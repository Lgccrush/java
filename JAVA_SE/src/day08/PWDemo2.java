package day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * PrintWriterҲ�ṩ�˿��Դ����������ķ���
 * �ṩ�ķ������Դ����ֽ���,Ҳ���Գ����ַ���
 * ��ʹ�����๹�췽����,�����ٴ���ڶ�������,
 * �ò���Ϊbooleanֵ,��ֵΪtrueʱ
 * ������Զ���ˢ�¹���
 * @author L
 *
 */
public class PWDemo2 {

	public static void main(String[] args) throws IOException {
		//�����ֽ������
		FileOutputStream fos = new FileOutputStream("pw1.txt");
		//����ת����
		OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
		//�����ַ���
		PrintWriter pw = new PrintWriter(osw);
		pw.print("�Ǻ�");
		pw.print("����");
		System.out.println("д�����");
		pw.close();
	}

}
