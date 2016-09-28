package enumexample;

public interface EnumInInterface {
	
	enum EnumIn{
		PAGE1,
		PAGE2;
	}
	
	EnumOutInterface returnEnumOut();

}

enum EnumOutInterface{
	PAGE1,
	PAGE2;
}
