package day08;
/**
 * ���䲻�Ϸ��쳣
 * �Զ����쳣 , ͨ������������ĳ��ҵ���߼��ϳ��ֵ�����
 * ֮�����쳣������Ӧ����������֪��
 * @author L
 *
 */
public class IllegalAgeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		
	}

	public IllegalAgeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public IllegalAgeException(String message) {
		super(message);
		
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		
	}

	

}
