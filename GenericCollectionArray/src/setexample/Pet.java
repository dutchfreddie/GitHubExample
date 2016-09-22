package setexample;

public class Pet implements Comparable<Pet>{

	private String name;
	private int year;
	
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
	public int compareTo(Pet pc) {
		// TODO Auto-generated method stub
		
		
		return Integer.valueOf(this.year).compareTo(pc.getYear());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Pet)) {
			return false;
		}
		Pet other = (Pet) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (year != other.year) {
			return false;
		}
		return true;
	}
	

		
/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + year;
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
		if (!(obj instanceof Pet)) {
			return false;
		}
		Pet other = (Pet) obj;
		if (year != other.year) {
			return false;
		}
		return true;
	}

	*/
	
	
}
