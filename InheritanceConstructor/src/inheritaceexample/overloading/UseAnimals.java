package inheritaceexample.overloading;

public class UseAnimals {
	
	public void doStuff(Animal a){
		System.out.println("Animal version executed");
	}
	
	public void doStuff(Horse h){
		System.out.println("Horse version executed");
	}
	
	public void doStuff(Dog d){
		System.out.println("Dog version executed");
	}
	
	public void returnEntry(double s){
		System.out.println(s);
	}

	public void returnEntryInt(int s){
		System.out.println(s);
	}
}
