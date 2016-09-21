package com.kioja.alfa.utils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	

	
	public static String formatoMoeda(Double valor){
		
		//NumberFormat formato3 = NumberFormat.getNumberInstance();
		DecimalFormat formato7 = new DecimalFormat("0.00");
		return formato7.format(valor);
		
	}

	public static String dateToString(Date date) {
		Format formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String s = formatter.format(date);

		return s;

	}

	public static Date stringToDate(String dataString) {

		if (dataString == null || dataString.equals(""))
			return null;

		Date date = null;

		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = (java.util.Date) formatter.parse(dataString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;
	}

}
