package com.highradius.example;
import java.io.*;
public class io_pr2 {
public static void main(String[] args)
{
	FileInputStream fin=null;
	BufferedInputStream bfin=null;
	try {
		fin=new FileInputStream("D:\\HRC\\workspace1\\Helloword\\src\\com\\highradius\\example\\test.txt");
		bfin=new BufferedInputStream(fin);
		int i;
		while((i=bfin.read())!=-1)
			System.out.println((char)i);
		}
	catch(Exception e)
	{   System.out.println("Could not read from file"+e);}
	finally {
		try
		{
			if(bfin!=null)
				bfin.close();
		}
		catch(Exception e)
		{
			System.out.println("could not close buffer");
		}
		try
		{
			if(fin!=null)
				fin.close();
		}
		catch(Exception e)
		{
			System.out.println("Could not close input stream"+e);
		}
	}
	
}
}
