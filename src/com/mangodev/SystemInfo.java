package com.mangodev;

import java.io.File;
import java.io.IOException;

import com.mangodev.exceptions.ManualException;

public class SystemInfo {
	
	public static void getSystemInfo() {
		String nameOS = "os.name";  
		String versionOS = "os.version";  
		String architectureOS = "os.arch";
		new TimeStamp("INFO", "OS INFORMATION");
		new TimeStamp("INFO", "OS NAME: " + System.getProperty(nameOS));
		new TimeStamp("INFO", "OS VERSION: " + System.getProperty(versionOS));
		new TimeStamp("INFO", "OS ARCHITECHRE: " + System.getProperty(architectureOS));
		/* Total number of processors or cores available to the JVM */
		new TimeStamp("INFO", "Available processors (cores): " + 
			Runtime.getRuntime().availableProcessors());
		/* Total amount of free memory available to the JVM */
		new TimeStamp("INFO", "Free memory (bytes): " + 
			Runtime.getRuntime().freeMemory());
		/* This will return Long.MAX_VALUE if there is no preset limit */
		long maxMemory = Runtime.getRuntime().maxMemory();
		/* Maximum amount of memory the JVM will attempt to use */
		new TimeStamp("INFO", "Maximum memory (bytes): " + 
				(maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
		/* Total memory currently available to the JVM */
		new TimeStamp("INFO", "Total memory available to JVM (bytes): " + 
				Runtime.getRuntime().totalMemory());
		/* Get a list of all filesystem roots on this system */
		File[] roots = File.listRoots();
		/* For each filesystem root, print some info */
		for (File root : roots) {
			new TimeStamp("INFO", "File system root: " + root.getAbsolutePath());
			new TimeStamp("INFO", "Total space (bytes): " + root.getTotalSpace());
			new TimeStamp("INFO", "Free space (bytes): " + root.getFreeSpace());
			new TimeStamp("INFO", "Usable space (bytes): " + root.getUsableSpace());		
	    }
	}
	public static void getSystemErrorInfo() {
		String nameOS = "os.name";  
		String versionOS = "os.version";  
		String architectureOS = "os.arch";
		new TimeStamp("ERROR", "OS INFORMATION");
		new TimeStamp("ERROR", "OS NAME: " + System.getProperty(nameOS));
		new TimeStamp("ERROR", "OS VERSION: " + System.getProperty(versionOS));
		new TimeStamp("ERROR", "OS ARCHITECHRE: " + System.getProperty(architectureOS));
		/* Total number of processors or cores available to the JVM */
		new TimeStamp("ERROR", "Available processors (cores): " + 
			Runtime.getRuntime().availableProcessors());
		/* Total amount of free memory available to the JVM */
		new TimeStamp("ERROR", "Free memory (bytes): " + 
			Runtime.getRuntime().freeMemory());
		/* This will return Long.MAX_VALUE if there is no preset limit */
		long maxMemory = Runtime.getRuntime().maxMemory();
		/* Maximum amount of memory the JVM will attempt to use */
		new TimeStamp("ERROR", "Maximum memory (bytes): " + 
				(maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
		/* Total memory currently available to the JVM */
		new TimeStamp("ERROR", "Total memory available to JVM (bytes): " + 
				Runtime.getRuntime().totalMemory());
		/* Get a list of all filesystem roots on this system */
		File[] roots = File.listRoots();
		/* For each filesystem root, print some info */
		for (File root : roots) {
			new TimeStamp("ERROR", "File system root: " + root.getAbsolutePath());
			new TimeStamp("ERROR", "Total space (bytes): " + root.getTotalSpace());
			new TimeStamp("ERROR", "Free space (bytes): " + root.getFreeSpace());
			new TimeStamp("ERROR", "Usable space (bytes): " + root.getUsableSpace());		
	    }
	}
	
}