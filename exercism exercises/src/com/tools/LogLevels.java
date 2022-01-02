package com.tools;

public class LogLevels {

    public static String message(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        return logLine.substring(logLine.indexOf(":")+2, logLine.length()).strip();
    }

    public static String logLevel(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        return logLine.substring(1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        return logLine.substring(logLine.indexOf(":")+2, logLine.length()).strip() + " (" + logLine.substring(1, logLine.indexOf("]")).toLowerCase() + ")";
    }
}
