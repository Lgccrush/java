package day01StingMethod;


/*
 * String substring(int strat,int end)
 * ��ȡ�ַ���,��ָ��λ��(start)��ʼ��ȡ��ָ����λ��(end)
 * java API��һ���ص�,ͨ�����������ֱ�ʾ��Χʱ,���ǰ���ͷ������β��
 */
public class StringDemo3 {

	public static void main(String[] args) {
		String str = "thinking in java";
		//��ȡing
		String str2 = str.substring(5,8);
		System.out.println("str2="+str2);
		
		String host = "www.tedu.cn";
		String sub=host.substring(4, 8);
		System.out.println("sub="+sub);
		/*
		 * ��ֻ����һ������,�Ǵ�ָ��λ�ÿ�ʼ��ȡ���ַ���ĩβ
		 */
		String sub2 = host.substring(4);
		
	}

}
