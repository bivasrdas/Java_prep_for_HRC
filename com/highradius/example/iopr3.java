package com.highradius.example;
import java.io.*;

public class iopr3 {
	public static void main(String[] args)
	{
		Writer rdr=null;
		BufferedWriter brdr=null;
		try
		{
			rdr=new FileWriter("D:\\HRC\\workspace1\\Helloword\\src\\com\\highradius\\example\\test.txt");
			brdr=new BufferedWriter(rdr);
			String a="This is the new line";
			String b="This is another new line";
			brdr.write(a);
			brdr.newLine();
			brdr.write(b);	
		}
		catch(Exception e)
		{
			System.out.println("Could not write ");
		}
		finally
		{
			try 
			{
				if(brdr!=null)
					brdr.close();
			}
			catch(Exception e)
			{
				System.out.println("could not close buffer");
			}
			try
			{
				if(rdr!=null)
					rdr.close();
			}
			catch(Exception e)
			{
				System.out.println("Could not close input stream"+e);
			}

		}
	}

}
