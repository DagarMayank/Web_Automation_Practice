package collectionClass;

import java.util.TreeSet;

public class TreeSetCollection 
{
		public static void main(String[] args) 
		{
			TreeSet<String> ts=new TreeSet<String>();//treeSet will maintain the ascendiing order 
			ts.add("Hello all");          
			ts.add("My name is Mayank");
			ts.add("Working as an intern ");
			ts.add("In organisation ImpactQA");
			
			for (String i : ts)
			{
				System.out.println(i);
			}
		}
}
