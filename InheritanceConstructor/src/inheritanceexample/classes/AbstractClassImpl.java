package inheritanceexample.classes;

public class AbstractClassImpl extends AbstractClass{

	String name3;
	public AbstractClassImpl(String name2,String name3) {
		super(name2);
		this.name3=name3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2(int i2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub		
	}
	
	@Override
	public void nonAbstractDoStuff(){
		super.nonAbstractDoStuff();
		System.out.println("test");
	}

}
