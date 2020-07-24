package databasepac;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.io.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;

public class DBtoJSON {
   public static ResultSet RetrieveData() throws Exception {
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      String mysqlUrl = "jdbc:mysql://localhost:3306/project";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
      System.out.println("Connection established......");
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("Select * from customer_invoice");
      return rs;
   }
   public static void main(String[] args) throws Exception  {
	   GsonBuilder builder = new GsonBuilder();
	   Gson gson = builder.setPrettyPrinting().create();
	   JsonElement element = gson.toJsonTree(dbList, new TypeToken<List<pojo2>>() {}.getType());
		JsonArray jsonArray = element.getAsJsonArray();

	  
	      builder.serializeNulls();
	      int i=1;
	      
	   //Gson gson =new Gson();
	   pojo2 singleuser=new pojo2();
	   FileWriter file=new FileWriter("D:\\HRC\\Reactjs\\Summer_Internship_UI\\src\\redux\\readjson\\output.json",true);
       ResultSet rs = RetrieveData();
       while(rs.next()&& i<10) {
    	  singleuser.setAcct_doc_header_id(rs.getInt("acct_doc_header_id"));
    	  //singleuser.setCompany_id(rs.getInt("company_id"));
    	  //singleuser.setDocument_number(rs.getInt("doc_number"));
    	  //singleuser.setDocument_number_norm(rs.getInt("doc_number_norm"));
    	  //singleuser.setBusiness_code(rs.getString("business_code"));
    	  //singleuser.setCreate_year(rs.getString("create_year"));
    	  //singleuser.setDocument_line_number(rs.getInt("document_line_number"));
    	  //singleuser.setDoctype(rs.getString("document_type"));
    	  //singleuser.setCustomer_number(rs.getInt("customer_number"));
    	  //singleuser.setCustomer_number_norm(rs.getInt("customer_number_norm"));
    	  //singleuser.setFk_customer_map_id(rs.getInt("fk_customer_map_id"));
    	  //singleuser.setCustomer_name(rs.getString("customer_name"));
    	  //singleuser.setDivision(rs.getString("division"));
    	  //singleuser.setDocument_create_date(rs.getString("document_create_date"));
    	  //singleuser.setDocument_create_date_norm(rs.getDate("document_create_date_norm"));
    	  //singleuser.setPosting_date(rs.getDate("posting_date"));
    	  //singleuser.setPosting_date_norm(rs.getDate("posting_date_norm"));
    	  //singleuser.setPosting_id(rs.getString("posting_id"));
    	  //singleuser.setDue_date(rs.getDate("due_date"));
    	  //singleuser.setDue_date_norm(rs.getDate("due_date_norm"));
    	  //singleuser.setOrder_date(rs.getDate("order_date"));
    	  //singleuser.setOrder_date_norm(rs.getDate("order_date_norm"));
    	  //singleuser.setInvoice_id(rs.getInt("invoice_id"));
    	  //singleuser.setInvoice_id_norm(rs.getInt("invoice_id_norm"));
    	  //singleuser.setBaseline_create_date(rs.getDate("baseline_create_date"));
    	  //singleuser.setInvoice_date_norm(rs.getDate("invoice_date_norm"));
    	  //singleuser.setTotal_open_amount(rs.getDouble("total_open_amount"));
    	  //singleuser.setTotal_open_amount_norm(rs.getDouble("total_open_amount_norm"));
    	  //singleuser.setCust_payment_terms(rs.getInt("cust_payment_terms"));
    	  //singleuser.setBusiness_area(rs.getString("business_area_"));
    	  //singleuser.setShip_date(rs.getDate("ship_date"));
    	  //singleuser.setShip_to(rs.getString("ship_to"));
    	  //singleuser.setClearing_date(rs.getDate("clearing_date"));
    	  //singleuser.setClearing_date_norm(rs.getDate("clearing_date_norm"));
    	  //singleuser.setReason_code(rs.getString("reason_code"));
    	  //singleuser.setIsOpen(rs.getInt("isOpen"));
    	  //singleuser.setDiscount_due_date_norm(rs.getDate("discount_due_date_norm"));
    	  //singleuser.setDebit_credit_indicator(rs.getString("debit_credit_indicator"));
    	  //singleuser.setPayment_method(rs.getString("payment_method"));
    	  //singleuser.setDocument_creation_date(rs.getDate("document_creation_date"));
    	  //singleuser.setInvoice_amount_doc_currency(rs.getDouble("invoice_amount_doc_currency"));
    	  //singleuser.setDocument_id(rs.getInt("document_id"));
    	  //singleuser.setActual_open_amount(rs.getDouble("actual_open_amount"));
    	  //singleuser.setPaid_amount(rs.getDouble("paid_amount"));
    	  //singleuser.setDayspast_due(rs.getInt("dayspast_due"));
    	  //singleuser.setInvoice_age(rs.getInt("invoice_age"));
    	  //singleuser.setDisputed_amount(rs.getDouble("disputed_amount"));
    	  String record=gson.toJson(singleuser);//, new FileWriter("E:/output.json")
    	  //gson.toJson(//singleuser, new FileWriter("E:/output.json"));
    	  file.write(record);
    	  System.out.println(record);
    	  i++;
    	  
      }
       System.out.println("done");
   }
   
}