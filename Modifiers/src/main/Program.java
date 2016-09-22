package main;

import finalpackage.SubClass;
import finalpackage.SuperClass;
import implementationpackage.AbstractClassImpl;
import implementationpackage.InterfaceImpl;

public class Program {

	public static void main(String[] args) {
		
		AbstractClassImpl aci = new AbstractClassImpl("Hallo Wereld");
		
		aci.returnText();
		aci.returnTextImpl();
		
		System.out.println("");
		
		SuperClass spC = new SuperClass();
		SubClass sbC = new SubClass();
		
		spC.returnTextFinal();
		spC.returnText();
		sbC.returnTextFinal();
		sbC.returnText();
		
		InterfaceImpl ifi = new InterfaceImpl();
		int[] list = {1,2,3};
		int[] list2 = new int[5];
		
		list2[7] = 5;
		ifi.doStuff(list2);
	}
}
