package com.mangodev;

import java.io.File;

public class SystemInfo {
	/**
     * Gets system information
     */
	public static void getSystemInfo() {
		String nameOS = "os.name";  
		String versionOS = "os.version";  
		String architectureOS = "os.arch";
		System.out.println("OS INFORMATION");
		System.out.println("OS NAME: " + System.getProperty(nameOS));
		System.out.println("OS VERSION: " + System.getProperty(versionOS));
		System.out.println("OS ARCHITECHRE: " + System.getProperty(architectureOS));
		/* Total number of processors or cores available to the JVM */
		System.out.println("Available processors (cores): " + 
			Runtime.getRuntime().availableProcessors());
		/* Total amount of free memory available to the JVM */
		System.out.println("Free memory (bytes): " + 
			Runtime.getRuntime().freeMemory());
		/* This will return Long.MAX_VALUE if there is no preset limit */
		long maxMemory = Runtime.getRuntime().maxMemory();
		/* Maximum amount of memory the JVM will attempt to use */
		System.out.println("Maximum memory (bytes): " + 
				(maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
		/* Total memory currently available to the JVM */
		System.out.println("Total memory available to JVM (bytes): " + 
				Runtime.getRuntime().totalMemory());
		/* Get a list of all filesystem roots on this system */
		File[] roots = File.listRoots();
		/* For each filesystem root, print some info */
		for (File root : roots) {
			System.out.println("File system root: " + root.getAbsolutePath());
			System.out.println("Total space (bytes): " + root.getTotalSpace());
			System.out.println("Free space (bytes): " + root.getFreeSpace());
			System.out.println("Usable space (bytes): " + root.getUsableSpace());		
	    }
	}
	/**
     *Gets system info in an error format
     */
	public static void getSystemErrorInfo() {
		String nameOS = "os.name";  
		String versionOS = "os.version";  
		String architectureOS = "os.arch";
		System.err.println("OS INFORMATION");
		System.err.println("OS NAME: " + System.getProperty(nameOS));
		System.err.println("OS VERSION: " + System.getProperty(versionOS));
		System.err.println("OS ARCHITECHRE: " + System.getProperty(architectureOS));
		/* Total number of processors or cores available to the JVM */
		System.err.println("Available processors (cores): " + 
			Runtime.getRuntime().availableProcessors());
		/* Total amount of free memory available to the JVM */
		System.err.println("Free memory (bytes): " + 
			Runtime.getRuntime().freeMemory());
		/* This will return Long.MAX_VALUE if there is no preset limit */
		long maxMemory = Runtime.getRuntime().maxMemory();
		/* Maximum amount of memory the JVM will attempt to use */
		System.err.println("Maximum memory (bytes): " + 
				(maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
		/* Total memory currently available to the JVM */
		System.err.println("Total memory available to JVM (bytes): " + 
				Runtime.getRuntime().totalMemory());
		/* Get a list of all filesystem roots on this system */
		File[] roots = File.listRoots();
		/* For each filesystem root, print some info */
		for (File root : roots) {
			System.err.println("File system root: " + root.getAbsolutePath());
			System.err.println("Total space (bytes): " + root.getTotalSpace());
			System.err.println("Free space (bytes): " + root.getFreeSpace());
			System.err.println("Usable space (bytes): " + root.getUsableSpace());		
	    }
	}
	
}