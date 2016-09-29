package enumexample;


public class Program {

	public static void main(String[] args) {
		
		comparingEnums();
		
	}
	
	static void accessModifierEnums(){
		EnumOutInterface eo = EnumOutInterface.PAGE1;
		System.out.println(eo.toString());
		System.out.println(eo.compareTo(eo));
		
		EnumInInterfaceImpl ei = new EnumInInterfaceImpl();
		System.out.println(ei.returnEnumOut().toString());
		
		ClassWithEnums cwe = new ClassWithEnums();
		EnumOutDefault le = cwe.allLocalEnums2();
		System.out.println(le);		
	}
	
	static void comparingEnums(){
		
		System.out.println("SizeEnum");
		EnumDefault[] arrayEnum = EnumDefault.values();
		for(EnumDefault e:arrayEnum){
			System.out.println(e.ordinal() + " " + e.name() + " " + e.toString());  			
		}	
		System.out.println();
		
		EnumDefault eL1=EnumDefault.LARGE;
		EnumDefault eL2 = EnumDefault.LARGE;
		EnumDefault eM=EnumDefault.MEDIUM;
		EnumDefault eH=EnumDefault.HUGE;
		
		System.out.println(eL1==eL2);
		System.out.println(eL1.equals(eL2));
		System.out.println(eL1==eM);
		System.out.println(eL1.equals(eM));
		System.out.println(eL1.compareTo(eL2));
		System.out.println(eL1.compareTo(eM));
		System.out.println(eL1.compareTo(eH));
		System.out.println(eM.compareTo(eL2));
		System.out.println(eM.compareTo(eM));
		System.out.println(eM.compareTo(eH));
		
		try{
			System.out.println(EnumDefault.valueOf("Large").name());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			System.out.println(EnumDefault.valueOf("LARGE"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	static void standardEnumExample(){
		
		System.out.println("SizeEnum");
		EnumDefault[] arrayEnum = EnumDefault.values();
		for(EnumDefault e:arrayEnum){
			System.out.println(e.ordinal() + " " + e.name() + " " + e.toString());  			
		}		
		
		System.out.println("SizeClass");
		EnumFromClass[] arrayClass = EnumFromClass.values();
		for(EnumFromClass e:arrayClass){
			System.out.println(e.getOrdinal() + " " + e.getName() + " " + e.getSize());
			System.out.println(e.toString());
		}
		
		try{
			EnumFromClass sc = EnumFromClass.valueOf("Large");
		}
		
		catch(Exception e){
			//e.printStackTrace();
		}
		
		
	}

}
