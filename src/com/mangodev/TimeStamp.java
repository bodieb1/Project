package com.mangodev;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
	static String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
	public TimeStamp(String messageType, String info) throws IllegalArgumentException {
		
		if(messageType == "ERROR"){
			System.err.println("[" + timeStamp + "][SYSTEM/" + messageType + "] " + info + "\n");
		} else if(messageType == "INFO") {
			System.out.println("[" + timeStamp + "][SYSTEM/" + messageType + "] " + info + "\n");
		} else {
			Crash c = new Crash("IOException()", "Console Exception");
			c.addCatagory("TEST", "This is a test catagory");
			System.exit(1);
			
		}			
	}
}
