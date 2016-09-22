package collectionexamples.containsort;

public class PetC implements Comparable<PetC>{

	protected String name;
	protected int year;
	
	public PetC(String name){
		this.name=name;
	}
	
	public PetC(String name,int year){
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
		return "return name from PetC-Class: " + name + ";" + year;
	}
	
	
	@Override
	public int compareTo(PetC pc) {
		
		return this.name.compareTo(pc.getName());
	}	
	
	
}
