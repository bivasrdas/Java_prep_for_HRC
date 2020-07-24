package com.highradius.example;
import java.io.*;

public class inputoutput_pr {
	public static void main(String[] args)
	{
		FileOutputStream fout=null;
		BufferedOutputStream bfout=null;
		try
		{
			fout=new FileOutputStream("D:\\HRC\\workspace1\\Helloword\\src\\com\\highradius\\example\\test.txt");
			bfout=new BufferedOutputStream(fout);
		    String a="My name is alpha how about it";
		    byte[] b=a.getBytes();
		    bfout.write(b);
		}
		catch(Exception e) {
		    System.out.println("Could not write on file"+e);
		}
		finally
		{
			try
			{
				if(bfout!=null)
				  bfout.close();
			}
			catch(Exception e) {
			 System.out.println("Could not close Buffered output stream"+ e);
		    }
			try {
				if(fout!=null)
					fout.close();
			   }
			catch(Exception e)
			{
				System.out.println("Could not close File output stream"+e);
			
			}
		}
	}

}
