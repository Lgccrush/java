package day02test;

import java.util.Scanner;

/**
 * API �ڶ�����ϰ
 * 
 * @author L
 *
 */
public class Test2 {

	public static void main(String[] args) {
		/*
		 * ���һ���ַ���,Ȼ�������ַ�����һ������,��ת��Ϊ�������������10��Ľ�� ����С��,��ת��Ϊһ��С���������5��Ľ��
		 * ��������������������� ��Ҫ��������ʽ�����ж�
		 */
		Scanner scanner = new Scanner(System.in);//����¼��
		System.out.println("��������");//��ʾ��
		String line = scanner.nextLine();//���ܼ���¼��
		String intRegex = "[0-9]+";//��������������ʽ
		String douRegex2 = "[0-9]+\\.[0-9]+";//����С��������ʽ
		if (line.matches(intRegex)) {//ƥ������
			System.out.println("���������" + line + ",����10������"
					+ Integer.parseInt(line) * 10);
		} else if (line.matches(douRegex2)) {//ƥ��С��
			System.out.println("���������" + line + ",����5������"
					+ Double.parseDouble(line) * 5);
		} else {
			System.out.println("������Ĳ�������");
		}

		//���ַ���"123,456,789,012"����","���,�������ֺ��ÿһ��
		String string = "123,456,789,012";
		String regex = "[,]";//����������ʽ
		String[] strings = string.split(regex);//�и��ַ���
		for (int i = 0; i < strings.length; i++) {//�����ַ���
			System.out.println(strings[i]);//���
			
		}
		
		//���ַ���"123abc456def789ghi"�е�Ӣ����ĸ�����滻Ϊ"#char#"
		String string2 = "123abc456def789ghi";//�����ַ���
		String regex1 = "[a-z]+";//����������ʽ
		String string3 = string2.replaceAll(regex1, "#char#");//�滻
		System.out.println("string3:"+string3);
		
	}
}