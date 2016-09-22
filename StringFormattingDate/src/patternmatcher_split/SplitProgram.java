package patternmatcher_split;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitProgram {

	public static void main(String[] args) {
		String s = "    @System  Out     Println    ";
		
		String regexp = "\\s+";
		String[] splitter = s.split(regexp);
		int x = 1;
		for(String ss:splitter){
			System.out.println(x + ":" + ss + ";");
			x++;
		}
		
		Scanner scan = new Scanner(s.trim());
		scan.useDelimiter(regexp);
		x=1;
		while(scan.hasNext()){
			System.out.println(x + ": " + scan.next());
			x++;
		}
		scan.close();
		
		String regexpChar = "\\w+";
		Pattern p = Pattern.compile(regexpChar);
		Matcher m = p.matcher(s);
		x = 1;
		while(m.find()){
			System.out.println(x + ": " + m.group() + ";");
			x++;
		}
		
		
	}

}
