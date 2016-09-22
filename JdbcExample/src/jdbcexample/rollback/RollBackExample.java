package jdbcexample.rollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RollBackExample {

	private static Connection connection;

	public static void main(String...strings){
		String sql = "SELECT * FROM eet_tb_persoon ORDER BY persoon_id ASC";
		List<String> listType = getListTypes(sql);
		selectStatement(sql, listType);
		//insertRollback(sql);
		//selectStatement(sql, listType);
		
	}
	
	static void insertRollback(String sql){
		try(Connection connection = getConnection()) {		
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = statement.executeQuery(sql);
			
				
			resultSet.moveToInsertRow();
			resultSet.updateString("voornaam", "Tommie");
			resultSet.insertRow();			
			Savepoint firstSavepoint = connection.setSavepoint("first");
			
			resultSet.moveToInsertRow();
			resultSet.updateString("voornaam2", "Dickie");
			resultSet.insertRow();			
			Savepoint secondSavepoint = connection.setSavepoint("Second");
			
			resultSet.moveToInsertRow();
			resultSet.updateString("voornaam", "Harrie");
			resultSet.insertRow();
			
			Savepoint thirdSavepoint = connection.setSavepoint("Third");
			System.out.println("Rolling back to the state where Tom and Dick were inserted");
			
			connection.rollback();
			
			//connection.commit();
			
		} catch (SQLException e) {
				System.out.println("Something gone wrong, couldn't add a contact in family group");
				try {
					if(connection!=null)
						connection.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
		}	
	}
	
	
	static Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		Connection con = DriverManager.getConnection
				(url + database, userName, password);
		
		return con;
	}
	
	static List<String> getListTypes(String sql){
		
		List<String> listType = new ArrayList<>();
		
		try(Connection con = getConnection()){
			Statement st = con.createStatement();
			
			ResultSet resultSet = st.executeQuery(sql);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numOfColumns = rsmd.getColumnCount();
			
			for(int i=1;i<=numOfColumns;i++){					
				String[] split = rsmd.getColumnClassName(i).split("\\.");
				String className = split[split.length-1];
				listType.add(className);										
			}			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return listType;
	}
	
	static void selectStatement(String sql,List<String> listType){
		try(Connection con = getConnection()){
			Statement st = con.createStatement();
			
			System.out.println(st.execute(sql));
			ResultSet resultSet = st.getResultSet();			
			printOutResultSet(resultSet, listType);		
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	static void printOutResultSet(ResultSet resultSet,List<String> listType) throws SQLException{
		while(resultSet.next()){
			String total = "";
			for(int i=0;i<listType.size();i++){
				String type = listType.get(i);
				switch(type){
				case "String":
					total += resultSet.getString(i+1) + "\t";
					break;
				case "Long":
					total += resultSet.getLong(i+1) + "\t";
					break;
				case "Timestamp":
					Date date = resultSet.getDate(i+1);
					if(date!=null){
						DateFormat df = new SimpleDateFormat("dd-MM-yyyy");							
						String dateS = df.format(date);
						total += dateS + "\t";
						break;
					}						
				case "Boolean":
					total += resultSet.getBoolean(i+1) + "\t";
					break;
				case "Integer":
					total += resultSet.getInt(i+1);
					break;
				default:
						System.out.println(resultSet.getObject(i+1));
				}
			}
			System.out.println(total);
			System.out.println("****");
			
		}
	}
	
}
