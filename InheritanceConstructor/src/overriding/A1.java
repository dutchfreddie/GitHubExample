package overriding;

public class A1 implements IA1 {

	public String VAR2="test2";
	
	public String VAR;
	
	
	
	public A1(){}
	
	public A1(String VAR){
		this.VAR=VAR;
	}
	
	@Override
	public String getVar() {
		return VAR2;
	}

}
