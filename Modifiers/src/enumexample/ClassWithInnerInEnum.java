package enumexample;

public class ClassWithInnerInEnum {

	enum InnerInSizeEnum {

		MEDIUM(8,"Medium"),
		LARGE(16,"Large");
		
		private int size;
		private String name;
		
		private InnerInSizeEnum(int size,String name){
			this.size=size;
			this.name=name;
		}

		public int getSize() {
			return size;
		}

		public String getName() {
			return name;
		}
	}
	
	private InnerInSizeEnum enumInner;
	
	public ClassWithInnerInEnum(InnerInSizeEnum enumInner){
		this.enumInner=enumInner;
	}
	
	public void printout(){
		System.out.println("Type: " + enumInner.toString());
	}
}
