package enumexample.main;

import enumexample.ClassWithEnums.EnumInPublic;
//import enumexample.ClassWithEnums.EnumLocal;
//import enumexample.ClassWithEnums.EnumInPublic;
import enumexample.EnumInInterface.EnumIn;
import enumexample.EnumInInterfaceImpl;
//import enumexample.EnumInInterface.EnumOut;

public class ProgramMain {

	public static void main(String[] args) {
		
		EnumInPublic.LARGE.toString();
		EnumIn.PAGE1.toString();
		
		EnumInInterfaceImpl ei = new EnumInInterfaceImpl();
		//ei.returnEnumOut().toString();

	}

}
