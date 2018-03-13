package com.mangodev.crash;

import java.io.File;

import com.mangodev.util.Log;
import com.mangodev.util.ManualException;


public class DebugCrash {
	public static void crashme(String catTitle, String sectionName1, String value1, String sectionName2, String value2, String sectionName3, String value3){
		ManualException e = new ManualException();
		CrashReport report = CrashReport.makeCrashReport(e, "Manual Debug Crash");
		CrashReportCategory reportcategory2 = report.makeCategory(catTitle);
		reportcategory2.addCrashSection(sectionName1, value1);
		reportcategory2.addCrashSection(sectionName2, value2);
		reportcategory2.addCrashSection(sectionName3, value3);
		File file = new File("output.txt");
        file = file.getAbsoluteFile();
		report.saveToFile(file);
		Log.logFatal(report.getCompleteReport(), e);
	}
	public static void crashme(String catTitle, String sectionName1, String value1, String sectionName2, String value2){
		ManualException e = new ManualException();
		CrashReport report = CrashReport.makeCrashReport(e, "Manual Debug Crash");
		CrashReportCategory reportcategory2 = report.makeCategory(catTitle);
		reportcategory2.addCrashSection(sectionName1, value1);
		reportcategory2.addCrashSection(sectionName2, value2);
		File file = new File("output.txt");
        file = file.getAbsoluteFile();
		report.saveToFile(file);
		Log.logFatal(report.getCompleteReport(), e);
	}
	public static void crashme(String catTitle, String sectionName1, String value1){
		ManualException e = new ManualException();
		CrashReport report = CrashReport.makeCrashReport(e, "Manual Debug Crash");
		CrashReportCategory reportcategory2 = report.makeCategory(catTitle);
		reportcategory2.addCrashSection(sectionName1, value1);
		File file = new File("output.txt");
        file = file.getAbsoluteFile();
		report.saveToFile(file);
		Log.logFatal(report.getCompleteReport(), e);
	}
	public static void crashme(){
		ManualException e = new ManualException();
		CrashReport report = CrashReport.makeCrashReport(e, "Manual Debug Crash");
		File file = new File("output.txt");
        file = file.getAbsoluteFile();
		boolean filewrite = report.saveToFile(file);
		Log.logWarn("CRASH REPORT SAVED: " + filewrite);
		Log.logFatal(report.getCompleteReport(), e);
	}
}
