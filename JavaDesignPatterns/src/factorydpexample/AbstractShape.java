package factorydpexample;

public abstract class AbstractShape implements IShape {

	protected int xSize;
	protected int ySize;
	protected String name;
	protected ShapeEnum enumShape;	
	
	public AbstractShape(ShapeEnum enumShape, int xSize, int ySize, String name){
		this.enumShape=enumShape;
		this.xSize = xSize;
		this.ySize=ySize;
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	
	
	
}
