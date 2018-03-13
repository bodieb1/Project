package com.mangodev.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import com.mangodev.crash.CrashReport;
import com.mangodev.crash.CrashReportCategory;
import com.mangodev.util.Log;
import com.mangodev.util.ReportedException;

public class Encrypt {
	public static String getKey() {
		String key = "45241534534235LLRE";
		return key;
	}
	@SuppressWarnings("static-access")
	public static String encryptString(String strClearText, String strKey) throws Exception {
		String strData="";
		try {
			SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), getKey());
			Cipher cipher = Cipher.getInstance(getKey());
			cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
			byte[] encrypted = cipher.doFinal(strClearText.getBytes());
			strData = new String(encrypted);
			
		} catch (Exception e) {
			Log log = new Log();
			SecurityException seqexception = new SecurityException();
			CrashReport report = CrashReport.makeCrashReport(seqexception, "The Program Could Not Encrypt");
			CrashReportCategory reportcatagory = report.makeCategory("ERROR INFORMATION");
			reportcatagory.addCrashSection("ERROR THAT CAUSED THE CRASH", e.getCause());
			log.logFatal(report.getCompleteReport(), e);
			throw new ReportedException(report);
		}
		return strData;
	}
}
