package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 对象流
 * 对象流是一对高级流,作用是方便读写java中的对象
 * java.io.ObjectOutputStream
 * 对象输出流.可以将给定对象转换为一组字节后写出
 * 
 * 
 * @author L
 *
 */
public class OOSDemo {

	public static void main(String[] args) throws IOException {
		//创建person对象
		Person p = new Person();
		//设置属性
		p.setName("小白");
		p.setAge(25);
		p.setGender("男");
		List<String> otherInFo =new ArrayList<String>();
		otherInFo.add("坚持下去");
		otherInFo.add("坚持下去");
		otherInFo.add("坚持下去");
		p.setOtherInfo(otherInFo);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * objcetOutputStream的writeObjcet方法可以将
		 * 给定对象转为一组字节写出,这些字节比该对象的实际内容要大,
		 * 因为除了数据还有结构等描述信息
		 * 
		 * 下面的代码实际上经历了两个操作:
		 * 1:oos将person对象转换为一组字节,
		 * 将一个对象转换为一个字节的操作称为:对象序列化
		 * 2:再通过fos将这组字节写到硬盘中,
		 * 将该对象转换为字节并写入硬盘做长久保存的过程称为:对象持久化
		 */
		oos.writeObject(p);
		System.out.println("写出完毕");
		oos.close();
		
	}

}
