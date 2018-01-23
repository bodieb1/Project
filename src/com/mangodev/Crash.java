package com.mangodev;

import java.io.IOException;

public class Crash {
	public static void addCatagory(String Catagory, String Content) {
		
	}
	public static void Fatal(String exception) {
		if(exception == null) {
			new TimeStamp("ERROR", "The ExceptionType is currently unavalible");	
		} else if(exception == "ArithmeticException()") {
			throw new ArithmeticException();
		} else if(exception == "StringIndexOutOfBoundsException()") {
			throw new StringIndexOutOfBoundsException();
		} else if(exception == "ArrayIndexOutOfBoundsException()") {
			throw new ArrayIndexOutOfBoundsException();
		} else if(exception == "NegativeArraySizeException()") {
			throw new NegativeArraySizeException();
		} else if(exception == "SecurityException()") {
			throw new SecurityException();
		} else if(exception == "UnsupportedOperationException()") {
			throw new UnsupportedOperationException();
		} else if(exception == "IOException()") {
			try {
				throw new IOException();
			} catch (IOException e) {
			new TimeStamp("ERROR", "The ExceptionType is currently unavalible.");	
			}
		}
	}
	public static void getSysData() {
		new TimeStamp("ERROR", "Getting System Information");
		SystemInfo.getSystemErrorInfo();
	}
	/**
     * Populates this crash report with initial information about the running server and operating system / java
     * environment
     */
    private void populateEnvironment(String Exception, String understandableExceptionType) {
    	String CrashMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
		String CrashClassName = new Object(){}.getClass().getName();
		new TimeStamp("ERROR", "A Following Exception has occured:");
		new TimeStamp("ERROR", understandableExceptionType);
		new TimeStamp("ERROR", "The path of the error follows");
		new TimeStamp("ERROR", CrashMethodName);
		new TimeStamp("ERROR", "at...");
		new TimeStamp("ERROR", CrashClassName);
		Fatal(Exception);
		
    }
	public Crash(String exception, String understandableException) {
		new TimeStamp("ERROR", "FATAL ERROR \n Showing current Crash Report");
		getSysData();
		populateEnvironment(exception, understandableException);
		
		
	}
}
