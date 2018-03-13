package com.mangodev.util;

import com.mangodev.crash.CrashReport;

public class ReportedException extends RuntimeException {
	private static final long serialVersionUID = 5737614218688765246L;
	
	/** The crash report associated with this exception */
    private final CrashReport crashReport;

    public ReportedException(CrashReport report)
    {
        this.crashReport = report;
    }

    /**
     * Gets the CrashReport wrapped by this exception.
     */
    public CrashReport getCrashReport()
    {
        return this.crashReport;
    }

    public Throwable getCause()
    {
        return this.crashReport.getCrashCause();
    }

    public String getMessage()
    {
        return this.crashReport.getDescription();
    }
}