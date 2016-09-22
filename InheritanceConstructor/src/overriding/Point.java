package overriding;

public class Point {

	private int xPos, yPos;
	public Point(int x, int y) {
	xPos = x;
	yPos = y;
	}
	// override the equals method to perform
	// "deep" comparison of two Point objects
	public boolean equals(Point other){
	if(other == null)
	return false;
	// two points are equal only if their x and y positions are equal
	if( (xPos == other.xPos) && (yPos == other.yPos) )
	return true;
	else
	return false;
	}
}
