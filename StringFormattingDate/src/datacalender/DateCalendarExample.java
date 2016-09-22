package datacalender;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;



public class DateCalendarExample {

	public static void main(String[] args){
		printOutFieldIntCalendar();
		
		
	}
	
	void addRollCalendarFields(){
		Calendar c = Calendar.getInstance();
		c.setLenient(false);
		c.roll(Calendar.DAY_OF_MONTH, 20);
		printOutCalendarInfo(c);
	}
	
	void setCalendarFields(){
		Calendar c = Calendar.getInstance();
		c.setLenient(false);
		c.set(Calendar.DAY_OF_WEEK,9);
		printOutCalendarInfo(c);
	}
	
	void getCalendatFields(){		
		Calendar c = Calendar.getInstance();
		printOutCalendarInfo(c);
		
	}
	
	private static void printOutFieldIntCalendar(){
		int[] fields = {Calendar.YEAR,Calendar.MONTH,Calendar.WEEK_OF_MONTH,Calendar.DATE,Calendar.DAY_OF_MONTH,Calendar.DAY_OF_YEAR,
				Calendar.DAY_OF_WEEK,	Calendar.DAY_OF_WEEK_IN_MONTH,
				Calendar.HOUR,Calendar.HOUR_OF_DAY,Calendar.SECOND, Calendar.MILLISECOND};
		String[] stringFields = {"year","month","week_month","date","day_month","day_year",
				"day_week","day_week_month",
				"hour","hour_day","seconds","milisecond"};
		
		for(int i=0;i<fields.length;i++){
			//System.out.println(stringFields[i] + "\t" + c.get(fields[i]));
			System.out.printf("%-15s %4d\n", stringFields[i],fields[i]);
		}
	}
	
	private static void printOutCalendarInfo(Calendar c){
		int[] fields = {Calendar.YEAR,Calendar.MONTH,Calendar.WEEK_OF_MONTH,Calendar.DATE,Calendar.DAY_OF_MONTH,Calendar.DAY_OF_YEAR,
				Calendar.DAY_OF_WEEK,	Calendar.DAY_OF_WEEK_IN_MONTH,
				Calendar.HOUR,Calendar.HOUR_OF_DAY,Calendar.SECOND, Calendar.MILLISECOND};
		String[] stringFields = {"year","month","week_month","date","day_month","day_year",
				"day_week","day_week_month",
				"hour","hour_day","seconds","milisecond"};
		System.out.println(c.getTime().toString());
		for(int i=0;i<fields.length;i++){
			//System.out.println(stringFields[i] + "\t" + c.get(fields[i]));
			System.out.printf("%-15s %4d\n", stringFields[i],c.get(fields[i]));
		}
	}
	
	void dateCalendarConversion2(){
		Date d = new Date(0);
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
		System.out.println(cal.getTime().toString());
		cal.roll(Calendar.DATE, 60);
		System.out.println(cal.getTime().toString());
	}
	
	void dateCalendarConversion(){
		Date d = new Date();
		System.out.println(d.toString());
		Calendar c = Calendar.getInstance();
		
		c.setTime(d);
		System.out.println(c.toString());
		
		Date dOld = new Date(3600);
		System.out.println(d.before(dOld) +" "+ d.after(dOld));
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		if(dayOfWeek==Calendar.FRIDAY)
			System.out.println("It's Friday");
		else
			System.out.println("not friday");
		
		Date dStart = new Date(0);
		System.out.println(dStart.toString());
		
		int[] calendarConstants = {Calendar.DATE,Calendar.DAY_OF_MONTH,Calendar.DAY_OF_WEEK,Calendar.
				DAY_OF_WEEK_IN_MONTH,
				Calendar.DAY_OF_YEAR,Calendar.WEEK_OF_MONTH,Calendar.WEEK_OF_YEAR,Calendar.YEAR, Calendar.MONTH};
		for(int cal:calendarConstants){
			returnIntPrint(c.get(cal));
		}
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2020);
		System.out.println(cal2.getTime().toString());
		
		
	}
	
	private void returnIntPrint(int i){
		System.out.println(i);
	}
	
 	void JavaOracleTutorial(){
		
		// get the supported ids for GMT-08:00 (Pacific Standard Time)
		 String[] ids = TimeZone.getAvailableIDs(1 * 60 * 60 * 1000);
		 // if no ids were returned, something is wrong. get out.
		 if (ids.length == 0)
		     System.exit(0);

		  // begin output
		 System.out.println("Current Time");

		 // create a Pacific Standard Time time zone
		 SimpleTimeZone pdt = new SimpleTimeZone(1 * 60 * 60 * 1000, ids[0]);

		 // set up rules for Daylight Saving Time
		 pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		 pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

		 // create a GregorianCalendar with the Pacific Daylight time zone
		 // and the current date and time
		 Calendar calendar = new GregorianCalendar(pdt);
		 Date trialTime = new Date();
		 calendar.setTime(trialTime);

		 // print out a bunch of interesting things
		 System.out.println("ERA: " + calendar.get(Calendar.ERA));
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		 System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		 System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		 System.out.println("DAY_OF_WEEK_IN_MONTH: "
		                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		 System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		 System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
		 System.out.println("ZONE_OFFSET: "
		                    + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		 System.out.println("DST_OFFSET: "
		                    + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000)));

		 System.out.println("Current Time, with hour reset to 3");
		 calendar.clear(Calendar.HOUR_OF_DAY); // so doesn't override
		 calendar.set(Calendar.HOUR, 3);
		 System.out.println("ERA: " + calendar.get(Calendar.ERA));
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		 System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		 System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		 System.out.println("DAY_OF_WEEK_IN_MONTH: "
		                    + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		 System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		 System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
		 System.out.println("ZONE_OFFSET: "
		        + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // in hours
		 System.out.println("DST_OFFSET: "
		        + (calendar.get(Calendar.DST_OFFSET)/(60*60*1000))); // in hours
	}

}
