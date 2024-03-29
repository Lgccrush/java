package day08;
/**
 * 年龄不合法异常
 * 自定义异常 , 通常是用来描述某个业务逻辑上出现的问题
 * 之定义异常的名字应该做到见名知义
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
