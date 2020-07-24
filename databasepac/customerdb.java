package databasepac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class customerdb {
	public static void main(String[] args) {
		Connection conn1 = null;
		try {
		  
		  String url1 = "jdbc:mysql://localhost:3306/project";
		  String user = "root";
		  String password = "root";
		  conn1 = DriverManager.getConnection(url1, user, password);
		  if (conn1 != null) 
		  {
		   System.out.println("Connected to the database project'");
		  }
		}

		  catch (SQLException ex) {
				System.out.println("An error occurred. Maybe user/password is invalid");
				  ex.printStackTrace();
				}
				
				finally{
			        if (conn1 != null) {
			            try {
			                conn1.close();
			            } catch (SQLException ex) {
			                ex.printStackTrace();
			            }
			        }
				}
	}
}
			 
