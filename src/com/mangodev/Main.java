package com.mangodev;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import com.mangodev.frames.Login;


public class Main {

   //MAIN CODE
   public static void PreInit() {
	   new TimeStamp("INFO", "The PreInitalization phase has started.");
		System.out.println(TimeStamp.timeStamp);
		new TimeStamp("INFO", "SYSTEM STARTED");
		new TimeStamp("INFO", "LOADING OS INFO");
		SystemInfo.getSystemInfo();
		new TimeStamp("INFO", "OutputStream.err TESTING. IF YOU SEE THIS, OUTPUT STREAM IS WORKING.");
		new TimeStamp("INFO", "The system is started and is running good.");
		
	}
	public static void Init() {
		new TimeStamp("INFO", "The Initalization phase has started");
		new TimeStamp("INFO", "TO DEBUG CRASH, TYPE 0. IF NOT, TYPE 1");
		int debugCrash = 0;
		try {
			debugCrash = System.in.read();
			System.out.println(debugCrash);
		} catch (IOException e) {
			new Crash("IOException()", "Input Error");
		}
		System.out.println(debugCrash);
		if(debugCrash == 48) {
			new Crash("ManualException()", "Manual Debug Crash");
		} else {}
		new Login();
	}
	public static void PostInit() {
		new TimeStamp("INFO", "The PostInitalization phase has started");
	}
	//MAIN METHOD
   public static void main(String[] args){
      PreInit();
      Init();
      PostInit();
  	}
   }

