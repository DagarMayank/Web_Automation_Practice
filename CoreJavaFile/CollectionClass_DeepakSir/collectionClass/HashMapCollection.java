package collectionClass;

import java.util.HashMap;
import java.util.Set;

public class HashMapCollection 
{
	public static void main(String[] args) 
	{
			HashMap<Integer, String> h=new HashMap<Integer, String>();
			h.put(1, "Mayank");
			h.put(11, "Krishan");
			h.put(9, "Nitin");
			h.put(6, "Baniya");
			
			Set<Integer> allKey=h.keySet();//this will transferred all the key in the allkey variable
			for(Integer i : allKey)
			{
				System.out.println(i+" Key and value is "+h.get(i));
			}
				
	}
}
