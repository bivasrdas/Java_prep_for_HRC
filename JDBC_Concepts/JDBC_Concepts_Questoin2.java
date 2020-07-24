package JDBC_Concepts;
import java.sql.*;
import java.util.*;
public class JDBC_Concepts_Questoin2 {
	public static final String url="jdbc:mysql://localhost:3306/sampledb";
	public static final String user="root";
	public static final String password="root";
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter search key");
		String a=sc.nextLine();
		JDBC_Concepts_Questoin2 dbac=new JDBC_Concepts_Questoin2();
		Set u=dbac.getAllUsers();
		System.out.println(u);
		for(Object db:u)
		{
			String fn=((User)db).getFirst_Name();
			String ln=((User)db).getLast_Name();
			int sr=((User)db).getSerial_number();
			String sr1=String.valueOf(sr);
			String also=((User)db).getAlso_know_as();
			String moto=((User)db).getMoto();
			if(a.equals(fn)|| a.equals(ln)|| a.equals(also) || a.equals(sr1))
           {
			 System.out.println("First Name-"+fn+"\nLast Name-"+ln+" \nSerial Numner-"+sr1+" \nAlso Known As-"+also+" \nMoto-"+moto);
			 
           }
		
	        }
	}
	public static Connection connect()
	{
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url,user,password);
		}
		catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			  ex.printStackTrace();
			}
		return conn;
		
	}
	private User extractUserFromResultSet(ResultSet rs) throws SQLException {
		User user = new User();
	    user.setFirst_Name( rs.getString("First_Name") );
	    user.setLast_Name( rs.getString("Last_Name") );
	    user.setSerial_number( rs.getInt("serial_number") );
	    user.setAlso_know_as( rs.getString("also_know_as") );
	    user.setMoto( rs.getString("moto") );
	    return user;
	}
	public Set getAllUsers() {
	    Connection connection = JDBC_Concepts_Questoin2.connect();
	    try {
	        Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM userdetails");
	        Set users = new HashSet();
	        while(rs.next())
	        {
	            User user = extractUserFromResultSet(rs);
	            users.add(user);
	        }
	        return users;
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    return null;
	}
	}



	