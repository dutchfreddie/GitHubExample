package daodpexample;

public interface IShapeDao {

	public void insertShape(IShapeTransfer circle);
	public IShapeTransfer findShape(int id);
	public void deleteShape(int id);
	
	
}
