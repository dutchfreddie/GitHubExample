package implementationpackage;

import interfacepackage.SubInterface;
import interfacepackage.SubInterface2;

public class InterfaceImpl implements SubInterface,SubInterface2 {

	@Override
	public void returnSuperString() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subInterfaceString() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doStuff(int... x) {
		for(int i:x)
			System.out.println(i);
		
	}

	@Override
	public void doStuff2(int[] list) {
		
		
	}
	
	

}
