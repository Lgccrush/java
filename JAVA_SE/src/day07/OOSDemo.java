package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * ��������һ�Ը߼���,�����Ƿ����дjava�еĶ���
 * java.io.ObjectOutputStream
 * ���������.���Խ���������ת��Ϊһ���ֽں�д��
 * 
 * 
 * @author L
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {
		//����person����
		Person p = new Person();
		//��������
		p.setName("С��");
		p.setAge(25);
		p.setGender("��");
		List<String> otherInFo =new ArrayList<String>();
		otherInFo.add("�����ȥ");
		otherInFo.add("�����ȥ");
		otherInFo.add("�����ȥ");
		p.setOtherInfo(otherInFo);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * objcetOutputStream��writeObjcet�������Խ�
		 * ��������תΪһ���ֽ�д��,��Щ�ֽڱȸö����ʵ������Ҫ��,
		 * ��Ϊ�������ݻ��нṹ��������Ϣ
		 * 
		 * ����Ĵ���ʵ���Ͼ�������������:
		 * 1:oos��person����ת��Ϊһ���ֽ�,
		 * ��һ������ת��Ϊһ���ֽڵĲ�����Ϊ:�������л�
		 * 2:��ͨ��fos�������ֽ�д��Ӳ����,
		 * ���ö���ת��Ϊ�ֽڲ�д��Ӳ�������ñ���Ĺ��̳�Ϊ:����־û�
		 */
		oos.writeObject(p);
		System.out.println("д�����");
		oos.close();
		
	}

}
