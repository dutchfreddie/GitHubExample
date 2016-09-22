package inheritaceexample.overloading;

public class Program {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.doStuff();
		Dog d = new Dog();
		d.doStuff();
		d.doDogStuff();
		
		
		
		
		AbstractAnimal aa = new Dog();
		aa.doStuff();
		System.out.println();
		
		UseAnimals ua = new UseAnimals();
		ua.doStuff(a);ua.doStuff(d);
		
		Dog d2 = (Dog)a;
		d2.doStuff();d2.doDogStuff();
		
		Object o = new Dog();
	
		Dog d3 = (Dog)o;
		d3.doStuff();d3.doDogStuff();
		Object o2 = a;
		Animal a2 = (Animal) o2;
		a2.doStuff();

	}

}
