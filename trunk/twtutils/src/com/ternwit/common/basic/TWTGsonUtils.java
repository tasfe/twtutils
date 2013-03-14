package com.ternwit.common.basic;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
 * Audit Log
 * 2013-01-31 new created
 * 2013-03-14 modified fromJson parameter from Class<Object> to Class<?> and test passed
 * */
public class TWTGsonUtils {

	public static Gson getInstance(boolean prettyPrint) {
		Gson gson = null;
		/* pretty print */
		if (prettyPrint) {
			gson = new GsonBuilder().setPrettyPrinting().create();
		} else {
			gson = new GsonBuilder().create();
		}
		return gson;
	}

	public static String toJson(Object obj) {
		return getInstance(true).toJson(obj);
	}

	public static Object fromJson(String json, Class<?> clazz) {
		return getInstance(false).fromJson(json, clazz);
	}
}
