package collectionexamples.containsort;

public class Pet implements Comparable<Pet>{

	protected String name;
	private int year;
	
	public Pet(String name){
		this.name=name;
	}
	
	public Pet(String name,int year){
		this.name=name;
		this.year=year;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	

	public String returnName(){
		return "return name from PetClass: " + name;
	}

	@Override
	public int compareTo(Pet pc) {
		
		return this.name.compareTo(pc.getName());
	}	
	
}
