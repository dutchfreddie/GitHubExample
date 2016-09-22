package complete.inheritence.example;

public abstract class AbstractA extends AbstractA1{

	private int variableI;
	
	public AbstractA(int variableI){
		this.setVariableI(variableI);
	}
	
	abstract void methodAbstractA();
	
	public void concreteMethodAbstractA(){
		
	}
	
	public static void staticAbstractA(){
		
	}

	public int getVariableI() {
		return variableI;
	}

	public void setVariableI(int variableI) {
		this.variableI = variableI;
	}
}
