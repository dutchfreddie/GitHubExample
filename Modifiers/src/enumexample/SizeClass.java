package enumexample;

public class SizeClass {
	
	private static final SizeClass MEDIUM = new SizeClass(0,8,"Medium");
	private static final SizeClass LARGE = new SizeClass(1,16,"Large");
	
	private int ordinal;
	private int size;
	private String name;
	
	private SizeClass(int ordinal,int size,String name){
		this.ordinal=ordinal;
		this.size=size;
		this.name=name;
	}

	public static SizeClass[] values(){
		return new SizeClass[]{MEDIUM,LARGE};
	}
	
	public static SizeClass valueOf(String enumName){
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
