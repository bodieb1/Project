package com.mangodev.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.IOUtils;

import com.mangodev.crash.CrashReport;
import com.mangodev.crash.CrashReportCategory;

public class Log {
	public static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
	/*
	*                               STRINGS
	*/
	
	public static void logFatal(String disc, Exception e) {
		String pre_fix = "[" + timeStamp +"][System] [FATAL] ";
		String message = pre_fix + disc;
		System.err.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e1) {
			CrashReport report = CrashReport.makeCrashReport(e1, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
		e.printStackTrace();
		System.exit(1);
	}
	public static void logError(String disc) {
		String pre_fix = "[" + timeStamp +"][System] [ERROR] ";
		String message = pre_fix + disc;
		System.err.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
			} catch (IOException e2) {
			CrashReport report = CrashReport.makeCrashReport(e2, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
	public static void logWarn(String disc) {
		String pre_fix = "[" + timeStamp +"][System] [WARN] ";
		String message = pre_fix + disc;
		System.out.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e3) {
			CrashReport report = CrashReport.makeCrashReport(e3, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
	public static void logInfo(String disc) {
		String pre_fix = "[" + timeStamp +"][System] [INFO] ";
		String message = pre_fix + disc;
		System.out.println(message);
		try{
			File file = new File("outputyly.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e4) {
			CrashReport report = CrashReport.makeCrashReport(e4, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
	
	/*
	*                              INTEGERS
	*/
	
	public static void logFatal(int disc, Exception e) {
		String pre_fix = "[" + timeStamp +"][System] [FATAL] ";
		String message = pre_fix + disc;
		System.err.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e1) {
			CrashReport report = CrashReport.makeCrashReport(e1, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
		e.printStackTrace();
		System.exit(1);
	}
	public static void logError(int disc) {
		String pre_fix = "[" + timeStamp +"][System] [ERROR] ";
		String message = pre_fix + disc;
		System.err.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
			} catch (IOException e2) {
			CrashReport report = CrashReport.makeCrashReport(e2, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
	public static void logWarn(int disc) {
		String pre_fix = "[" + timeStamp +"][System] [WARN] ";
		String message = pre_fix + disc;
		System.out.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e3) {
			CrashReport report = CrashReport.makeCrashReport(e3, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
	public static void logInfo(int disc) {
		String pre_fix = "[" + timeStamp +"][System] [INFO] ";
		String message = pre_fix + disc;
		System.out.println(message);
		try{
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e4) {
			CrashReport report = CrashReport.makeCrashReport(e4, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
	
	/*
	*                               BOOLEANS
	*/
	
	public static void logFatal(boolean disc, Exception e) {
		String pre_fix = "[" + timeStamp +"][System] [FATAL] ";
		String message = pre_fix + disc;
		System.err.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e1) {
			CrashReport report = CrashReport.makeCrashReport(e1, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
		e.printStackTrace();
		System.exit(1);
	}
	public static void logError(boolean disc) {
		String pre_fix = "[" + timeStamp +"][System] [ERROR] ";
		String message = pre_fix + disc;
		System.err.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
			} catch (IOException e2) {
			CrashReport report = CrashReport.makeCrashReport(e2, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
	public static void logWarn(boolean disc) {
		String pre_fix = "[" + timeStamp +"][System] [WARN] ";
		String message = pre_fix + disc;
		System.out.println(message);
		try {
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e3) {
			CrashReport report = CrashReport.makeCrashReport(e3, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
	public static void logInfo(boolean disc) {
		String pre_fix = "[" + timeStamp +"][System] [INFO] ";
		String message = pre_fix + disc;
		System.out.println(message);
		try{
			File file = new File("output.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(message + "\n");
		} catch (IOException e4) {
			CrashReport report = CrashReport.makeCrashReport(e4, "File Writer Error");
			System.err.println(report.getCompleteReport());
		}
	}
}