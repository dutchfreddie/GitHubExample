package jdbcexample.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;



public class Program {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		try (Connection con = DriverManager.getConnection
				(url + database, userName, password)){
			System.out.println("Database connection: Successful");
			printOut("catalog",con.getCatalog());
			printOut("schema",con.getSchema());
			DatabaseMetaData dmd = (DatabaseMetaData) con.getMetaData();
			
			printOut("Db_ma_v", "" + dmd.getDatabaseMajorVersion());
			printOut("Db_mi_v","" + dmd.getDatabaseMinorVersion());
			printOut("Db_productName",dmd.getDatabaseProductName());
			printOut("Db_productVersion",dmd.getDatabaseProductVersion());
			printOut("Driver_ma","" + dmd.getDriverMajorVersion());
			printOut("Driver_mi","" +dmd.getDriverMinorVersion());
			printOut("DriverName",dmd.getDriverName());
			printOut("DriverVersion",dmd.getDriverVersion());
			
			
			System.out.println("ClientInfo");
			Properties pr = con.getClientInfo();			
			for(Entry<Object, Object> entry:pr.entrySet()){
				printOut(entry.getKey().toString(),entry.getValue().toString());
			}
			
			printOut("transactionIsolation",""+con.getTransactionIsolation());
			Map<String,Class<?>> map = con.getTypeMap();
			for(Entry<String,Class<?>> entry:map.entrySet()){
				printOut(entry.getKey(),entry.getValue().getName());
			}
			
		} catch (Exception e) {
			System.out.println("Database connection: Failed");			
			e.printStackTrace();
		}		
	}
	
	static void printOut(String key,String value){
		System.out.println(key + "\t" + value);
	}
	
	public static void connectionDb(){
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection
					(url + database, userName, password);
			System.out.println("Database connection: Successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(connection!=null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
