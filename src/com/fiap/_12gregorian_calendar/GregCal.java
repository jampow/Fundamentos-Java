package com.fiap._12gregorian_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = (Date) sdf.parse("22/04/1500");

		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(data);
		gc.add(1, 1);
		
		Date dt = (Date) gc.getTime();
		SimpleDateFormat formatdiasemana = new SimpleDateFormat("E");
		
		String diasemana = formatdiasemana.format(dt);
		System.out.println(diasemana);

	}

}
