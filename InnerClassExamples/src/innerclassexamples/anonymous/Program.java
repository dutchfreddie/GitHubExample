package innerclassexamples.anonymous;


public class Program {

	public static void main(String...strings){

		Food f = new Food();
		
		f.addPopCornListener(new IPopcorn(){

			@Override
			public void pop() {
				// TODO Auto-generated method stub
				System.out.println(10);
			}
			
		});
		
		f.addPopCornListener(new AbstractPopcorn(){

			@Override
			public void pop(){ 
			
				concretePopup();
				
			}

			@Override
			public void abstractPopup() {
				concretePopup();
				
			}
			
		});
		
		f.addPopCornImplListener(new IPopcorn(){

			@Override
			public void pop() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
