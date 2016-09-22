package patternmatcher_split;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramGreedyReluctant {

	public static void main(String[] args) {
		String matcher = "abfoocfooedfoox";
		String[] arrayRegex = {".+foo",".+?foo",".++foo"};
		for(String regex: arrayRegex) {
			patternMatcher(regex,matcher);
		}
		
	}
	
	private static void patternMatcher(String regex, String input){
		Pattern p = Pattern.compile(regex);		
		Matcher m = p.matcher(input);
		System.out.println(regex + ":");
		
		while(m.find()){
			System.out.println("Start Pos: " + m.start() + "\tGroup: " + m.group());			
		}		
	}

}
