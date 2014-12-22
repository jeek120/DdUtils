package com.xxfff.ddutils;

import org.apache.log4j.Logger;


public class LoggerUtils {
	public static Logger logger = Logger.getLogger(LoggerUtils.class);
	public static void log(String level, String className, String methodName, String msg){
		logger.error("[" + level + "]: " + className + " - " + methodName + ":" + msg);
	}
}