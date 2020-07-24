package Java_Collections;
import java.util.*;

public class Java_Collections_Questions2 {
	public static void main(String[] args)
	{
		ArrayList<String> k=new ArrayList<String>();
		k.add("Desk");
		k.add("net");
		k.add("ball");
		k.add("spring");
		k.add("hat");
		k.add("newton");
		k.add("hell");
		k.add("fire");
		System.out.println(k);
		System.out.println("Enter element and posittion");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		String b=sc.nextLine();
		k.add(a,b);
		System.out.println(k);
	}

}
