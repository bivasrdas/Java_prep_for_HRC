package Java_Collections;
import java.util.HashMap;
import java.util.*;
public class Java_Collections_Questions1 {
	public static void main(String[] args)
	{
		HashMap<Integer,String> sorted_=new HashMap<Integer,String>();
		sorted_.put(1,"Desk");
		sorted_.put(54,"net");
		sorted_.put(5,"ball");
		sorted_.put(35,"spring");
		sorted_.put(3,"hat");
		sorted_.put(5534,"newton");
		sorted_.put(43,"hell");
		sorted_.put(45,"fire");
		ArrayList<Integer> k=new ArrayList<Integer>();
		Set <Integer> keys=sorted_.keySet();
		for(Integer i:keys)
			k.add(i);
		Collections.sort(k);
		for(int i:k)
			System.out.println(i+":"+sorted_.get(i));
			
		
	}

}
