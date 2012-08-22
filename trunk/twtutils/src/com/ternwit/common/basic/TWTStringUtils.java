package com.ternwit.common.basic;

import static com.ternwit.common.CommonConstants.BACKWARD_SLASH;
import static com.ternwit.common.CommonConstants.DOUBLE_BACKWARD_SLASH;
import static com.ternwit.common.CommonConstants.DOUBLE_FORWARD_SLASH;
import static com.ternwit.common.CommonConstants.EMPTYSTRING;
import static com.ternwit.common.CommonConstants.FORWARD_SLASH;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @version 1.2
 * 
 * v1.1 added
 * 				endsWithForwardSlash
 * 				endsWithBackwardSlash
 * 				endsWithDoubleForwardSlash
 * 				endsWithDoubleBackwardSlash
 * v1.2 added
 * 				escapeLineBreakForWeb
 * 				insert
 * 				split
 * 				splitWorker
 */
public final class TWTStringUtils extends StringUtils {
	
	/**
	 * @return returns true if starts with forward slash
	 */
	public static boolean startsWithForwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.startsWith(inputStr, FORWARD_SLASH);
		
		return result;
	}

	/**
	 * @return returns true if starts with backward slash
	 */
	public static boolean startsWithBackwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.startsWith(inputStr, BACKWARD_SLASH);
		return result;
	}

	/**
	 * @return returns true if starts with double forward slash
	 */
	public static boolean startsWithDoubleForwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.startsWith(inputStr, DOUBLE_FORWARD_SLASH);
		return result;
	}

	/**
	 * @return returns true if starts with double backward slash
	 */
	public static boolean startsWithDoubleBackwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.startsWith(inputStr, DOUBLE_BACKWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns true if ends with forward slash
	 */
	public static boolean endsWithForwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.endsWith(inputStr, FORWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns true if ends with backward slash
	 */
	public static boolean endsWithBackwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.endsWith(inputStr, BACKWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns true if ends with double forward slash
	 */
	public static boolean endsWithDoubleForwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.endsWith(inputStr, DOUBLE_FORWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns true if ends with double backward slash
	 */
	public static boolean endsWithDoubleBackwardSlash(String inputStr) {
		boolean result = false;
		
		result = StringUtils.endsWith(inputStr, DOUBLE_BACKWARD_SLASH);
		return result;
	}
	
	/**
	 * @return returns a string replaced all \r, \r\n and \n with HTML break line tag, the StringUtils can handle null input string
	 */
	public static String escapeLineBreakForWeb(String inputStr) {
		String outputStr = EMPTYSTRING;
		
		outputStr = StringUtils.replace(inputStr, "\r\n", "<br />");
		outputStr = StringUtils.replace(outputStr, "\r", "<br />");
		outputStr = StringUtils.replace(outputStr, "\n", "<br />");
		
		return outputStr;
	}
	
	/**
	 * @return insert("abcde", 2, "<br/>") -- ab<br />cd<br />e<br />
	 */
	public static String insert(String inputStr, int fixLength, String insertStr) {
		return StringUtils.join(splitWorker(inputStr, fixLength, insertStr)); 
	}
	
	public static String[] split(String inputStr, int fixLength) {
		return splitWorker(inputStr, fixLength, EMPTYSTRING);
	}
	
	public static String[] split(String inputStr, int fixLength, String insertStr) {
		return splitWorker(inputStr, fixLength, insertStr);
	}
	
	private static String[] splitWorker(String inputStr, int fixLength, String insertStr) {
		if (null == inputStr) {
			return new String[]{};
		}
		if (StringUtils.isEmpty(inputStr)) {
			return new String[]{EMPTYSTRING};
		}
		if (0 >= fixLength) {
			throw new IllegalArgumentException("fixedLength can NOT be set to negative value or zero");
		}
		if (null == insertStr) {
			insertStr = EMPTYSTRING;
		}
		
		int stringLength = inputStr.length();
		
		int beginIndex = 0;
		int endIndex = fixLength;
		
		/* in case of fixedLength is greater than inputStr length */
		if (fixLength > stringLength) {
			return new String[]{inputStr + insertStr};
		}
		
		int arrayLength = stringLength / fixLength;
		arrayLength = stringLength % fixLength != 0 ? arrayLength + 1 : arrayLength;
		
		String[] array = new String[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			/* fix String Index Out Of Bound exception */
			if (endIndex > stringLength) {
				endIndex = stringLength;
			}

			array[i] = inputStr.substring(beginIndex, endIndex) + insertStr;

			beginIndex = endIndex;
			endIndex = beginIndex + fixLength;
		}
		
		return array;
	}
}
