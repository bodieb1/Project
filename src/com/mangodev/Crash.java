package com.mangodev;

import java.io.IOException;

import com.mangodev.exceptions.AllPurposeException;
import com.mangodev.exceptions.ManualException;

public class Crash {
	public String addCatagory(String Catagory, String Content) { String catagory = "--Catagory--\n--" + Catagory + "--\n" + Content; return catagory; }
	
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
		} else if(exception == "ManualException()") {
			throw new ManualException();
		} else if(exception == "AllPurposeException()") {
			throw new AllPurposeException();
		}
	}
	
	public static void getSysData() { new TimeStamp("INFO", "Getting System Information"); SystemInfo.getSystemInfo(); }
	
	public Crash(String exception, String understandableException) { 
		new TimeStamp("INFO", "----------------------------------------------------------");
		new TimeStamp("INFO", "FATAL ERROR \n Showing current Crash Report");
		new TimeStamp("INFO", "----------------------------------------------------------");
		getSysData();
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTrace[2];
        new TimeStamp("INFO", "----------------------------------------------------------");
		new TimeStamp("INFO", "A Following Exception has occured:");
		new TimeStamp("INFO", understandableException);
		new TimeStamp("INFO", "The path of the error follows");
		new TimeStamp("INFO", element.getMethodName() + "()");
		new TimeStamp("INFO", "at...");
		new TimeStamp("INFO", element.getClassName());
		new TimeStamp("INFO", "----------------------------------------------------------");
		Fatal(exception);
	}
}
