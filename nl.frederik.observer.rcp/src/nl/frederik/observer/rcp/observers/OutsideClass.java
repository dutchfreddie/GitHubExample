package nl.frederik.observer.rcp.observers;

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

public class OutsideClass implements IOutsideClass{
	
	public String executeDb(){
		String sql = "SELECT * FROM eet_tb_persoon ORDER BY persoon_id ASC";
		List<String> listType = getListTypes(sql);
		return selectStatement(sql, listType);
	}
	
	private  Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		Connection con = DriverManager.getConnection
				(url + database, userName, password);
		
		return con;
	}
	
	private List<String> getListTypes(String sql){
		
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
	
	private  String selectStatement(String sql,List<String> listType){
		
		String output = "No Output";
		try(Connection con = getConnection()){
			Statement st = con.createStatement();
			st.execute(sql);
			ResultSet resultSet = st.getResultSet();			
			output= printOutResultSet(resultSet, listType);		
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return output;
	}
	
	private String printOutResultSet(ResultSet resultSet,List<String> listType) throws SQLException{
		String total = "";
		while(resultSet.next()){
			
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
						total +="nothing\t";
				}
			}
			
		}
		return total;
	}

}
