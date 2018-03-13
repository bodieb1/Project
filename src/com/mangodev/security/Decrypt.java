package com.mangodev.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import com.mangodev.crash.CrashReport;
import com.mangodev.crash.CrashReportCategory;
import com.mangodev.util.ReportedException;
import com.mangodev.util.Log;

public class Decrypt{
	public static String getKey() {
		String key = "45241534534235LLRE";
		return key;
	}
	public static String decryptString(String strEncrypted,String strKey) throws Exception {
		String strData="";
		try {
			SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), "BlowFish");
			Cipher cipher = Cipher.getInstance("BlowFish");
			cipher.init(Cipher.DECRYPT_MODE, skeyspec);
			byte[] decrypted = cipher.doFinal(strEncrypted.getBytes());
			strData = new String(decrypted);
		} catch (Exception e) {
			SecurityException seqexception = new SecurityException();
			CrashReport report = CrashReport.makeCrashReport(seqexception, "The Program Could Not Decrypt");
			CrashReportCategory reportcatagory = report.makeCategory("ERROR INFORMATION");
			reportcatagory.addCrashSection("ERROR THAT CAUSED THE CRASH", e.getCause());
			Log.logFatal(report.getCompleteReport(), e);
			throw new ReportedException(report);
		}
		return strData;
	}
}