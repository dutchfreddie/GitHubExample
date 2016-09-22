package equalscomparable;

public class PetClass implements Comparable<Object>{

	private String name;
	private int year;
	private double size;	
	

	public PetClass(String name, int year, double size) {
		this.name=name;
		this.year=year;
		this.size=size;
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

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
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
		if (!(obj instanceof PetClass)) {
			return false;
		}
		PetClass other = (PetClass) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		
		return true;
	}

	@Override
	public int compareTo(Object arg0) {
		if(arg0 instanceof PetClass){
			PetClass pc = (PetClass)arg0;
			return this.getName().compareTo(pc.getName());					
		}
		
		return 0;
	}

	
	

		
}
