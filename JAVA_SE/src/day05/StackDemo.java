package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * �洢һ��Ԫ��,���Ǵ�ȡԪ�ر�����ѭ�Ƚ����ԭ��
 * ͨ��Ϊ��ʹ�ú������๦�ܻ�ʹ��ջ
 * ǰ������
 * @author L
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		/*
		 * 
		 * java.util.Deque
		 * ˫�˶���,���˶����Խ�����
		 * ��ֻ���ô�һ�ν����Ӳ���ʱ,���γ���ջ
		 * ���,˫�˶����ṩ����������
		 * pop,push
		 */
		Deque<String> deque = new LinkedList<String>();//����ջ
		deque.push("one");//���Ԫ��
		deque.push("two");
		deque.push("three");
		deque.push("four");
		System.out.println(deque);//���Ƚ����������
		
		/*
		 * E pop()
		 * ��ջ����
		 */
		String str = deque.pop();//ȡ������Ԫ��
		System.out.println(str);
		System.out.println(deque);
		
		String str1 = deque.peek();//�鿴����Ԫ��
		System.out.println(str1);
		System.out.println(deque);
		
		//����ջ��while
		while (deque.size()>0) {
			String str2 = deque.pop();
			System.out.println(str2);
		}
		System.out.println(deque);
	}

}
