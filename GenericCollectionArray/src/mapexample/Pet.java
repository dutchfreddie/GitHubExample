package mapexample;

public class Pet implements Comparable<IPet>, IPet{

	private String name;
	private long year;
	
	public Pet(String name,long year){
		this.name=name;
		this.year=year;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public long getYear() {
		return year;
	}

	@Override
	public void setYear(long year) {
		this.year = year;
	}	
	
	
	@Override
	public int compareTo(IPet pc) {
		// TODO Auto-generated method stub
		return Long.valueOf(this.year).compareTo(pc.getYear());	
	}
}
