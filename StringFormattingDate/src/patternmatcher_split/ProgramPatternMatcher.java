package patternmatcher_split;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ProgramPatternMatcher {

	public static void main(String[] args) {
		//String pattern = "C:\\\\.+\\.txt";
		//String matcher = "ggC:\\frederik.txtggC:\\frederik.txt";
		
		//String pattern = "(\\d\\d)\\1";
		//String matcher = "121212121213";
		
		//String pattern = ("((\\w+)*\\s)\\1");
		//String matcher = "FredFred FredFred FredFred FredFres FredFred FredFred FredFreg FredFreg";
		
		String pattern = ("\\d{4}\\s*[A-Z]{2}");
		String matcher = "fred jansen 3100AB 10 km";		
		//patternMatcher(pattern,matcher);
		
		pattern = "\\d{2}";
		matcher = "fif45sss567hh458";
		patternMatcherSimple(pattern,matcher);
		
		
	}
	
	private static void patternMatcherSimple(String pattern, String matcher){
		Pattern p = Pattern.compile(pattern);		
		Matcher m = p.matcher(matcher);
		System.out.println(matcher);
		while(m.find()){
			int start = m.start();
			String group = m.group();
			StringUtil.returnString(start + ": " + group);
		
			
		}
		System.out.println(matcher);
	}
	
	
	private static void patternMatcher(String pattern, String matcher){
		Pattern p = Pattern.compile(pattern);		
		Matcher m = p.matcher(matcher);
		System.out.println(matcher);
		while(m.find()){
			int start = m.start();
			String group = m.group();
			StringUtil.returnString(start + ": " + group);
			matcher = matcher.replace(group,"");
			
		}
		System.out.println(matcher);
		
		p = Pattern.compile("\\d{0,4}\\s*km");
		m = p.matcher(matcher);
		while(m.find()){
			int start = m.start();
			String group = m.group();
			StringUtil.returnString(start + ": " + group);
			
			
		}
		System.out.println(matcher);
		
	}
	
}

