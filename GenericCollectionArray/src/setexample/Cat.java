package setexample;

public class Cat {//implements Comparable<Object> {

	private String name;
	private int year;
	
	public Cat(String name,int year){
		this.name=name;
		this.year=year;
	}

	
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof Cat)) {
			return false;
		}
		Cat other = (Cat) obj;
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
	public int compareTo(Object arg0) {
		int x = 0;
		if(arg0 instanceof Cat){
			Cat c0 = (Cat)arg0;
			if(this.year>c0.year)
				x=1;
			if(this.year<c0.year)
				x=-1;
		}
		return x;
	}
	*/
	
	
	
	
}
