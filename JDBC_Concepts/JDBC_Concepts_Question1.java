package JDBC_Concepts;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
public class JDBC_Concepts_Question1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter serach key");
		String search=sc.nextLine();
		Connection conn=null;
		try {
			String url="jdbc:mysql://localhost:3306/sampledb";
			String user="root";
			String password="root";
			conn=DriverManager.getConnection(url,user,password);
			String sql = "SELECT * FROM userdetails";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int check=0;
			while (result.next()){
			    
				String name = result.getString("First_name");
			    String pass = result.getString("Last_name");
			    String fullname = result.getString("serial_number");
			    String email = result.getString("also_know_as");
			    String moto = result.getString("moto");
			    String output = " First Name: %s , Last Name : %s , Serial : %s , Alias : %s , Quote : %s";
			    if(search.equals(name) || search.equals(pass) ||search.equals(fullname) ||search.equals(email))
			    {
			    	check=1;
			    	System.out.println(String.format(output, name, pass, fullname, email,moto));
			    }
			  
			}
			if(check!=1)
		    	System.out.println("element not present");
		   
			
		}
		catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			  ex.printStackTrace();
			}
		finally{
	        if (conn != null) {
	            try {
	                conn.close();
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	}
	}
		
		

}
