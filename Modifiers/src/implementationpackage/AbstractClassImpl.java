package implementationpackage;

import abstractpackage.AbstractClass;

public class AbstractClassImpl extends AbstractClass {
	
	public AbstractClassImpl(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	private String textClass;
	
	
	
	@Override
	public void returnText() {
		System.out.println(textClass);
		
	}

	@Override
	public void subInterfaceString() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnSuperString() {
		// TODO Auto-generated method stub
		
	}
	
	//public abstract void illegalMethod();

	
}
