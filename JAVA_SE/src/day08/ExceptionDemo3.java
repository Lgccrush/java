package day08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * finally对于流的处理
 * @author L
 *
 */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("src/day08/ExceptionDemo3.java")));
			String str = null;
			while ((str=br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("出错了");
		}finally{
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

}
