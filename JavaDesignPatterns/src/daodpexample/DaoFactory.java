package daodpexample;

public class DaoFactory {

	public static IShapeDao getShapeDAO(String sourceType) {
		// This is a simple example, so we have listed only "RDBMS" as the only source type
		// In a real-world application, you can provide more source types
		switch(sourceType){
			case "File":
				return new FileDAO();
		}
		
		return null;
	}
}
