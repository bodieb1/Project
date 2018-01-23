package com.mangodev;

import java.io.IOException;
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
			new Crash("IOException()", "Console Exception");
			System.exit(1);
			
		}			
	}
}
