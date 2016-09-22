package innerclassexamples.anonymous2;

public class ButtonClass {
	
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
	
	static{
		new IAnonymous(){

			@Override
			public void writeTo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void readFrom() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
	ButtonClass(){
		new IAnonymous(){

			@Override
			public void writeTo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void readFrom() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
	public void addIAnonymous(IAnonymous ia){
		
	}
	
	
	
	public void methodWithAnonymous(){
		new IAnonymous(){

			@Override
			public void writeTo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void readFrom() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
