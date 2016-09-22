package collectionexamples.nongeneric;

public class NonGenericClassTest {

	public static void main(String []args) {
		BoxPrinter value1 = new BoxPrinter(new Integer(10));
		System.out.println(value1);
		Integer intValue1 = (Integer) value1.getValue();
		BoxPrinter value2 = new BoxPrinter("Hello world");
		System.out.println(value2);
		// OOPs! by mistake, we did (Integer) cast instead of (String)
		try{
			Integer intValue2 = (Integer) value2.getValue();	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		BoxPrinterG<String> valueG = new BoxPrinterG<>("help");
		System.out.println(valueG.getValue());
		
		String i = valueG.getValue();
		
	}
}

//The program demonstrates "Object" based implementation and associated lack of type safety
class BoxPrinter {
	private Object val;
	public BoxPrinter(Object arg) {
		val = arg;
	}

	/*
	public String toString() {
		return "[" + val + "]";
	}
	*/
	
	public Object getValue() {
		return val;
	}
}
class BoxPrinterG<T> {
	private T val;
	public BoxPrinterG(T arg) {
		val = arg;
	}

	/*
	public String toString() {
		return "[" + val + "]";
	}
	*/
	
	public T getValue() {
		return val;
	}
}
