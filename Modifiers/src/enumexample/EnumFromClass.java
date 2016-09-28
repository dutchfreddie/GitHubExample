package enumexample;

public class EnumFromClass {
	
	private static final EnumFromClass MEDIUM = new EnumFromClass(0,8,"Medium");
	private static final EnumFromClass LARGE = new EnumFromClass(1,16,"Large");
	
	private int ordinal;
	private int size;
	private String name;
	
	EnumFromClass(int ordinal,int size,String name){
		this.ordinal=ordinal;
		this.size=size;
		this.name=name;
	}

	public static EnumFromClass[] values(){
		return new EnumFromClass[]{MEDIUM,LARGE};
	}
	
	public static EnumFromClass valueOf(String enumName){
		switch(enumName){
		case "Medium":
			return MEDIUM;
		case "Large":
			return LARGE;
		default:
			throw new IllegalArgumentException();			
		}
	}	
	
	
	public int getOrdinal() {
		return ordinal;
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString(){
		return this.getName().toUpperCase();
	}
	
	

}
