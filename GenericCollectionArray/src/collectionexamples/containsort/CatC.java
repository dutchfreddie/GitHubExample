package collectionexamples.containsort;

public class CatC extends PetC {

	public CatC(String name, int year) {
		super(name, year);		
	}

	public String returnName(){
		return "return name from CatC-Class: " + name + ";" + year;
	}
	
	@Override
	public int compareTo(PetC pc) {
		
		return Integer.valueOf(this.year).compareTo(pc.getYear());
	}	
}
