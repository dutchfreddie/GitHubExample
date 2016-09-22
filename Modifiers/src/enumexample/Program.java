package enumexample;


public class Program {

	public static void main(String[] args) {
		
		

	}
	
	static void standardEnumExample(){
		
		System.out.println("SizeEnum");
		SizeEnum[] arrayEnum = SizeEnum.values();
		for(SizeEnum e:arrayEnum){
			System.out.println(e.ordinal() + " " + e.getName() + " " + e.getSize());
			
		}
		
		SizeEnum el1=SizeEnum.LARGE;
		SizeEnum el2 = SizeEnum.LARGE;
		SizeEnum em1=SizeEnum.MEDIUM;
		
		System.out.println(el1==el2);
		System.out.println(el1.equals(el2));
		System.out.println(el1==em1);
		System.out.println(el1.equals(em1));
		
		System.out.println(el1.toString());
		System.out.println(em1.toString());
		
		
		
		
		System.out.println("SizeClass");
		SizeClass[] arrayClass = SizeClass.values();
		for(SizeClass e:arrayClass){
			System.out.println(e.getOrdinal() + " " + e.getName() + " " + e.getSize());
			System.out.println(e.toString());
		}
		
		try{
			SizeClass sc = SizeClass.valueOf("Large");
		}
		catch(Exception e){
			//e.printStackTrace();
		}
		
		
	}

}
