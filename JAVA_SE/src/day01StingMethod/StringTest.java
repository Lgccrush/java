package day01StingMethod;

import java.util.Scanner;

/**
 * ��дһ������,Ҫ���û�����һ����վ��Ϣ
 * ��ʽ��������:
 * www.baidu.com
 * www.baidu.con.cn
 * http://www.baidu.com
 * Ȼ�󾭹�����,�������,��:baidu
 */
public class StringTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����վ");
		String string = scanner.nextLine();
		//��ȡ��һ��.֮��ĵ�һ���ַ���λ��
		int start = string.indexOf(".")+1;
		//��ȡ�ڶ����ַ���λ��
		int end = string.indexOf(".", start);
		String string2 = string.substring(start, end);
		System.out.println("������"+string2);
	}

}
