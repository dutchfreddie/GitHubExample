package inheritanceexample.classes;

//import inheritanceexample.interfaces.ISubClass;
import inheritanceexample.interfaces.*;

public class SubClass extends SuperClass implements ISubClass{

	private int instVarInt2;
	
	public SubClass(){}
	
	public SubClass(int instVarInt, String instVarString, int instVarInt2) {
		super(instVarInt, instVarString);
		this.instVarInt2=instVarInt2;
		// TODO Auto-generated constructor stub
	}

	public void m2(int i){
		System.out.println("Execute m2 from SubClass");
	}
	
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Execute m3 from SubClass");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Execute m4 from SubClass");
	}
	
	public void m5(){
		super.m5();
		System.out.println("Toevoeging vanuit SubClass aan m5");
	}

}
