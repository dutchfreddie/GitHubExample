package enumexample.main;

import enumexample.ClassWithEnums.EnumInPublic;
//import enumexample.ClassWithEnums.EnumInDefault;
//import enumexample.ClassWithEnums.EnumLocal;



import enumexample.EnumInInterface.EnumIn;
import enumexample.ClassWithEnums;
import enumexample.EnumInInterfaceImpl;
//import enumexample.EnumInInterface.EnumOut;
//import enumexample.LocalEnum;

public class ProgramMain {

	public static void main(String[] args) {
		
		EnumInPublic.LARGE.toString();
		EnumIn.PAGE1.toString();
		
		//ClassWithEnums.LocalEnum le;
		
		EnumInInterfaceImpl ei = new EnumInInterfaceImpl();
		//ei.returnEnumOut().toString();
		
		ClassWithEnums cwe = new ClassWithEnums();
		//LocalEnum le = cwe.allLocalEnums2();
		//System.out.println(le);

	}

}
