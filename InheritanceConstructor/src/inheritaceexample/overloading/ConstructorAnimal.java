package inheritaceexample.overloading;

public class ConstructorAnimal {

	static String s = "Animal";
	private String name;
	
	public ConstructorAnimal(){
		//this(makeRandomName());
		this(s);
	}
	
	public ConstructorAnimal(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
	}

	static String makeRandomName(){
		int x = (int)(Math.random()*5);
		String name = new String[]{"1","2","3","5","4"}[x];
		
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
