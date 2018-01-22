package com.mangodev;

public class Main {

   //MAIN CODE
   public static void PreInit() {
	    Reference.Stamp("INFO", "The PreInitalization phase has started.");
		System.out.println(Reference.timeStamp);
		System.out.println("SYSTEM STARTED");
		Reference.Stamp("INFO", "LOADING OS INFO");
		SystemInfo.getSystemInfo();
		Reference.Stamp("INFO", "OutputStream.err TESTING. IF YOU SEE THIS, OUTPUT STREAM IS WORKING.");
		Reference.Stamp("INFO", "The system is started and is running good.");
		
	}
	public static void Init() {
		Reference.Stamp("INFO", "The Initalization phase has started");
		Reference.Stamp("Infods", "FOO");
		Reference.Stamp("INFO", "GETTING WIFI INFO");
	}
	public static void PostInit() {
		Reference.Stamp("INFO", "The PostInitalization phase has started");
	}
	//MAIN METHOD
   public static void main(String[] args) {
      PreInit();
      Init();
      PostInit();
  	}
   }

