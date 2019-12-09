package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 从字符串转换为Date
 * parse方法将字符串按照SimpleDateFormate指定时间格式解析为Date对象
 * @author L
 *
 */
public class SimpleDateFormatDemo1 {

	public static void main(String[] args) throws ParseException {
		String string = "2019-9-10 20:28:20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//定义格式
		Date date = sdf.parse(string);//转换为字符串
		System.out.println(date);
		
		
	}

}
