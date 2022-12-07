package assignment;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMap_Loop 
{
	@Test
	public void Hash()
	{
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "Mayank");
		map.put(2, "Krishan");
		map.put(3, "Nitin");
		map.put(4, "piyush");
		
		Set<Integer> allkey=map.keySet();
		for(Integer i : allkey)
		{
			System.out.println(i+" Key and value is "+map.get(i));
		}
	}
}
