package inheritanceexample.simpleexample;

public class Animal {
public String name;
public Animal(String name) {
this.name = name;
 }

 public Animal() {
 this(returnPrintFromAnimal());
 System.out.println("out of the constructor Animal");
 }

 public static String makeRandomName() {
 int x = (int) (Math.random() * 5);
 String name = new String[] {"Fluffy", "Fido",
"Rover", "Spike",
"Gigi"}[x];
 return name;
 }
 
 public static String returnPrintFromAnimal(){return "";}
 
 public static void doStuff(){System.out.println("Do stuff from animal");}
}
