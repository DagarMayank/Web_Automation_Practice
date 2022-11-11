package collectionClass;

import java.util.ArrayList;

public class ArrayListCollection 
{
	public static void main(String[] args) 
	{
			ArrayList<Integer> a=new ArrayList<Integer>();
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
