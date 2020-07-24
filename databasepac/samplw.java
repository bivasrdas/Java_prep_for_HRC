package databasepac;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class samplw {
public static void main(String[] args) 
{
	samplw s=new samplw();
	s.data();
}
public void data()
{
	File f=new File("C:\\Users\\BIVAS\\Desktop\\temp.csv");
	try
	{
		Scanner sc=new Scanner(f);
		int i=0;
		while(sc.hasNext() && i<5)
		{
			String data=sc.next();
			String [] ar=data.split(",");
			
		}
		sc.close();
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	}
public void dbconn()
{
	Connection conn1=null; 
	try {
	  
	  String url1 = "jdbc:mysql://localhost:3306/sampledb";
	  String user = "root";
	  String password = "root";
	  conn1 = DriverManager.getConnection(url1, user, password);
	  if (conn1 != null) 
	  {
	   System.out.println("Connected to the database test1");
	  }
	  String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
		PreparedStatement statement = conn1.prepareStatement(sql);
		statement.setString(1, "bill");
		statement.setString(2, "secretpass");
		statement.setString(3, "Bill Gates");
		statement.setString(4, "bill.gates@microsoft.com");
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		   System.out.println("A new user was inserted successfully!");
		}
		String sql1 = "SELECT * FROM Users";
		Statement statement1 = conn1.createStatement();
		ResultSet result = statement1.executeQuery(sql1);
		int count = 0;
		while (result.next()){
		String name = result.getString(2);
		String pass = result.getString(3);
		String fullname = result.getString("fullname");
		String email = result.getString("email");
		String output = "User #%d: %s - %s - %s - %s";
		System.out.println(String.format(output, ++count, name, pass, fullname, email));
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

