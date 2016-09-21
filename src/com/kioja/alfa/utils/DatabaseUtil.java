package com.kioja.alfa.utils;

public class DatabaseUtil {
	private static DatabaseUtil instance;
	private static boolean renew = false;
	
	public boolean isRenew() {
		return renew;
	}

	public void setRenew(boolean renew) {
		DatabaseUtil.renew = renew;
	}

	public static DatabaseUtil getInstance() {
		if (instance == null) {
			instance = new DatabaseUtil();
		}

		return instance;
	}
	
}
