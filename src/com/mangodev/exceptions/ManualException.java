package com.mangodev.exceptions;

public class ManualException extends RuntimeException {
    public ManualException () {}
    public ManualException (String message) { super (message); }
    public ManualException (Throwable cause) { super (cause); }
    public ManualException (String message, Throwable cause) { super (message, cause); }
}