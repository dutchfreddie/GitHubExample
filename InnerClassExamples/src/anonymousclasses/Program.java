package anonymousclasses;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Food f = new Food();
		
		f.addPopCornListener(new IPopcorn(){

			@Override
			public void pop() {
				// TODO Auto-generated method stub
				System.out.println(10);
			}
			
		});
		
		f.addPopCornListener(new IPopcorn(){

			@Override
			public void pop() {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		f.addPopCornListener(new IPretzel(){

			@Override
			public void pop() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void crispel() {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}
