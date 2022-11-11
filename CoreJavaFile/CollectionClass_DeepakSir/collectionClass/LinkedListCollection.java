package collectionClass;

import java.util.LinkedList;

public class LinkedListCollection 
{
	public static void main(String[] args) 
	{
			LinkedList<Integer> a=new LinkedList<Integer>();
			a.add(123);
			a.add(345);
			a.add(866);
			a.add(666);
			a.add(123);
			
			for(Integer i : a)
			{
				System.out.println(i);
			}
	}

}
 