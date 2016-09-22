package collectionexamples.set;

public class PetCEH implements Comparable<PetCEH>{

	private String name;
	private int year;	
	
	public PetCEH(String name,int year){
		this.name=name;
		this.year=year;
	}	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(PetCEH o) {
		if(this.getYear()<o.getYear())
			return -1;
		else if(this.getYear()>o.getYear())
			return 1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof PetCEH)) {
			return false;
		}
		PetCEH other = (PetCEH) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}	
}
