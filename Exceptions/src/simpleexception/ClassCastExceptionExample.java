package simpleexception;

import java.util.ArrayList;

public class ClassCastExceptionExample {
	public static void main(String args[]) {
		
		Printable pw = new WhiteInk();
		
		ColorInk ci = new ColorInk();
		Ink i = ci;
		ColorInk ci2 = (ColorInk) i;
		
	}
	
	private static void example1(){
		ArrayList<Ink> inks = new ArrayList<Ink>();
		inks.add(new ColorInk());
		inks.add(new BlackInk());
		Ink ink = (ColorInk)inks.get(0);
		
		Printable p = null;
		Ink white = new WhiteInk();
		BlackInk black = new BlackInk();
		p=(Printable)black;
		p = (Printable)white;
		Ink blackInk = new BlackInk();
		
		NonInk nonink = new NonInk();
		p = (Printable) nonink;   
	}
}

class Ink{}
interface Printable {}
class ColorInk extends Ink{}
class BlackInk extends Ink{}
class WhiteInk extends Ink implements Printable{}
class NonInk{}
