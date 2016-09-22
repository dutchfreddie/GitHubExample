package datacalender;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ProgramDateFormatLocal {

	public static void main(String[] args) {
		dateFormatExample();
	}
	
	static void dateFormatParseExample(){
		String time = "2/2/16";
		Locale loc = Locale.FRANCE;
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat dfs2 = DateFormat.getDateInstance(DateFormat.SHORT,loc);
		try {
			Date date = dfs2.parse(time);
			System.out.println(date.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	static void dateFormatExample(){
		//Locale loc = Locale.FRANCE;
		//Calendar c = Calendar.getInstance(loc);
		Locale loc = new Locale("nl");
		Calendar c = Calendar.getInstance();	
		Date d = c.getTime();
		System.out.println("Date-ToString(");
		System.out.println(d.toString());
		System.out.println("\nInstance");
		DateFormat dfs = DateFormat.getInstance();
		returnString(dfs.format(d));
		System.out.println("\nDateInstance");
		int[] dateFormat = {DateFormat.FULL,DateFormat.LONG,DateFormat.MEDIUM,DateFormat.SHORT};
		for(int dfS:dateFormat){			
				DateFormat df = DateFormat.getDateInstance(dfS,loc);
				returnString(df.format(d));
			
		}
		System.out.println("\nTimeInstance");
		for(int dfS:dateFormat){
			DateFormat df = DateFormat.getTimeInstance(dfS,loc);
			returnString(df.format(d));
		}
		System.out.println("\nDateTimeInstance");
		for(int dfS:dateFormat){
			DateFormat df = DateFormat.getDateTimeInstance(dfS,dfS,loc);
			returnString(df.format(d));
		}		
	}
	
	private static void returnString(String s){
		System.out.println(s);
	}

}
