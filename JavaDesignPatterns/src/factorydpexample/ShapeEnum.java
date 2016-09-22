package factorydpexample;

public enum ShapeEnum {
	
	CIRCLE,
	RECTANGLE,
	SQUARE;
	
	@Override
	public String toString(){
		ShapeEnum se = ShapeEnum.valueOf(super.name());
		switch(se){
		case CIRCLE:
			return "Circle";
			
		case RECTANGLE:
			return "Rectangle";			
		case SQUARE:
			return  "Square";				
		}
		
		return super.toString();
	}

}
