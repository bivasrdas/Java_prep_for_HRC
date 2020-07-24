package databasepac;
import java.io.*;
import java.util.*;
public class cdv {
	public static void main(String[] args) {
		File f=new File("D:\\HRC\\workspace1\\Helloword\\src\\databasepac\\Data Uploading.csv");
		//   File f = new File("C:\\Users\\BIVAS\\Desktop\\temp.csv");  

		   int count=0;
		   int count1=0;
		try
		{
			Scanner sc=new Scanner(f);
			while(sc.hasNext() && count1<2)
			{
				String data=sc.next();
				String [] ar=data.split(",",-1);
				for(String G:ar) {
					count++;
					System.out.println(G);
			}
				System.out.println(data);
				count1++;}
			sc.close();
				
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(count);
	}

}

	
