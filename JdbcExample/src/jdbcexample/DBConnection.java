package jdbcexample;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class DBConnection {

	public void returnStatement(){
		Connection connection = connecting();
		Statement statement;
		try {
			//statement = connection.createStatement();
			//statement.
		
			
			//ResultSet resultSet = statement.executeQuery("update eet_tb_persoon set beroep = 'niks' where persoon_id='98' ");
			PreparedStatement ps = connection.prepareStatement("update eet_tb_persoon set beroep = 'niks' where persoon_id='98' ");
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			try {
				if(connection!=null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}
	private Connection connecting(){
		// url points to jdbc protocol : mysql subprotocol; localhost is the address
				// of the server where we installed our DBMS (i.e. on local machine) and
				// 3306 is the port on which we need to contact our DBMS
				String url = "jdbc:mysql://localhost:3306/";
				// we are connecting to the addressBook database we created earlier
				String database = "eetmee";
				// we login as "root" user with password "mysql123"
				String userName = "root";
				String password = "bloempot";
				Connection connection = null;
				try {
					connection = DriverManager.getConnection(url + database, userName, password);
					System.out.println("Database connection: Successful");
					DatabaseMetaData dmd = connection.getMetaData();
					ResultSet rs = dmd.getColumns(null, null, "eet_tb_persoon", null);
					while(rs.next()){
						System.out.println(rs.getString("COLUMN_NAMe"));
						System.out.println(rs.getString("TYPE_NAME"));
					}
				} catch (Exception e) {
					System.out.println("Database connection: Failed");
					e.printStackTrace();
				}
								
				return connection;
	}
}
