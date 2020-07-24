package databasepac;
import java.util.*;
import java.io.*;
public class col {
	public static void main(String[] args) throws IOException {  
		   ArrayList<String> ar = new ArrayList<String>();    
		   File f=new File("D:\\HRC\\workspace1\\Helloword\\src\\databasepac\\Data Uploading.csv");
		   // File csvFile = new File("C:\\Users\\BIVAS\\Desktop\\temp.csv");  
		         BufferedReader br = new BufferedReader(new FileReader(f));  
		         String line = "";  
		         int count=0;
		         StringTokenizer st = null;  
		         int lineNumber = 0;   
		         int tokenNumber = 0;  
		         while ((line = br.readLine()) != null && lineNumber<2) {
		        	 System.out.println(line);
		             lineNumber++;
		             count=0;
		            String [] arr=line.split(",");
					for(String G:arr)
					{
						count++;
						System.out.println(G);
						if(G.isEmpty())
						{
							System.out.println(G+"*****"+count);
							arr[count-1]="NULL";
						}
					}
						for(String H:arr)
						{
							
							System.out.println(H);
						}
		               
		             
					System.out.println("count is"+count);	
		         }  
	}
}


