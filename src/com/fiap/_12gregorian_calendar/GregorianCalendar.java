package com.fiap._12gregorian_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendar {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf.parse("22/04/1500");
		
		GergorianCalendar gc = new GregorianCalendar();
	}

}
