package com.mangodev.util;

import java.io.IOException;

import com.mangodev.crash.CrashReport;
import com.mangodev.crash.CrashReportCategory;

public class util {

    @SuppressWarnings("static-access")
	public static void runTask(Runnable task) throws IOException {
    	Log log = new Log();
    	try {
        task.run();
    	} catch (NullPointerException e) {
    		log.logWarn("Caught " + e.getCause() + " Exception. Bypassing error if capabable.");
			log.logWarn("The Exception was bypassed sucsessfully! Continuing thread.");
    	} catch (Exception e) {
    		CrashReport report = CrashReport.makeCrashReport(e, "Caught an Exception While Trying to Run the Task Given.");
    		CrashReportCategory reportcategory = report.makeCategory("TASK PROBLEM");
    		reportcategory.addCrashSection("The Exception", e);
    		reportcategory.addCrashSection("The Runnable That Caused The Exception", task.getClass().getSimpleName());
    		log.logFatal(report.getCompleteReport(), e);
    	}
    }
}