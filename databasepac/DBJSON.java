package databasepac;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.json.*;;
public class DBJSON {
   public static ResultSet RetrieveData() throws Exception {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/sample_database";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
      System.out.println("Connection established......");
      //Creating the Statement
      Statement stmt = con.createStatement();
      //Retrieving the records
      ResultSet rs = stmt.executeQuery("Select * from MyPlayers");
      return rs;
   }
   public static void main(String args[]) throws Exception {
      //Creating a JSONObject object
      JSONObject jsonObject = new JSONObject();
      //Creating a json array
      JSONArray array = new JSONArray();
      ResultSet rs = RetrieveData();
      //Inserting ResutlSet data into the json object
      while(rs.next()) {
         JSONObject record = new JSONObject();
         //Inserting key-value pairs into the json object
         record.put("ID", rs.getInt("ID"));
         record.put("First_Name", rs.getString("First_Name"));
         record.put("Last_Name", rs.getString("Last_Name"));
         record.put("Date_Of_Birth", rs.getDate("Date_Of_Birth"));
         record.put("Place_Of_Birth", rs.getString("Place_Of_Birth"));
         record.put("Country", rs.getString("Country"));
         array.add(record);
      }
      jsonObject.put("Players_data", array);
      try {
         FileWriter file = new FileWriter("E:/output.json");
         file.write(jsonObject.toJSONString());
         file.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      System.out.println("JSON file created......");
   }
}