package day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue ���� Ҳ���Դ��һ��Ԫ�� ���Ǵ�ȡԪ�ر�����ѭ�Ƚ��ȳ�ԭ��
 * 
 * @author L
 *
 */
public class QueueDemo {

	public static void main(String[] args) {
		/*
		 * LinkedListҲʵ���˶��нӿ� ,��Ϊ�����Ա���һ��Ԫ��,������β��ɾ��. ���÷��϶��е��ص�
		 */
		Queue<String> queue = new LinkedList<String>();// ����һ������
		/*
		 * boolean offer(E e) ���в��� ���β׷��һ����Ԫ��
		 */
		queue.offer("one");
		queue.offer("tow");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * E poll() ���в��� �Ӷ��׻�ȡԪ�� ��ȡ���Ԫ�ؾͱ�����ɾ����
		 */
		String poll = queue.poll();// ȡ��Ԫ��
		System.out.println(poll);
		System.out.println(queue);// Ԫ�ز��ڶ�������
		/*
		 * E peek()
		 * ���ö���Ԫ�� �������в���
		 * 
		 */
		String peek = queue.peek();//���ö���Ԫ��,��ȥ��
		System.out.println(peek);
		System.out.println(queue);
		
		//��������,���ű������г����ڱ� ���Է��ű���
	/*	for (int i = queue.size(); i > 0; i--) {
			String str = queue.poll();
			System.out.println("����Ԫ��:"+str);//�鿴����Ԫ��
		}*/
		//��while����������
		while (queue.size()>0) {
			String str = queue.poll();
			System.out.println("����Ԫ��:"+str);//�鿴����Ԫ��
		}
		System.out.println("��������:"+queue);
		
		
	}

}
