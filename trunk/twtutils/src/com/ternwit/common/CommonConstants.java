package com.ternwit.common;

/**
 * Audit log
 * version 1.1
 * v1.1 add slash part
 */
public interface CommonConstants {
	/*
	 * empty String and null String
	 */
	public static final String EMPTYSTRING = "";
	public static final String NULLSTRING = null;
	public static final String HTML_TAB = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	public static final String DOUBLE_HTML_TAB = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
	
	
	/* 
	 * slashes forward and back forward
	 */
	public static final String FORWARD_SLASH = "/";
	public static final String DOUBLE_FORWARD_SLASH = "//";

	public static final String BACKWARD_SLASH = "\\";
	public static final String DOUBLE_BACKWARD_SLASH = "\\\\";
	
	
	/*
	 * Local Constants
	 */
	public static final String en_US = "en_US";
	public static final String zh_CN = "zh_CN";
	public static final String zh = "zh";
	public static final String en = "en";
	
	/*
	 * Date Format String
	 */
	public static final String SIMPLE_DATE_FORMAT = "yyyy-MM-dd";
	public static final String LONG_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
	
}
