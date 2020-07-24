package databasepac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;



public class DBLOAD 
{
	
	public static final String url="jdbc:mysql://localhost:3306/project";
	public static final String user="root";
	public static final String password="root";
	 Connection connection = DBLOAD.connect();
public static void main(String[] args) throws java.text.ParseException
{
	    DBLOAD db=new DBLOAD();
	    int x=0;
		List<pojo2> value = extractCSV("D:\\HRC\\workspace1\\Helloword\\src\\databasepac\\Data Uploading1.csv");
		for(pojo2 us:value)
		{
			x++;
			System.out.println(us.getAcct_doc_header_id());
			System.out.println(us.getCompany_id());
			System.out.println(us.getDocument_number());
			System.out.println(us.getDocument_number_norm());
			System.out.println(us.getBusiness_code());
			System.out.println(us.getInvoice_age());
			db.setAllUsers(us);
		}
		System.out.println("setallUser count-****"+x);
		/*Set u=dbac.getAllUsers();
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
		
	        }*/
	}
private static List<pojo2> extractCSV(String fileName) throws java.text.ParseException
{ 
		
		List<pojo2> values = new ArrayList<>(); 
		         File f=new File("D:\\HRC\\workspace1\\Helloword\\src\\Data Uploading.csv");  
		         try {
		         BufferedReader br = new BufferedReader(new FileReader(f));  
		         String line = "";  
		         int count=0;
		         StringTokenizer st = null;  
		         int lineNumber = 0;   
		         int tokenNumber = 0;  
		         while ((line = br.readLine()) != null) {
		        	 //System.out.println(line);
		             lineNumber++;
		             count=0;
		             String [] arr=line.split(",",-1);
					count++;
					if(!arr[0].equals("acct_doc_header_id"))
					{
							pojo2 values1 = datainpojo(arr);
							values.add(values1);	
					}
					//System.out.println(arr[45]+"*******");
					System.out.println("count is "+count);	
		          }
		         br.close();
		         }
		         catch(IOException i)
		         {
		        	 i.printStackTrace();
		         }
		         return values;
     }
	
private static pojo2 datainpojo(String[] sp) throws java.text.ParseException { 
	int acct_doc_header_id =Integer.parseInt(sp[0]);
	int company_id=Integer.parseInt(sp[1]);
	int document_number=Integer.parseInt(sp[2]);
	int	document_number_norm=Integer.parseInt(sp[3]);
	String	business_code=sp[4];
	String create_year=sp[5];
	int	document_line_number=0;
	if(!sp[6].isEmpty())
		document_line_number=Integer.parseInt(sp[6]);
	String	doctype=sp[7];
	int	customer_number=Integer.parseInt(sp[8]);
	int	customer_number_norm=Integer.parseInt(sp[9]);
	int	fk_customer_map_id=Integer.parseInt(sp[10]);
	String	customer_name=sp[11];
	String	division=sp[12];
	String	document_create_date=sp[13];
	Date document_create_date_norm = null;
	try {
		document_create_date_norm = Date.valueOf((sp[14]));
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	Date posting_date = null;
	try {
		if(!sp[15].isEmpty())
		posting_date = Date.valueOf(sp[15]);
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	Date posting_date_norm = null;
	try {
		if(!sp[16].isEmpty())
		posting_date_norm = Date.valueOf(sp[16]);
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	String posting_id=sp[17];
	Date due_date = null;
	try {
		if(!sp[18].isEmpty())
		due_date = Date.valueOf(sp[18]);
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	Date due_date_norm = null;
	try {
		if(!sp[19].isEmpty())
		due_date_norm = Date.valueOf(sp[19]);
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	Date order_date = null;
	try {
		if(!sp[20].isEmpty())
		order_date = Date.valueOf(sp[20]);
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	Date order_date_norm = null;
	try {
		if(!sp[21].isEmpty())
		order_date_norm = Date.valueOf(sp[21]);
	} catch (ParseException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	} 
	int invoice_id=Integer.parseInt(sp[22]);
	int invoice_id_norm=Integer.parseInt(sp[23]);
	Date baseline_create_date = null;
	try {
		if(!sp[24].isEmpty())
		baseline_create_date = Date.valueOf(sp[24]);
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Date invoice_date_norm = null;
	try {
		if(!sp[25].isEmpty())
		invoice_date_norm = Date.valueOf(sp[25]);
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	double total_open_amount=Double.parseDouble(sp[26]);
	double total_open_amount_norm=Double.parseDouble(sp[27]);
	int cust_payment_terms=Integer.parseInt(sp[28]);
	String business_area=sp[29];
	Date ship_date = null;
	try {
		if(!sp[30].isEmpty())
		{
		String time_sql=NewClass.convert(sp[30]);
		ship_date=Date.valueOf(time_sql);
		}
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	String ship_to=sp[31];
	Date clearing_date = null;
	try {
		if(!sp[32].isEmpty()) {System.out.println(sp[32]);
		clearing_date = Date.valueOf(sp[32]);}
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Date clearing_date_norm = null;
	try {
		if(!sp[33].isEmpty())
		clearing_date_norm = Date.valueOf(sp[33]);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String reason_code=sp[34];
	int isOpen=Integer.parseInt(sp[35]);
	Date discount_due_date_norm = null;
	try {
		if(!sp[36].isEmpty())
		discount_due_date_norm = Date.valueOf(sp[36]);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String debit_credit_indicator=sp[37];
	String payment_method=sp[38];
	Date document_creation_date = null;
	try {
		if(!sp[39].isEmpty())
		document_creation_date = Date.valueOf(sp[39]);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	double invoice_amount_doc_currency=Double.parseDouble(sp[40]);

	int document_id=Integer.parseInt(sp[41]);
	double actual_open_amount=Double.parseDouble(sp[42]);
	double paid_amount=Double.parseDouble(sp[43]);
	int dayspast_due=Integer.parseInt(sp[44]);
	int invoice_age=Integer.parseInt(sp[45]);
	double disputed_amount=0.0;
	if(!sp[46].isEmpty())
				disputed_amount=Double.parseDouble(sp[46]);
	
	return new pojo2(acct_doc_header_id,company_id,document_number,document_number_norm,business_code,create_year ,document_line_number,doctype,customer_number,customer_number_norm,
	fk_customer_map_id,
	customer_name,
	division,
	document_create_date,
	document_create_date_norm,
	posting_date,
	posting_date_norm,
	posting_id,
	due_date,
	due_date_norm,
	order_date,
	order_date_norm,
	invoice_id,
	invoice_id_norm,
	baseline_create_date, 
	invoice_date_norm,
	total_open_amount,
	total_open_amount_norm,
	cust_payment_terms,
	business_area,
	ship_date,
	ship_to,
	clearing_date,
	clearing_date_norm,
	reason_code,
	isOpen,
	discount_due_date_norm,
	debit_credit_indicator,
	payment_method,
	document_creation_date,
	 invoice_amount_doc_currency, document_id,
	actual_open_amount,
	paid_amount,
	dayspast_due,
	invoice_age,
	disputed_amount);
	
}
public static void Insert_Into_DB()
{
	
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
public  void setAllUsers(pojo2 singleuser) 
{
	    try {
	    	String sql = "INSERT INTO customer_invoice(acct_doc_header_id,company_id,doc_number,doc_number_norm,business_code,create_year,document_line_number,document_type,customer_number,customer_number_norm,fk_customer_map_id,customer_name,division,document_create_date,document_create_date_norm,posting_date,posting_date_norm,posting_id,due_date,due_date_norm,order_date,order_date_norm,invoice_id,invoice_id_norm,baseline_create_date,invoice_date_norm,total_open_amount,total_open_amount_norm,cust_payment_terms,business_area_,ship_date,ship_to,clearing_date,clearing_date_norm,reason_code,isOpen,discount_due_date_norm,debit_credit_indicator,payment_method,document_creation_date,invoice_amount_doc_currency,document_id,actual_open_amount,paid_amount,dayspast_due,invoice_age,disputed_amount) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    	PreparedStatement statement = connection.prepareStatement(sql);
	    	statement.setInt(1,singleuser.getAcct_doc_header_id());
	    	statement.setInt(2,singleuser.getCompany_id());
	    	statement.setInt(3,singleuser.getDocument_number());
	    	statement.setInt(4,singleuser.getDocument_number_norm());
	    	statement.setString(5,singleuser.getBusiness_code());
	    	statement.setString(6,singleuser.getCreate_year());
	    	statement.setInt(7,singleuser.getDocument_line_number());
	    	statement.setString(8,singleuser.getDoctype());
	    	statement.setInt(9,singleuser.getCustomer_number());
	    	statement.setInt(10,singleuser.getCustomer_number_norm());
	    	statement.setInt(11,singleuser.getFk_customer_map_id());
	    	statement.setString(12,singleuser.getCustomer_name());
	    	statement.setString(13,singleuser.getDivision());
	    	statement.setString(14,singleuser.getDocument_create_date());
	    	statement.setDate(15,singleuser.getDocument_create_date_norm());
	    	statement.setDate(16,singleuser.getPosting_date());
	    	statement.setDate(17,singleuser.getPosting_date_norm());
	    	statement.setString(18,singleuser.getPosting_id());
	    	statement.setDate(19,singleuser.getDue_date());
	    	statement.setDate(20,singleuser.getDue_date_norm());
	    	statement.setDate(21,singleuser.getOrder_date());
	    	statement.setDate(22,singleuser.getOrder_date_norm());
	    	statement.setInt(23,singleuser.getInvoice_id());
	    	statement.setInt(24,singleuser.getInvoice_id_norm());
	    	statement.setDate(25,singleuser.getBaseline_create_date());
	    	statement.setDate(26,singleuser.getInvoice_date_norm());
	    	statement.setDouble(27,singleuser.getTotal_open_amount());
	    	statement.setDouble(28,singleuser.getTotal_open_amount_norm());
	    	statement.setInt(29,singleuser.getCust_payment_terms());
	    	statement.setString(30,singleuser.getBusiness_area());
	    	statement.setDate(31,singleuser.getShip_date());
	    	statement.setString(32,singleuser.getShip_to());
	    	statement.setDate(33,singleuser.getClearing_date());
	    	statement.setDate(34,singleuser.getClearing_date_norm());
	    	statement.setString(35,singleuser.getReason_code());
	    	statement.setInt(36,singleuser.getIsOpen());
	    	statement.setDate(37,singleuser.getDiscount_due_date_norm());
	    	statement.setString(38,singleuser.getDebit_credit_indicator());
	    	statement.setString(39,singleuser.getPayment_method());
	    	statement.setDate(40,singleuser.getDocument_creation_date());
	    	statement.setDouble(41,singleuser.getInvoice_amount_doc_currency());
	    	statement.setInt(42,singleuser.getDocument_id());
            statement.setDouble(43,singleuser.getActual_open_amount());
	    	statement.setDouble(44,singleuser.getPaid_amount());
	    	statement.setInt(45,singleuser.getDayspast_due());
	    	statement.setInt(46,singleuser.getInvoice_age());
	    	statement.setDouble(47,singleuser.getDisputed_amount());
	    	int rows=statement.executeUpdate();
	    	if (rows > 0) {
	    	    System.out.println("A new user was inserted successfully!");
	    	}
	    	
	    }
	    catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	}
}

/*
 * private User extractUserFromResultSet(ResultSet rs) throws SQLException {
		User user = new User();
	    user.setFirst_Name( rs.getString("First_Name") );
	    user.setLast_Name( rs.getString("Last_Name") );
	    user.setSerial_number( rs.getInt("serial_number") );
	    user.setAlso_know_as( rs.getString("also_know_as") );
	    user.setMoto( rs.getString("moto") );
	    return user;
	}
 */