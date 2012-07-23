package com.ternwit.common.basic;

import org.apache.commons.lang.StringUtils;

import com.ternwit.common.CommonConstants;

/**
 * 
 * @version 1.1
 * 
 * v1.1 added
 * 				endsWithForwardSlash
 * 				endsWithBackwardSlash
 * 				endsWithDoubleForwardSlash
 * 				endsWithDoubleBackwardSlash
 */
public final class TWTStringUtils extends StringUtils {
	
	/**
	 * @return returns true if starts with forward slash
	 */
	public static boolean startsWithForwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.startsWith(inputStr, CommonConstants.FORWARD_SLASH);
		
		return result;
	}

	/**
	 * @return returns true if starts with backward slash
	 */
	public static boolean startsWithBackwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.startsWith(inputStr, CommonConstants.BACKWARD_SLASH);
		return result;
	}

	/**
	 * @return returns true if starts with double forward slash
	 */
	public static boolean startsWithDoubleForwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.startsWith(inputStr, CommonConstants.DOUBLE_FORWARD_SLASH);
		return result;
	}

	/**
	 * @return returns true if starts with double backward slash
	 */
	public static boolean startsWithDoubleBackwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.startsWith(inputStr, CommonConstants.DOUBLE_BACKWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns true if ends with forward slash
	 */
	public static boolean endsWithForwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.endsWith(inputStr, CommonConstants.FORWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns true if ends with backward slash
	 */
	public static boolean endsWithBackwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.endsWith(inputStr, CommonConstants.BACKWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns true if ends with double forward slash
	 */
	public static boolean endsWithDoubleForwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.endsWith(inputStr, CommonConstants.DOUBLE_FORWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns true if ends with double backward slash
	 */
	public static boolean endsWithDoubleBackwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.endsWith(inputStr, CommonConstants.DOUBLE_BACKWARD_SLASH);
		return result;
	}
}
