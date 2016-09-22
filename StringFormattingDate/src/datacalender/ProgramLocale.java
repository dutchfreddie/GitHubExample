package datacalender;

import java.util.Locale;

public class ProgramLocale {

	public static void main(String[] args) {
		
		getAvailableLocales();
		
		
		Locale locDefault = Locale.getDefault();
		String[] arrayCo = Locale.getISOCountries();
		String[] arrayLa = Locale.getISOLanguages();

	}
	
	private static void getAvailableLocales(){
		Locale[] locAvail = Locale.getAvailableLocales();
		int x=1;
		for(Locale loc:locAvail){
			System.out.println(x + ":");
			printOutLocal(loc);
			x++;
		}
	}
	
	private static void defaultLocaleInfo(){
		Locale locDefault = Locale.getDefault();
		printOutLocal(locDefault);
	}
	
	private static void printOutLocal(Locale loc){
		printOut("country",loc.getCountry());
		printOut("language",loc.getLanguage());	
		printOut("DisplayCountry",loc.getDisplayCountry());
	}
	
	private static  void printOut(String key,String value){
		System.out.println(key + "\t" + value);
	}

}
