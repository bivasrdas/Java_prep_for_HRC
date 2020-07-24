package com.highradius.Java_File_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JAVA_FILE_IO_Question2 
{
	public static void main(String[] args) {
		FileOutputStream fout=null;
		BufferedOutputStream bfout=null;
		FileInputStream fin=null;
		BufferedInputStream bfin=null;
		try
		{
			int i;
			fin=new FileInputStream("D:\\HRC\\workspace1\\Helloword\\src\\com\\highradius\\Java_File_IO\\Test_In.txt");
			bfin=new BufferedInputStream(fin);
			fout=new FileOutputStream("D:\\HRC\\workspace1\\Helloword\\src\\com\\highradius\\Java_File_IO\\Test_Out.txt");
			bfout=new BufferedOutputStream(fout);
			while((i=bfin.read())!=-1)
			{
				char x=(char)i;
				if(x==' ' || x=='\t' || x=='\r' || x=='\n' )
				{
					
				    System.out.println(x);
				}
				else
					bfout.write(i);
		    
		}
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
		
