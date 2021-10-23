package com.dev.delta.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public  class DateBlogUtil {

	static String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	static String[] months = { "Jan", "Feb", "Mar", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	
	public static String toMonthName(int month)
	{
		return months[month];
	}
	
	public static String toDayName(int day)
	{
		return days[day];
	}
	
	
	public static Date toDate(String date,String format) throws ParseException
	{
		return new SimpleDateFormat(format).parse(date);
	}
}
