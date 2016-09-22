package datacalender;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ProgramDateFormat {

	public static void main(String[] args){
		//dateFormatExample();
		simpleDateFormatExample();
	}
	
	static void simpleDateFormatExample(){
		String[] patterns ={"EEEEEE/dd/MM/yyyy","dd/MMMMM/yyyy","d-MM-yyyy","dddd-MM-yyy"};
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 5);
		d = cal.getTime();
		for(String pat:patterns){
			SimpleDateFormat sdf = new SimpleDateFormat(pat,Locale.FRANCE);
			returnString(sdf.format(d));
		}
		
		String stringToParse="11-3-2015";
		String pattern = "d-M-y";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date d2 = sdf.parse(stringToParse);
			returnString(d2.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	static void dateFormatExample(){
		Calendar c = Calendar.getInstance();	
		Date d = c.getTime();
		System.out.println("Date-ToString(");
		System.out.println(d.toString());
		System.out.println("Instance");
		DateFormat dfs = DateFormat.getInstance( );
		returnString(dfs.format(d));
		System.out.println();
		System.out.println("DateInstance");
		dfs = DateFormat.getDateInstance();
		returnString(dfs.format(d));
		int[] dateFormat = {DateFormat.FULL,DateFormat.LONG,DateFormat.MEDIUM,DateFormat.SHORT};
		for(int dfS:dateFormat){
			DateFormat df = DateFormat.getDateInstance(dfS);
			returnString(df.format(d));
		}
		System.out.println();
		System.out.println("TimeInstance");
		dfs = DateFormat.getTimeInstance();
		returnString(dfs.format(d));
		for(int dfS:dateFormat){
			DateFormat df = DateFormat.getTimeInstance(dfS);
			returnString(df.format(d));
		}
		System.out.println();
		System.out.println("DateTimeInstance");
		dfs = DateFormat.getDateTimeInstance();
		returnString(dfs.format(d));
		for(int dfS:dateFormat){
			DateFormat df = DateFormat.getDateTimeInstance(dfS,dfS);
			returnString(df.format(d));
		}		
	}
	
	static void dateFormatParseExample(){
		String time = "22-2-16";
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		try {
			Date date = dfs.parse(time);
			System.out.println(date.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void returnString(String s){
		System.out.println(s);
	}
	
	private static void returnStringList(String[] list){
		for(String s:list){
			returnString(s);
		}
	}
	
}
