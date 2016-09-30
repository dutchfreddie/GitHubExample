package methods.shadowing;

public class PassingVariables {

	private int x;
	private int y;
	
	public PassingVariables(int x,int y){
		this.setX(x);
		this.setY(y);
	}	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void increaseX(){
		x = x+10;
	}
	
	public void increaseY(){
		y = y+10;
	}
	
	public int shadowIncrease(int y){
		this.y = this.y+20;
		y=y+10;
		return y;
	}
}
