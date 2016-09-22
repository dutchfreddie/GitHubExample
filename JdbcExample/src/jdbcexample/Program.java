package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;

public class Program {

	public static void main(String[] args) {
		DBConnection db = new DBConnection();
		db.returnStatement();
	}
	
	
}
