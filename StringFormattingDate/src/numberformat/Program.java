package numberformat;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//getInstanceExample();
		//getIntegerInstanceExample();
		getPercentInstanceExample();
		//getCurrencyInstanceExample();
	}
	
	private static void getInstanceExample(){
		double[] listDouble = {5.555,2.666,2136.2,20.333333,20.2};
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
		//nf.setMaximumIntegerDigits(2);
		//nf.setMinimumIntegerDigits(2);
		//nf.setMaximumFractionDigits(2);
		//nf.setMinimumFractionDigits(2);
		for(double d:listDouble){
			System.out.println(nf.format(d));			
		}	
		
		String[] stringList = {"1,555","2011,99","2.45"};
		for(String s:stringList){
			Number n;
			try {
				n = nf.parse(s);
				System.out.println(n);// + " " + i);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}	
	}
	
	private static void getIntegerInstanceExample(){
		double[] listDouble = {5.555,2.666,2136.2,20.333333,20.2};
		NumberFormat nf = NumberFormat.getIntegerInstance();
		//nf.setMaximumIntegerDigits(5);
		//nf.setMinimumIntegerDigits(2);
		//nf.setMaximumFractionDigits(4);
		//nf.setMinimumFractionDigits(2);
		for(double d:listDouble){
			System.out.println(nf.format(d));			
		}		
	}
	
	private static void getPercentInstanceExample(){
		double[] listDouble = {5.555,2.666,2136.2,20.333333,20.2};
		NumberFormat nf = NumberFormat.getPercentInstance();
		//nf.setMaximumIntegerDigits(5);
		//nf.setMinimumIntegerDigits(2);
		//nf.setMaximumFractionDigits(4);
		//nf.setMinimumFractionDigits(2);
		for(double d:listDouble){
			System.out.println(nf.format(d));			
		}
		
		String[] stringList = {"1,555","2011,99","2.45"};
		for(String s:stringList){
			Number n;
			try {
				n = nf.parse(s);
				System.out.println(n);// + " " + i);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}	
	}
	
	private static void getCurrencyInstanceExample(){
		double[] listDouble = {5.555,2.666,2136.2,20.333333,20.2};
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//nf.setMaximumIntegerDigits(5);
		//nf.setMinimumIntegerDigits(2);
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(2);
		
		for(double d:listDouble){
			System.out.println(nf.format(d));			
		}		
	}

}
