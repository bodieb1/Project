package com.mangodev.exceptions;

public class AllPurposeException extends RuntimeException {
	private static final long serialVersionUID = -619882208243634338L;
    public AllPurposeException() {}
    public AllPurposeException(String message) { super (message); }
    public AllPurposeException(Throwable cause) { super (cause); }
    public AllPurposeException(String message, Throwable cause) { super (message, cause); }
}

