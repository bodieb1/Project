package com.mangodev;

import java.io.IOException;

public class Crash {
	public static void Fatal(Throwable exception) {
		if(exception == null) {
			Reference.Stamp("ERROR", "Exception type unavalible");	
		} else if(exception == new ArithmeticException()) {
			new ArithmeticException();
		} else if(exception == new StringIndexOutOfBoundsException()) {
			new StringIndexOutOfBoundsException();
		} else if(exception == new ArrayIndexOutOfBoundsException()) {
			new ArrayIndexOutOfBoundsException();
		} else if(exception == new NegativeArraySizeException()) {
			new NegativeArraySizeException();
		} else if(exception == new SecurityException()) {
			new SecurityException();
		} else if(exception == new UnsupportedOperationException()) {
			new UnsupportedOperationException();
		} else if(exception == new IOException()) {
			new UnsupportedOperationException();
		}
			
		
	}
	public static void Crash(Throwable exceptionType, String understandableExceptionType) {
		
		Reference.Stamp("ERROR", "FATAL ERROR \n Showing current Crash Report");
		Reference.Stamp("ERROR", "Getting System Information");
		SystemInfo.getSystemInfo();
		Reference.Stamp("ERROR", "A Following Exception has occured");
		Reference.Stamp("ERROR", understandableExceptionType);
		Reference.Stamp("ERROR", "The path of the error follows");
		Fatal(exceptionType);
	}
}
