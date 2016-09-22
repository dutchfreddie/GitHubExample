package innerclassexamples.anonymous2;

public class Program {
	
	private IAnonymous ia = new IAnonymous(){

		@Override
		public void writeTo() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void readFrom() {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	public static void main(String...strings){
		
		
		
		ButtonClass bc = new ButtonClass();
		bc.addIAnonymous(new IAnonymous(){

			@Override
			public void writeTo() {
				
				
			}

			@Override
			public void readFrom() {
				
				
			}
			
		});
	}

}
