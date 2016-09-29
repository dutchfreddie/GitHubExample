package nonaccessmodifiers.abstractinterface;

public class A extends AbstractA{

	//
	//@Override
	public void abstractMa() {
		// TODO Auto-generated method stub
		
	}
	
	public void concrateA(){
		super.concreteA();
		System.out.println("from A");	
	}
	
	public void varArgsM(String s, int... x){
		System.out.println(s);
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		System.out.println(x[5]);
	}

}
