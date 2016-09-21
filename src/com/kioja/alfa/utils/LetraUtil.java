package com.kioja.alfa.utils;




public class LetraUtil {
	
	private static LetraUtil instance;
	private static String currentLetra;

	
	
	
	public static LetraUtil getInstance() {
		if (instance == null) {
			instance = new LetraUtil();
		}

		return instance;
	}




	public  String getCurrentLetra() {
		return currentLetra;
	}




	public void setCurrentLetra(String currentLetra) {
		LetraUtil.currentLetra = currentLetra;
	}
	
	
	


	

}
