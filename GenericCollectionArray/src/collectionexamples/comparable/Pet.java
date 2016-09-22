package collectionexamples.comparable;

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

	public Pet(int year, String name) {
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
	public int compareTo(Pet o) {
		if(this.getYear()<o.getYear())
			return -1;
		else if(this.getYear()>o.getYear())
			return 1;
		return 0;
	}	
	
	/*
	@Override
	public int compareTo(Pet pc) {
		
		return this.name.compareTo(pc.getName());
	}	
	*/
}
