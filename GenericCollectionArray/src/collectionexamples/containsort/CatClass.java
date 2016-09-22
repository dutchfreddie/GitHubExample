package collectionexamples.containsort;

public class CatClass extends PetE implements ICatClass{

	private String race;
	
	public CatClass(String name, int year) {
		super(name, year);
		
	}
	
	public CatClass(String name, int year, String race) {
		super(name, year);
		this.race = race;
		
	}

	@Override
	public String returnName(){
		return "return name CatClass: " + this.getName();
	}
	
	public String returnName2(){
		return "return name from CatClass 2" + this.getName();
	}
	

}
