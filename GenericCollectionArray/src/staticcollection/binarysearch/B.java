package staticcollection.binarysearch;

public class B {

	private int age;
	private String name;
	
	public B(int age, String name){
		this.setAge(age);
		this.setName(name);		
	}
	/*
	public String toString(){
		
		return "Persoon is " + name + " en is " + age + " jaar";
		
	}
	*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		if (!(obj instanceof B)) {
			return false;
		}
		B other = (B) obj;
		if (age != other.age) {
			return false;
		}
		return true;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
