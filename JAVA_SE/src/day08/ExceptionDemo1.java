package day08;
/**
 * java�쳣�����е�try-catch
 * try�����������Ͽ��ܳ���Ĵ���
 * catch������������try���д����׳��Ĵ���,�����
 * @author L
 *
 */
public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		try {
			String str = "a";
			/*
			 * JVM��ִ�д���Ĺ���������������쳣
			 * ���ʵ��������������쳣ʵ��,������������ִ�й����������õ��쳣������ʾ�ô��󱨸�
			 * ������Ͻ����쳣�׳�
			 * ���׳��쳣�Ĵ����б�try��Χ,
			 * ��jvm����catch���Ƿ��й�ע���쳣,
			 * ��ע�򽻸�catch�����
			 * ����Ὣ���쳣�׳�����ǰ������,
			 * �ɵ��õ�ǰ�����Ĵ������ô���
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
		} catch (NullPointerException e) {
			
			System.out.println("�����˿�ָ���쳣");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("�ַ����±�Խ����");
		}catch (Exception e) {
		System.out.println("�������ǳ��˴�");
		}
		/*
		 * Ӧ������һ����ϰ��
		 * �����һ��catch�в���exception
		 * ������δ�����쳣���³����ж�,
		 * �����catch����ͬ�쳣ʱ,��Щ�쳣���ڼ̳й�ϵ
		 * ��ô�����쳣�������в���.�����쳣����
		 */
		
		
		System.out.println("���������");
	}

}
