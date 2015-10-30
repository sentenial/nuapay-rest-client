package com.sentenial.rest.client.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	private static final String DATE_FORMAT = "yyyy-MM-dd";

	public static Date toDate(String dateString){
		Date date = null;
		try {
			date = new SimpleDateFormat(DATE_FORMAT).parse(dateString);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		
		return date;
	}
	
	public static String fromDate(Date date){
		return new SimpleDateFormat(DATE_FORMAT).format(date);
	}

}
