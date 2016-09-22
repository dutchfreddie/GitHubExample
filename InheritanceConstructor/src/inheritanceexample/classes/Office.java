package inheritanceexample.classes;

public class Office {

	public static void main(String[] args) {
		Programmer p = new Programmer ("Harry");
		p.getName();

	}

}

class Employee {
String name;
String address;
protected String phoneNumber;
public float experience;
}
class Programmer extends Employee {
Programmer (String val) {
name = val;
}
String getName() {
return name;
}
}