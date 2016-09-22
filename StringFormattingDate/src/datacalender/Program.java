package datacalender;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		int jaar = cal.get(Calendar.YEAR);
		String pattern="dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String datum = "01/01/" + jaar;
		Date startJaar=null;
		
		try {
			startJaar = sdf.parse(datum);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar calBefore = Calendar.getInstance();
		calBefore.setTime(startJaar);
		if(cal.before(calBefore))
			System.out.println("yes");
		else
			System.out.println("no");
			
		
		/*
		DateCalendarExample dce = new DateCalendarExample();
		dce.dateCalendarConversion();
		dce.JavaOracleTutorial();
		dce.dateCalendarConversion2();
		*/
		
		//DateFormatExample dfe = new DateFormatExample();
		//dfe.dateFormatExample();
		//dfe.simpleDateFormatExample();
	}
	
	private static void returnString(String s){
		System.out.println(s);
	}
	
	private static void returnStringList(String[] list){
		for(String s:list){
			returnString(s);
		}
	}
	
	private static void otherExample(){
		Calendar c = Calendar.getInstance();	
		Date d = c.getTime();
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,Locale.FRENCH);
		String s = df.format(d);
		String[] list = s.split(" ");
		returnString(s);
		returnStringList(list);
		
		try {
			Date d2 = df.parse(s);
			Calendar c2 = Calendar.getInstance();
			c2.setTime(d2);
			DateFormat df1 = DateFormat.getDateInstance();
			returnString(df1.format(c2.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void firsE(){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH,5);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		int i = Calendar.SATURDAY;
		if(dayOfWeek==i)
			System.out.println("correct");			
		int monthOfYear = c.get(Calendar.MONTH);
		System.out.println("month: " + monthOfYear);
		int i2 = Calendar.FEBRUARY;
		if(monthOfYear == i2)
			System.out.println("correct month");
		
		DateFormat df = DateFormat.getInstance();
		Calendar c2 = df.getCalendar();
		
		int dayOfWeek2 = c2.get(Calendar.DAY_OF_WEEK);
		int x2 = c2.get(Calendar.MONTH);
		int x3 = c2.get(Calendar.YEAR);
		System.out.println(dayOfWeek2);
	}

	private static void secondE(){
		Calendar c = Calendar.getInstance();		
		System.out.println(c.getTime().toString());		
		DateFormat df = DateFormat.getInstance();
		Calendar c2 = df.getCalendar();
		System.out.println(c2.getTime().toString());
		c2.set(Calendar.YEAR, 1501);
		System.out.println(c2.getTime().toString());
	}
	
	private static void thirdE(){
		Calendar c = Calendar.getInstance();	
		Date d = c.getTime();
		System.out.println(d.toString());		
		DateFormat df1 = DateFormat.getInstance();
		DateFormat df2 = DateFormat.getDateInstance();
		DateFormat df3 = DateFormat.getDateTimeInstance();
		
		String s1 = df1.format(d);
		String s2 = df2.format(d);
		String s3 = df3.format(d);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		Locale l = Locale.FRANCE;
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, l);
		System.out.println(df4.format(d));
		
		String[] list = Locale.getISOCountries();
		String[] listLanguages = Locale.getISOLanguages();
		
		Map<String,String> mapList = new HashMap<String,String>();
		returnStringList(list);
		returnStringList(listLanguages);
		
		Locale[] listLocale = Locale.getAvailableLocales();
		for(Locale ll:listLocale){
			returnString(ll.getCountry());
			
		}
		returnString("number countries: " + list.length);
		returnString("" + listLanguages.length);
	}
	
	static void dateExample(){
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.toGMTString());
		System.out.println(d.getTime());
		
	}
	
	static void calendarExample(){
		Date d1 = new Date();
		Date d2 = new Date();
		
		
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d1);
		returnPrint(c1.getTime().toString());
		returnPrint(c2.getTime().toString());
		c1.add(Calendar.DAY_OF_WEEK, 5);
		c2.roll(Calendar.DAY_OF_WEEK, 5);
		returnPrint(c1.getTime().toString());
		returnPrint(c2.getTime().toString());
	}
	
	static void dateFormatLocal(){
		Date d =new Date();
		Locale l = new Locale("it");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,l);
		System.out.println(df.format(d));
		
		Locale locBR = new Locale("pt"); // Brazil
		Locale locDK = new Locale("da", "DK"); // Denmark
		Locale locIT = new Locale("it", "IT"); // Italy
		System.out.println("def " + locBR.getDisplayCountry());
		System.out.println("loc " + locBR.getDisplayCountry(locBR));
		System.out.println("def " + locDK.getDisplayLanguage());
		System.out.println("loc " + locDK.getDisplayLanguage(locDK));
		System.out.println("D>I " + locDK.getDisplayLanguage(locIT));
	}
	
	static void dateFormatExample(){
		Date d1 = new Date();
		DateFormat[] dfa = new DateFormat[6];
		String [] list = new String[6];
		int i =0;
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
	
		for(DateFormat df : dfa){
			String s = df.format(d1);
			System.out.println(s);
			list[i] = s;
			i++;			
		}
		Date d2 = null;
		System.out.println();
		
		
	}
	
	private static void returnPrint(String s){
		System.out.println(s);
	}
}
