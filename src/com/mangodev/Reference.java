package com.mangodev;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reference {
	
	public static String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
	
	public static void Stamp(String messageType, String info) throws IllegalArgumentException {
		if(messageType == "ERROR"){
				System.err.println("[" + timeStamp + "][SYSTEM/" + messageType + "] " + info + "\n");
		} else if(messageType == "INFO") {
			System.out.println("[" + timeStamp + "][SYSTEM/" + messageType + "] " + info + "\n");
		} else {
			Throwable throwable = new Throwable();
			CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Invalid Console Entry");
            CrashReportCategory crashreportcategory = crashreport.makeCategory("Method With Error");
            crashreportcategory.addCrashSection("Method", new Exception().getStackTrace()[0].getMethodName());
            throw new ReportedException(crashreport);
			}		
	}	
}
