package enumexample;

public interface EnumInInterface {
	
	public enum EnumIn{
		PAGE1,
		PAGE2;
	}
	
	EnumOutInterface returnEnumOut();

}

enum EnumOutInterface{
	PAGE1,
	PAGE2;
}
