package innerclassexamples.anonymous;

public class FoodButton {
	
	private int x;
	
	public void createComposite(){
		
		Food f = new Food();
		int y=10;
		final int yFinal=10;
		
		f.addPopCornListener(new IPopcorn(){

			@Override
			public void pop() {
				System.out.println(x);
				//System.out.println(y);
				System.out.println(yFinal);
				
			}
			
		});
	}

}
