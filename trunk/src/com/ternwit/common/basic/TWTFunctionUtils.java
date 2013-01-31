package com.ternwit.common.basic;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.ternwit.common.CommonConstants;

/**
 * @since version 1.1
 * 
 * */
/*
 * version 1.1
 * 
 * */
public final class TWTFunctionUtils {

	public static BigDecimal getBigDecimalFromString(String param) {
		BigDecimal result = new BigDecimal(0);

		if (TWTStringUtils.isNotBlank(param)) {
			result = new BigDecimal(param);
		}

		return result;
	}

	public static Boolean getBooleanFromString(String param) {
		Boolean result = false;

		if (TWTStringUtils.isNotBlank(param)) {
			result = new Boolean(param);
		}

		return result;
	}

	public static Short getBooleanShortValFromString(String param) {
		Short result = new Short("0");

		if (TWTStringUtils.isNotBlank(param)) {
			if (param.equalsIgnoreCase(Boolean.TRUE.toString())) {
				result = new Short("1");
			} else {
				result = new Short("0");
			}
		}

		return result;
	}

	public static Integer getIntegerFromString(String param) {
		Integer result = 0;

		if (TWTStringUtils.isNotBlank(param))
			result = new Integer(param);

		return result;
	}

	public static Double getDoubleFromString(String param) {
		Double result = new Double(0);

		if (TWTStringUtils.isNotBlank(param)) {
			result = new Double(param);
		}

		return result;
	}

	public static Float getFloatFromString(String param) {
		Float result = new Float(0);

		if (TWTStringUtils.isNotBlank(param)) {
			result = new Float(param);
		}

		return result;
	}

	public static Long getLongFromString(String param) {
		Long result = new Long(0);

		if (TWTStringUtils.isNotBlank(param)) {
			result = new Long(param);
		}

		return result;
	}

	public static String getStringFromBigDecimal(BigDecimal param) {
		String bigDecimalString = CommonConstants.EMPTYSTRING;

		if (param != null) {
			bigDecimalString = param.toString();
		}

		return bigDecimalString;
	}

	public static String getStringFromBoolean(Boolean param) {
		String booleanString = CommonConstants.EMPTYSTRING;

		if (param != null) {
			booleanString = param.toString();
		}

		return booleanString;
	}

	public static String getStringFromBooleanShortVal(Short param) {
		String booleanString = CommonConstants.EMPTYSTRING;

		if (param != null) {
			if (param.shortValue() == 0) {
				booleanString = Boolean.FALSE.toString();
			} else if (param.shortValue() == 1) {
				booleanString = Boolean.TRUE.toString();
			}
		}

		return booleanString;
	}

	public static String getStringFromInteger(Integer param) {
		String integerString = CommonConstants.EMPTYSTRING;

		if (param != null) {
			integerString = param.toString();
		}

		return integerString;
	}

	public static String getStringFromDouble(Double param) {
		String doubleString = CommonConstants.EMPTYSTRING;

		if (param != null) {
			doubleString = param.toString();
		}

		return doubleString;
	}

	public static String getStringFromFloat(Float param) {
		String floatString = CommonConstants.EMPTYSTRING;

		if (param != null) {
			floatString = param.toString();
		}

		return floatString;
	}

	public static String getStringFromLong(Long param) {
		String longString = CommonConstants.EMPTYSTRING;

		if (param != null) {
			longString = param.toString();
		}

		return longString;
	}

	/*
	 * notice: this method can NOT guarantee unique id in a pretty fast machine
	 * 
	 * */
	public static Long getPrimaryKey() {
		Timestamp now = new Timestamp(System.currentTimeMillis());

		long nowInlong = now.getTime();

		Long aPK = new Long(nowInlong);

		return aPK;
	}

	public static boolean isEmpty(Object obj) {
		if (obj == null) {
			return true;
		}

		return (obj.toString().trim().equals(""));
	}

	public static Object invokeMethod(Object object, String methodName,
			Class<? extends Object>[] paramTypes, Object[] params)
			throws Exception {
		if (object == null) {
			return null;
		}
		Class<? extends Object> targetClass = object.getClass();

		if (targetClass == null) {
			return null;
		}
		Method targetMethod = targetClass.getMethod(methodName, paramTypes);

		if (targetMethod == null) {
			return null;
		}
		Object result = targetMethod.invoke(object, params);

		return result;
	}
}
