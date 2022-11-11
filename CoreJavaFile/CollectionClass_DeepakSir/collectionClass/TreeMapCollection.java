package collectionClass;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapCollection
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> h=new TreeMap<Integer, String>();
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
