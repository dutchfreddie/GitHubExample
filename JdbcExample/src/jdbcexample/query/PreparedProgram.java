package jdbcexample.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PreparedProgram {

	public static void main(String[] args) {
		
		String sqlSelect = "select * from eet_tb_persoon";
		List<String>  listType = getListTypes(sqlSelect);
		selectStatement(sqlSelect, listType);
		updatePrepared();
		selectStatement(sqlSelect, listType);
		
	}
	
	static void selectPrepared(List<String> listType){
		 String sql = "select * from eet_tb_persoon where voornaam = ?"; 
		 try(Connection con = getConnection()){
				PreparedStatement st = con.prepareStatement(sql);	
				st.setString(1, "Dutch2");
				ResultSet resultSet = st.executeQuery();		
				printOutResultSet(resultSet, listType);						
			}
			catch(SQLException e){
				e.printStackTrace();
			}
	}
	
	static void updatePrepared(){
		
		String sql = "update eet_tb_persoon set achternaam = ? where voornaam = ?"; 
		 try(Connection con = getConnection()){
				PreparedStatement st = con.prepareStatement(sql);	
				st.setString(1, "Rotsaert666");
				st.setString(2, "Dutch2");
				int changed = st.executeUpdate();
				System.out.println("nr changed: " + changed);
			}
			catch(SQLException e){
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
