package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ַ���ת��ΪDate
 * parse�������ַ�������SimpleDateFormateָ��ʱ���ʽ����ΪDate����
 * @author L
 *
 */
public class SimpleDateFormatDemo1 {

	public static void main(String[] args) throws ParseException {
		String string = "2019-9-10 20:28:20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�����ʽ
		Date date = sdf.parse(string);//ת��Ϊ�ַ���
		System.out.println(date);
		
		
	}

}
