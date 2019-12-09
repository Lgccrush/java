package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue 队列 也可以存放一组元素 但是存取元素必须遵循先进先出原则
 * 
 * @author L
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		/*
		 * LinkedList也实现了队列接口 ,因为它可以保存一组元素,并且首尾增删快. 正好符合队列的特点
		 */
		Queue<String> queue = new LinkedList<String>();// 创建一个队列
		/*
		 * boolean offer(E e) 入列操作 向队尾追加一个新元素
		 */
		queue.offer("one");
		queue.offer("tow");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * E poll() 出列操作 从队首获取元素 获取后该元素就被队列删除了
		 */
		String poll = queue.poll();// 取出元素
		System.out.println(poll);
		System.out.println(queue);// 元素不在队列中了
		/*
		 * E peek()
		 * 引用队首元素 不做出列操作
		 * 
		 */
		String peek = queue.peek();//调用队首元素,不去除
		System.out.println(peek);
		System.out.println(queue);
		
		//遍历队列,正着遍历队列长度在变 所以反着遍历
	/*	for (int i = queue.size(); i > 0; i--) {
			String str = queue.poll();
			System.out.println("队列元素:"+str);//查看队列元素
		}*/
		//用while遍历更合适
		while (queue.size()>0) {
			String str = queue.poll();
			System.out.println("队列元素:"+str);//查看队列元素
		}
		System.out.println("遍历结束:"+queue);
		
		
	}

}
