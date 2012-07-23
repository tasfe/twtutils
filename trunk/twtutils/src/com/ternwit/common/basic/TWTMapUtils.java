package com.ternwit.common.basic;

import java.util.Map;

import org.apache.commons.collections.MapUtils;

/**
 * 
 * @version 1.0
 *
 */
public final class TWTMapUtils extends MapUtils {

	/**
	 * @param <T>
	 * @param map
	 * @return true if input parameter size is one
	 */
	public static <T extends Object> boolean isSizeOne(Map<T, T> map){
		if (isEmpty(map)) {
			return false;
		}
		if (1 != map.size()) {
			return false;
		}
		return true;
	}
}
