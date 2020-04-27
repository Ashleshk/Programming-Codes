package com.lab08.labmanual;

public class LessBalanceException extends Exception {
    public String message;
    public LessBalanceException(String msg)
    {
    	super(msg);
    	message= msg;
    }
}
