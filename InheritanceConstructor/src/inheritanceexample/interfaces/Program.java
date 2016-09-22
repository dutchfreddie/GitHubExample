package inheritanceexample.interfaces;

public class Program {

	public static void main(String[] args) {
		ClassImpl impl = new ClassImpl();
		impl.m1();
		
		ISubClass2 impl2 = new ClassImpl();
		int x = impl2.X;
		((ClassImpl)impl2).m6();
		
	
		
	}
}

class Programmer {
void print() {
System.out.println("Programmer - Mala Gupta");
}
}
class Author extends Programmer {
void print() {
System.out.println("Author - Mala Gupta");
}
}
