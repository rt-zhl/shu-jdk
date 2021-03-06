package com.shuframework.jdk7.exception;

/**
 * 工具类的异常
 * @author shu
 *
 */
public class UtilException extends RuntimeException{

	private static final long serialVersionUID = 1667969025926719311L;

	public UtilException() {
		super();
	}

	public UtilException(String message) {
		super(message);
	}
	
	public UtilException(Throwable cause) {
		super(cause);
	}

	public UtilException(String message, Throwable cause) {
		super(message, cause);
	}

	
	/**
	 * 原方法是 同步方法，性能低
	 * 	public synchronized Throwable fillInStackTrace()
	 * 
	 */
	@Override
	public Throwable fillInStackTrace() {
		return this;
	}
	
}
