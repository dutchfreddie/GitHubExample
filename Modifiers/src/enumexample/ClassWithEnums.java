package enumexample;

public class ClassWithEnums {

	public enum EnumInPublic {

		MEDIUM(8,"Medium"),
		LARGE(16,"Large");
		
		private int size;
		private String name;
		
		EnumInPublic(int size,String name){
			this.size=size;
			this.name=name;
		}

		public int getSize() {
			return size;
		}

		public String getName() {
			return name;
		}
	}
	
	enum EnumInDefault{
		PAGE1,
		PAGE2;
	}
	
	private EnumInPublic enumInner;
	
	public ClassWithEnums(EnumInPublic enumInner){
		this.enumInner=enumInner;
	}
	
	public static void allEnums(){
		for(EnumInPublic e:EnumInPublic.values())
				System.out.println(e.toString());
	}
	
	public static void allLocalEnums(){
		for(LocalEnum e:LocalEnum.values())
				System.out.println(e.toString());
	}
	
	public void printout(){
		System.out.println("Type: " + enumInner.toString());
	}
	
	
}

//only default access modifier
enum LocalEnum{
	PAGE1,PAGE2;
}

class OutsideClass{
	public static void allLocalEnums(){
		for(LocalEnum e:LocalEnum.values())
				System.out.println(e.toString());
	}
}
