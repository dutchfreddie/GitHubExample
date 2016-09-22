package jdbcexample.transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Program {

	public static void main(String[] args)  {
		//insertStatement();
		insertWithRollback();
	}
	
	static void insertWithRollback(){
		
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		Connection connection =null;
		ResultSet resultSet = null;
		// we're using explicit finally blocks
		// instead of try-with-resources statement in this code
		try {
			// for commit/rollback we first need to set auto-commit to false
			
			connection = DriverManager.getConnection
					(url + database, userName, password);
			connection.setAutoCommit(true);
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery("SELECT * FROM eet_tb_persoon");
			System.out.println("Printing the contents of the table before inserting");
			while(resultSet.next()) {
				System.out.println(resultSet.getString("persoon_id") + " "
			+ resultSet.getString("voornaam"));
				}
			System.out.println("Starting to insert rows");
			// first insert
			resultSet.moveToInsertRow();
			resultSet.updateString("voornaam", "Tom3");
			resultSet.insertRow();
			System.out.println("Inserted row for Tom");
			
			// our first savepoint is here. . .
			Savepoint firstSavepoint = connection.setSavepoint("first");
			
			// second insert
			resultSet.moveToInsertRow();
			resultSet.updateString("voornaam", "Dick3");
			resultSet.insertRow();
			System.out.println("Inserted row for Dick");
			
			// our second savepoint is here. . . after we inserted Dick
			// we can give a string name for savepoint
			Savepoint secondSavepoint = connection.setSavepoint("Second");
			// third insert
			resultSet.moveToInsertRow();
			resultSet.updateString("voornaam", "Harry3");
			resultSet.insertRow();
			System.out.println("Inserted row for Harry");
			
			// our thrid savepoint is here. . . for "Harry"
			Savepoint thirdSavepoint = connection.setSavepoint("Third");
			System.out.println("Table updation complete. . .");
			// rollback to the state when Dick was inserted;
			// so the insert for Harry will be lost
			System.out.println("Rolling back to the state where Tom and Dick were inserted");
			connection.rollback(firstSavepoint);
			
			// commit the changes now and see what happens to the contents of the table
			connection.commit();
			System.out.println("Printing the contents of the table after commit");
			resultSet = statement.executeQuery("SELECT * FROM eet_tb_persoon");
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("persoon_id") + " "
			+ resultSet.getString("voornaam"));
				}
			} catch (SQLException e) {
				System.out.println("Something gone wrong, couldn't add a contact in family group");
				// roll back all the changes in the transaction since something has gone wrong
				try {
					connection.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		finally {
			if(connection != null)
				try {
					connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
			if(resultSet != null)
				try {
					resultSet.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
			}
		
	}
	
	static void insertStatement(){
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		Connection connection =null;
		ResultSet resultSet1 = null, resultSet2 = null;
		// we're using explicit finally blocks
		// instead of try-with-resources statement in this code
		try {
			connection = DriverManager.getConnection
					(url + database, userName, password);
			// for commit/rollback we first need to set auto-commit to false
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement
					(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			resultSet1 = statement.executeQuery("SELECT * FROM eet_tb_persoon");
			resultSet1.moveToInsertRow();
			resultSet1.updateString("voornaam", "Freddie58");
			// updating here. . . but this change will be lost if a rollback happens
			resultSet1.insertRow();
			System.out.println("First table updated. . .");
			resultSet2 = statement.executeQuery("SELECT * FROM eet_tb_persoon");
			resultSet2.moveToInsertRow();
			resultSet2.updateString("voornaam12", "Michiel5");
			resultSet2.insertRow();
			resultSet2.moveToInsertRow();
			resultSet2.updateString("voornaam",	"Isabelle5");
			// updating here. . . but this change will be lost of a rollback happens
			resultSet2.insertRow();
			System.out.println("Both tables updated, committing now.");
			// we're committing the changes for both the tables only now
			connection.commit();
		} catch (SQLException e) {
			System.out.println(
					"Something gone wrong, couldn't add a contact in family group");
			// roll back all the changes in the transaction since something has gone wrong
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(resultSet1 != null)
				try {
					resultSet1.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(resultSet2 != null)
				try {
					resultSet2.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
