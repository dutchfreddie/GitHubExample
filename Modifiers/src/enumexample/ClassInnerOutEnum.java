package enumexample;

public class ClassInnerOutEnum {

}

enum InnerOutSizeEnum {

	MEDIUM(8,"Medium"),
	LARGE(16,"Large");
	
	private int size;
	private String name;
	
	private InnerOutSizeEnum(int size,String name){
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
