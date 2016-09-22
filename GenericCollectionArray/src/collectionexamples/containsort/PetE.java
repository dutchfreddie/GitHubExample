package collectionexamples.containsort;

public class PetE{

	private String name;
	private int year;
	
	public PetE(String name){
		this.name=name;
	}
	
	
	public PetE(String name,int year){
		this.name=name;
		this.year=year;
	}

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

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}	

	public String returnName(){
		return "return name from PetClass: " + name;
	}	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + name.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PetE)) {
			return false;
		}
		PetE other = (PetE) obj;
		if (!this.name.equals(other.name)) {
			return false;
		}
		return true;
	}


	
	
	
}
