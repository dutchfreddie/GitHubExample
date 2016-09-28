package enumexample;


public class Program {

	public static void main(String[] args) {
		
		EnumOutInterface eo = EnumOutInterface.PAGE1;
		System.out.println(eo.toString());
		System.out.println(eo.compareTo(eo));
		//ClassWithEnums.EnumLocal.value();

		EnumInInterfaceImpl ei = new EnumInInterfaceImpl();
		System.out.println(ei.returnEnumOut().toString());
		
		
	}
	
	
	
	static void standardEnumExample(){
		
		System.out.println("SizeEnum");
		EnumDefault[] arrayEnum = EnumDefault.values();
		for(EnumDefault e:arrayEnum){
			System.out.println(e.ordinal() + " " + e.getName() + " " + e.getSize());
			
		}
		
		EnumDefault el1=EnumDefault.LARGE;
		EnumDefault el2 = EnumDefault.LARGE;
		EnumDefault em1=EnumDefault.MEDIUM;
		
		System.out.println(el1==el2);
		System.out.println(el1.equals(el2));
		System.out.println(el1==em1);
		System.out.println(el1.equals(em1));
		
		System.out.println(el1.toString());
		System.out.println(em1.toString());
		
		
		
		
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
