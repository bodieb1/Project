package com.mangodev;

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
		new TimeStamp("INFO", "FOO");
	}
	public static void PostInit() {
		new TimeStamp("INFO", "The PostInitalization phase has started");
	}
	//MAIN METHOD
   public static void main(String[] args) {
      PreInit();
      Init();
      PostInit();
  	}
   }

