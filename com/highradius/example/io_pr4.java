package com.highradius.example;
import java.io.*;

public class io_pr4 {
	public static void main(String[] args)
	{
		Reader rd=null;
		BufferedReader brd=null;
		try
		{
			rd=new FileReader("D:\\HRC\\workspace1\\Helloword\\src\\com\\highradius\\example\\test.txt");
			brd=new BufferedReader(rd);
			String a=null;
			while((a=brd.readLine())!=null)
				System.out.println(a);
			
		}
		catch(Exception e)
		{
			System.out.println("Could not write ");
		}
		finally {
			try
			{
				if(brd!=null)
					brd.close();
			}
			catch(Exception e)
			{
				System.out.println("could not close buffer");
			}
			try
			{
				if(rd!=null)
					rd.close();
			}
			catch(Exception e)
			{
				System.out.println("Could not close input stream"+e);
			}

	}

}
}
