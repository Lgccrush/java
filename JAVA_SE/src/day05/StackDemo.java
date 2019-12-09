package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 存储一组元素,但是存取元素必须遵循先进后出原则
 * 通常为了使用后退这类功能会使用栈
 * 前进后退
 * @author L
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * java.util.Deque
		 * 双端队列,俩端都可以进出队
		 * 当只调用从一段进出队操作时,就形成了栈
		 * 因此,双端队列提供了两个方法
		 * pop,push
		 */
		Deque<String> deque = new LinkedList<String>();//创建栈
		deque.push("one");//添加元素
		deque.push("two");
		deque.push("three");
		deque.push("four");
		System.out.println(deque);//最先进入在最后面
		
		/*
		 * E pop()
		 * 出栈操作
		 */
		String str = deque.pop();//取出队首元素
		System.out.println(str);
		System.out.println(deque);
		
		String str1 = deque.peek();//查看队首元素
		System.out.println(str1);
		System.out.println(deque);
		
		//遍历栈用while
		while (deque.size()>0) {
			String str2 = deque.pop();
			System.out.println(str2);
		}
		System.out.println(deque);
	}

}
