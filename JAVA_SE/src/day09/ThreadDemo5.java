package day09;
/**
 * ��ȡ�߳������Ϣ�ķ���
 * @author L
 *
 */
public class ThreadDemo5 {

	public static void main(String[] args) {
		//��ȡ����main�������߳�
		Thread main = Thread.currentThread();
		//��ȡid
		long id = main.getId();
		System.out.println("ID:"+id);
		//��ȡ����
		String name = main.getName();
		System.out.println("�̵߳�����:"+name);
		//��ȡ���ȼ�
		int priority = main.getPriority();
		System.out.println("���ȼ�:"+priority);
		
		boolean daemon = main.isDaemon();
		System.out.println("�Ƿ�Ϊ�ػ��߳�:"+daemon);
		
		boolean alive = main.isAlive();
		System.out.println("�Ƿ���:"+alive);
		
		boolean interrupted = main.isInterrupted();
		System.out.println("�Ƿ��ж�:"+interrupted);
	}

}
