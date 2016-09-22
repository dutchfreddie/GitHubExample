package jdbcexample.rowset;

import java.sql.SQLException;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Program {

	public static void main(String[] args) {
		
		jdbcRowSetSelectExample();	
		
	}
	
	static void jdbcRowSetSelectExample(){
		
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		String selectSql = "select * from eet_tb_persoon where voornaam = ?";
		
		try {
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			rowSet.setUrl(url+database);
			rowSet.setUsername(userName);
			rowSet.setPassword(password);
			rowSet.setCommand(selectSql);
			rowSet.setString(1, "Dick2");
			rowSet.execute();
			while(rowSet.next())
				System.out.println(rowSet.getObject(2));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void jdbcRowSetExample(){
		String url = "jdbc:mysql://localhost:3306/";
		String database = "eetmee";
		String userName = "root";
		String password = "bloempot";
		try {
			// first, create a factory object for rowset
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			
			// create a JDBC rowset from the factory
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			rowSet.setUrl(url);
			//rowSet.setDataSourceName(database);
			rowSet.setUsername(userName);
			rowSet.setPassword(password);
			rowSet.setCommand("SELECT * FROM eet_tb_persoon");
			System.out.println(rowSet.getDataSourceName());
			System.out.println(rowSet.getUrl());
			rowSet.addRowSetListener(new RowSetListener(){

				@Override
				public void cursorMoved(RowSetEvent arg0) {
					System.out.println("cursor moved");
					
					
				}

				@Override
				public void rowChanged(RowSetEvent arg0) {
					System.out.println("row changed");
					
					
				}

				@Override
				public void rowSetChanged(RowSetEvent arg0) {
					System.out.println("rowset changed");
					
					
				}
				
			});
			
			rowSet.execute();
			
			while (rowSet.next()){
				System.out.println(rowSet.getString("persoon_id") + "\t"
						+ rowSet.getString("voornaam") );
				if(rowSet.getString("voornaam").equals("Dick3"))
					rowSet.deleteRow();
			}
			rowSet.first();
			System.out.println();
			while (rowSet.next()){
				System.out.println(rowSet.getString("persoon_id") + "\t"
						+ rowSet.getString("voornaam") );
				
			}
			rowSet.first();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

}
