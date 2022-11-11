package collectionClass;

import java.util.LinkedHashSet;

public class LinkedHashSetCollection 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(1234);
		hs.add(12);
		hs.add(1234);
		hs.add(4321);
		hs.add(5467);
		
		for(Integer i : hs)
		{
			System.out.println(i);
		}
	}
}
