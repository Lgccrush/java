package day07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * java.io.ObjectInputStream ����������,�����ǿ��Խ��ж������л� ��ȡһ���ֽڲ���ԭΪ����
 * OIS��ȡ���ֽڱ�������OOS���������л��õ����ֽ�,��������쳣
 * 
 * @author L
 *
 */
public class OISDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		FileInputStream fis = new FileInputStream("person.obj");// �����ļ�������

		ObjectInputStream ois = new ObjectInputStream(fis);// ��������������

		System.out.println(ois.readObject());// �����ļ� �������л�

		ois.close();
	}

}
