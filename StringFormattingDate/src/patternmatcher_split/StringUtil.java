package patternmatcher_split;

public class StringUtil {

	public static void returnString(String s){
		System.out.println(s);
	}
	
	public static void returnStringList(String[] listStrings){
		for(String s:listStrings)
			returnString(s);
	}
}
