package datacalender;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ProgramDateCalendar {

	public static void main(String[] args) {

		dateCalendarConversion2();
		


	}
	
	static void dateCalendarConversion2(){
		Date d = new Date();
		System.out.println(d.toString());
		Calendar c = Calendar.getInstance();
		
		c.setTime(d);
		
		c.add(Calendar.DATE, 31);
		System.out.println(c.getTime().toString());
		c.add(Calendar.MONTH, -11);
		System.out.println(c.getTime().toString());
		c.set(2014, 7, 29);
		System.out.println(c.getTime().toString());
		c.add(Calendar.MONTH, 13);
		System.out.println(c.getTime().toString());
		
		Calendar cal = Calendar.getInstance();
		cal.setLenient(true);
		System.out.println(cal.getTime().toString());
		cal.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(cal.getTime().toString());
		cal.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
		System.out.println(cal.getTime().toString());
		cal.set(2016,Calendar.JUNE,12);
		System.out.println(cal.getTime().toString());
		cal.set(Calendar.MONTH,Calendar.JANUARY);
		System.out.println(cal.getTime().toString());
	}

}
