package collectionexamples.set;


public class PetC implements Comparable<PetC>{

	private String name;
	private int year;	
	
	public PetC(String name,int year){
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
	public int compareTo(PetC o) {
		if(this.getYear()<o.getYear())
			return -1;
		else if(this.getYear()>o.getYear())
			return 1;
		return 0;
	}

	

	
}
