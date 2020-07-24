package databasepac;
import java.util.*;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.sql.*;

	public class NewClass {

	    
	    public static void main(String[] args) throws ParseException {
	    	NewClass a=new NewClass();
	    	Scanner sc=new Scanner (System.in);
	    	String t=sc.nextLine();
	    	a.convert(t);
	    }
	       
	       public static String convert(String t) throws ParseException
	       {
	    	   Scanner sc=new Scanner(System.in);
	    	   SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
		       SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		       try
		        {
		    	   System.out.println(t);
		        Date date = format1.parse(t);
		        String st=format2.format(date);
		        System.out.println(st);
		        return st;
		    	}
		        
		    	catch(Exception e)
		    	{
		    	Date date1 =format2.parse(t);
		    	String date2=format2.format(date1);
		    	System.out.println(date2);
		    	 return date2;
		    	}
	       }

	    
	}


