package complete.inheritence.example;

public class Program {

	public static void main(String[] args) {
		
		//ClassA.staticMethodA();
		
		ClassB a = new ClassB(1,"5");
		
		int x = ClassA.X;
		
		int xB = ClassB.X;
		
		ClassA a2 = new ClassA(1,"8");
		CovariantA ca = a2.returnCovariantA();
		ca.methodCovariantA();
		
		ClassB b2 = new ClassB(1,"6");
		CovariantB cb = b2.returnCovariantA();
		cb.methodCovariantA();
		cb.methodCovariantB();
		
		
		

	}

}
