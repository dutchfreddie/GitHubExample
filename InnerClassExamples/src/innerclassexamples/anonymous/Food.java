package innerclassexamples.anonymous;

public class Food {

	private IPopcorn popcorn = new IPopcorn(){

		@Override
		public void pop() {			
			
		}
		
	};
	
	public void addPopCornListener(IPopcorn p){
		
	}
	
	

	public void addPopCornImplListener(Object pop) {
		// TODO Auto-generated method stub
		
	}
	
}
