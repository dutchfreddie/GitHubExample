package enumexample;

public enum EnumDefault {

	MEDIUM(8,"Medium"),
	LARGE(16,"Large"),
	HUGE(32,"Huge");
	
	private int size;
	private String name;
	
	private EnumDefault(int size,String name){
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
