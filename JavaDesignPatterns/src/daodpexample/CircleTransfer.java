package daodpexample;

public class CircleTransfer implements IShapeTransfer {

	private int xPos;
	private int yPos;
	private int radius;
	/* (non-Javadoc)
	 * @see daodpexample.IShapeTransfer#getxPos()
	 */
	@Override
	public int getxPos() {
	return xPos;
	}
	/* (non-Javadoc)
	 * @see daodpexample.IShapeTransfer#setxPos(int)
	 */
	@Override
	public void setxPos(int xPos) {
	this.xPos = xPos;
	}
	/* (non-Javadoc)
	 * @see daodpexample.IShapeTransfer#getyPos()
	 */
	@Override
	public int getyPos() {
	return yPos;
	}
	/* (non-Javadoc)
	 * @see daodpexample.IShapeTransfer#setyPos(int)
	 */
	@Override
	public void setyPos(int yPos) {
	this.yPos = yPos;
	}
	/* (non-Javadoc)
	 * @see daodpexample.IShapeTransfer#getRadius()
	 */
	@Override
	public int getRadius() {
	return radius;
	}
	/* (non-Javadoc)
	 * @see daodpexample.IShapeTransfer#setRadius(int)
	 */
	@Override
	public void setRadius(int radius) {
	this.radius = radius;
	}
	
}
