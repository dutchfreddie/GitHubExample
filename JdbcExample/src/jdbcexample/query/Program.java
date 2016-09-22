package jdbcexample.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.RowSet;

import java.util.Map.Entry;




public class Program {

	public static void main(String[] args) {
		
		getResultSetMetaData();
		//updateStatement();
		//insertStatement();
		//deleteStatement();
		//selectStatement();
		//updateStatement2();

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
	
	static void deleteStatement(){
		
		try(Connection con = getConnection()){
			
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			
			String sql = "select * from eet_tb_persoon";
			ResultSet resultSet = st.executeQuery(sql);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numOfColumns = rsmd.getColumnCount();
			
			
			List<String> listType = new ArrayList<>();
			List<String> listColulmnName = new ArrayList<>();
			
			for(int i=1;i<=numOfColumns;i++){					
				String[] split = rsmd.getColumnClassName(i).split("\\.");
				String className = split[split.length-1];
				listType.add(className);
				listColulmnName.add(rsmd.getColumnName(i));							
			}	
			
			printOutResultSet(resultSet, listType);				
			
			
			resultSet = st.executeQuery("SELECT * FROM eet_tb_persoon WHERE voornaam=\"Frederik\"");
			if(resultSet.next()){
				printOutResultSet(resultSet, listType);
			}
			
			sql = "delete from eet_tb_persoon where voornaam = \"Frederik\"";
			int updateI = st.executeUpdate(sql);
			System.out.println(updateI);
			sql = "select * from eet_tb_persoon";
			resultSet = st.executeQuery(sql);
			printOutResultSet(resultSet, listType);		
		}
		catch(SQLException e){
			e.printStackTrace();
		}		
	}
	
	static void insertStatement(){
		
		try(Connection con = getConnection()){
			
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			String sql = "select * from eet_tb_persoon";
			ResultSet resultSet = st.executeQuery(sql);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numOfColumns = rsmd.getColumnCount();
			
			
			List<String> listType = new ArrayList<>();
			List<String> listColulmnName = new ArrayList<>();
			
			for(int i=1;i<=numOfColumns;i++){					
				String[] split = rsmd.getColumnClassName(i).split("\\.");
				String className = split[split.length-1];
				listType.add(className);
				listColulmnName.add(rsmd.getColumnName(i));							
			}	
			
			printOutResultSet(resultSet, listType);			
			
			resultSet.moveToInsertRow();
			resultSet.updateString("voornaam", "Frederik");
			resultSet.updateString("achternaam", "Rotsaert");
			resultSet.insertRow();
			
			sql = "select * from eet_tb_persoon";
			resultSet = st.executeQuery(sql);
			printOutResultSet(resultSet, listType);
			
			resultSet = st.executeQuery("SELECT * FROM eet_tb_persoon WHERE voornaam=\"Frederik\"");
			if(resultSet.next()){
				// delete the first row
					printOutResultSet(resultSet, listType);
			}
			
			sql = "select * from eet_tb_persoon";
			resultSet = st.executeQuery(sql);
			printOutResultSet(resultSet, listType);
			
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		
	}
	
	
	
	static void updateStatement2(){
		
		try(Connection con = getConnection()){
			
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			String sql = "select * from eet_tb_persoon where voornaam=\"Corina\"";
			ResultSet resultSet = st.executeQuery(sql);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numOfColumns = rsmd.getColumnCount();
			
			
			List<String> listType = new ArrayList<>();
			List<String> listColulmnName = new ArrayList<>();
			
			for(int i=1;i<=numOfColumns;i++){					
				String[] split = rsmd.getColumnClassName(i).split("\\.");
				String className = split[split.length-1];
				listType.add(className);
				listColulmnName.add(rsmd.getColumnName(i));							
			}	
			
			printOutResultSet(resultSet, listType);
			
			resultSet.first();
			resultSet.updateString("voornaam","frederik");
			resultSet.updateRow();		
			
			System.out.println("\n\nAfter the update");
			
			sql = "select * from eet_tb_persoon";
			resultSet = st.executeQuery(sql);
			printOutResultSet(resultSet, listType);
			
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	static void updateStatement(){
		try(Connection con = getConnection()){
			
			//Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				//	ResultSet.CONCUR_UPDATABLE);
			Statement st = con.createStatement();
			String sql = "select * from eet_tb_persoon";
			ResultSet resultSet = st.executeQuery(sql);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numOfColumns = rsmd.getColumnCount();
			
			
			List<String> listType = new ArrayList<>();
			List<String> listColulmnName = new ArrayList<>();
			
			for(int i=1;i<=numOfColumns;i++){					
				String[] split = rsmd.getColumnClassName(i).split("\\.");
				String className = split[split.length-1];
				listType.add(className);
				listColulmnName.add(rsmd.getColumnName(i));							
			}	
			
			printOutResultSet(resultSet, listType);	
			
			//resultSet.absolute(1);
			//resultSet.updateString("voornaam","frederik");
			// reflect those changes back to the database by calling updateRow() method
			//resultSet.updateRow();
			
			//sql = "update eet_tb_persoon set voornaam=\"DutchFreddie3\" where voornaam = \"DutchFreddie\"";
			//int iUpdate = st.executeUpdate(sql);
			//System.out.println(iUpdate);
			//System.out.println("\n\nAfter the update");
			
			resultSet.absolute(10);
			//sql = "select * from eet_tb_persoon";
			//resultSet = st.executeQuery(sql);
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
	
	static void selectStatement(){
		try(Connection con = getConnection()){
			Statement st = con.createStatement();
			
			String sql = "select * from eet_tb_persoon";
			ResultSet resultSet = st.executeQuery(sql);
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numOfColumns = rsmd.getColumnCount();
			
			
			List<String> listType = new ArrayList<>();
			List<String> listColulmnName = new ArrayList<>();
			
			for(int i=1;i<=numOfColumns;i++){					
				String[] split = rsmd.getColumnClassName(i).split("\\.");
				String className = split[split.length-1];
				listType.add(className);
				listColulmnName.add(rsmd.getColumnName(i));							
			}	
			
			printOutResultSet(resultSet, listType);
			
			boolean b = st.execute(sql);
			ResultSet rs2 = st.getResultSet();
			
			printOutResultSet(rs2, listType);
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	static void getResultSetMetaData2(){
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		try (Connection con = DriverManager.getConnection
				(url + database, userName, password)){
			Statement st = con.createStatement();
			String sql = "select * from eet_tb_persoon";
			ResultSet resultSet = st.executeQuery(sql);
			int nrRows = resultSet.getRow();
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numOfColumns = rsmd.getColumnCount();
			
			System.out.println(rsmd.getTableName(1));
			
			for(int i=1;i<=numOfColumns;i++){
				String out = rsmd.getColumnName(i) + "\t" +
						rsmd.getColumnType(i)  + "\t" +
						rsmd.getColumnClassName(i); 
						
				System.out.println(out);				
			}			
			
			System.out.println();
		} catch (Exception e) {
			System.out.println("Database connection: Failed");			
			e.printStackTrace();
		}	
	}
	static void getResultSetMetaData(){
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		try (Connection con = DriverManager.getConnection
				(url + database, userName, password)){
			Statement st = con.createStatement();
			String sql = "select * from eet_tb_persoon";
			ResultSet resultSet = st.executeQuery(sql);
			int nrRows = resultSet.getRow();
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int numOfColumns = rsmd.getColumnCount();
			
			for(int i=1;i<=numOfColumns;i++){
				System.out.print(rsmd.getColumnName(i)+ "\t");
			}
			System.out.println();
			List<String> listType = new ArrayList<>();
			
			for(int i=1;i<=numOfColumns;i++){
				String out = rsmd.getTableName(i) + "\t"
						+ rsmd.getColumnName(i) + "\t" +
						rsmd.getColumnType(i)  + "\t" +
						rsmd.getColumnClassName(i) + "\t" +
						rsmd.getColumnLabel(i);
				
				String[] split = rsmd.getColumnClassName(i).split("\\.");
				String className = split[split.length-1];
						
				System.out.println(out);				
			}			
			
			System.out.println();
			/*
			while (resultSet.next()) {
				// remember that the column index starts from 1 not 0
				for(int i = 1; i <= numOfColumns; i++) {
				// since we do not know the data type of the column, we use getObject()
				System.out.print(resultSet.getObject(i) + "\t");
				}
				System.out.println("");
			}
			*/
			
		} catch (Exception e) {
			System.out.println("Database connection: Failed");			
			e.printStackTrace();
		}	
	}

}
