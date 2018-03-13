package com.mangodev.util;

public class ManualException extends Exception{
	private static final long serialVersionUID = 1975306729233741859L;
	public ManualException() { super(); }
	public ManualException(String message) { super(message); }
	public ManualException(String message, Throwable cause) { super(message, cause); }  
	public ManualException(Throwable cause) { super(cause); }

}
