package com.ternwit.common.basic;

import java.util.List;

import org.apache.commons.collections.ListUtils;

/**
 * 
 * @version 1.0
 *
 */
public final class TWTListUtils extends ListUtils {
	/**
	 * @param list
	 * @return return true when list is null or empty
	 */
	public static boolean isNullOrEmpty(List<? extends Object> list) {
		/*
		 * if list is null
		 * return true
		 */
		if (isNull(list)) {
			return true;
		}
		
		/*
		 * if list is empty
		 * return true
		 */
		if (0 == list.size()) {
			return true;
		}
		
		return false;
	}

	/**
	 * @param list
	 * @return return true when list size is one
	 */
	public static boolean isSizeOne(List<? extends Object> list) {
		/*
		 * call isNullOrEmpty method
		 * if list is null or empty
		 * return false
		 */
		if (isNullOrEmpty(list)) {
			return false;
		}
		/*
		 * if list size is not one
		 * return false
		 */
		if (1 != list.size()) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * @param list
	 * @return return true when list is null
	 */
	public static boolean isNull(List<? extends Object> list) {
		/*
		 * if list is null
		 * return true
		 */
		if (null == list) {
			return true;
		}
		
		return false;
	}
}
