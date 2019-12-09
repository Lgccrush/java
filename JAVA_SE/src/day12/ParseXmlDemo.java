package day12;
/**
 * 使用DOM解析xml文档
 * @author L
 *
 */
public class ParseXmlDemo {

	public static void main(String[] args) {
		/*
		 * 解析emplist.xml文档,将所有的员工信息读取出来并
		 * 转换为若干Emp实例,存入一个list集合中.
		 * 
		 * 解析XML的流程:
		 * 1:创建SAXReader
		 * 2:使用SAXReader读取XML文档并返回Document对象,
		 * 这一步就是DOM解析耗时耗资源的体现,因为DOM会将XML文档全部读取
		 * 并以一个Document对象形式存入内存,
		 * 3:Document对象获取根目录
		 * 4:按照xml的结构从根元素中开始逐级获取子元素以达到遍历xml的目的
		 */
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
