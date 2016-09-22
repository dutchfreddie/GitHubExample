package mapexample;

public class TwoPetObj implements Comparable<TwoPetObj>{
	
	private IPet pet1;
	private IPet pet2;
	
	public TwoPetObj(){
		
	}
	
	public TwoPetObj(IPet pet1, IPet pet2){
		this.pet1=pet1;
		this.pet2=pet2;
	}

	public IPet getPet1() {
		return pet1;
	}

	public void setPet1(IPet pet1) {
		this.pet1 = pet1;
	}

	public IPet getPet2() {
		return pet2;
	}

	public void setPet2(IPet pet2) {
		this.pet2 = pet2;
	}

	@Override
	public int compareTo(TwoPetObj o) {
		long thisId1 = this.getPet1().getYear();
		long thisId2 = this.getPet2().getYear();
		long oId1 = o.getPet1().getYear();
		long oId2 = o.getPet2().getYear();
		
		if(thisId1==oId1){
			if(thisId2==oId2)
				return 0;
			else if(thisId2>oId2)
				return 1;
			else if(thisId2<oId2)
				return -1;
		}
		
		else 
			return -1;
		
		return 0;
	}

}
