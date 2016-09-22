package inheritanceexample.main;

import inheritaceexample.overloading.Animal;
import inheritaceexample.overloading.ConstructorAnimal;
import inheritaceexample.overloading.Dog;
import inheritaceexample.overloading.Horse;
import inheritaceexample.overloading.UseAnimals;
import inheritanceexample.classes.SubClass;
import inheritanceexample.classes.SuperClass;
import inheritanceexample.interfaces.ISubClass;
import inheritanceexample.interfaces.ISuperClass;

public class Program {

	public static void main(String[] args) {
		ConstructorAnimal ca = new ConstructorAnimal();
		System.out.println(ca.getName());
		
	}
	
	static void examplesSubSuper(){
		SubClass sc = new SubClass();
		sc.m1();
		sc.m2(1);
		sc.m3();
		sc.m4();
		sc.m5();
		System.out.println(sc.toString());
		System.out.println();
		Object o = sc;
		System.out.println(o.toString());
		System.out.println();
		SuperClass suC = sc;
		suC.m1();
		suC.m2(2);
		suC.m5();
		System.out.println(suC.toString());
		System.out.println();
		ISubClass sc2 = new SubClass();
		sc2.m1();
		sc2.m2(1);
		sc2.m3();
		sc2.m4();
		sc2.m5();
		System.out.println(sc2.toString());
		System.out.println();
		ISuperClass suC2 = new SuperClass();
		suC2.m1();
		suC2.m2(1);
		suC2.m5();
		System.out.println(suC2.toString());
	}

	static void overloadEtc(){
		// TODO Auto-generated method stub
				UseAnimals ua = new UseAnimals();
				Animal a = new Animal(1);
				Horse h = new Horse(1);
				Animal ah = new Horse(1);
				Animal aha = h;
				//Horse ha = (Horse) a;
				ua.doStuff(a); 
				ua.doStuff(h); 
				ua.doStuff(ah);
				ua.doStuff(aha);
				//ua.doStuff(ha);
				/*
				 *Animal version executed
				 *Horse version executed
				 *Animal version executed 
				 * 
				 */
				
				int i = 1;
				double d = 2.9;
				ua.returnEntry(i);
				ua.returnEntryInt((int) d);
	}

	static void test(){
		Animal an = new Animal();		
		System.out.println();
		Animal a = new Animal(1);
		a.returnObject();
		Dog d3 = new Dog(1);
		d3.returnObject();
		//Dog d = (Dog)a;
		Object o = (Object)a;
		System.out.println(a.toString());
		System.out.println(o.toString());
		//d.doDogStuff();
		a.doStuff();
		Animal a2 = new Dog(1);
		a2.doStuff();
		//a2.doDogStuff();
		Dog d = (Dog) a2;
		d.doStuff();
		d.doDogStuff();
	}


}
