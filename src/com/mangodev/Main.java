package com.mangodev;

import java.io.IOException;
import com.mangodev.util.Log;
import com.mangodev.util.SystemInfo;
import com.mangodev.util.util;
import com.sun.istack.internal.Nullable;
import com.mangodev.crash.DebugCrash;


public class Main {
	static Log log = new Log();
   //MAIN CODE
	@SuppressWarnings("static-access")
	@Nullable
   public static Runnable PreInit() throws IOException {
	    log.logInfo("The PreInitalization phase has started.");
		System.out.println(Log.timeStamp);
		log.logInfo("SYSTEM STARTED");
		log.logInfo("LOADING OS INFO");
		SystemInfo.getSystemInfo();
		log.logInfo("OutputStream.err TESTING. IF YOU SEE THIS, OUTPUT STREAM IS WORKING.");
		log.logInfo("The system is started and is running good.");	
		return null;
	}
	@SuppressWarnings("static-access")
	@Nullable
	public static Runnable Init() throws IOException {
		log.logInfo("The Initalization phase has started");
		log.logInfo("FOO");
		return null;
	}
	@SuppressWarnings("static-access")
	@Nullable
	public static Runnable PostInit() throws IOException {
		log.logInfo("The PostInitalization phase has started");
		DebugCrash.crashme();
		return null;
	}
	//MAIN METHOD
   public static void main(String[] args) throws IOException {
	  util.runTask(PreInit());
      util.runTask(Init());
      util.runTask(PostInit());
   }
}
   

