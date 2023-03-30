package collectionClass;

import java.util.HashSet;
import java.util.*;

public class HashSetCollection 
{
		public static void main(String[] args) 
		{
				HashSet<Integer>  s=new HashSet<Integer>();
				s.add(12);
				s.add(1234);
				s.add(4321);
				s.add(5467);
				
				for(Integer i : s)	//It is called "For-Each" loop in this we don't need to initialize,give condition,inc/dec
				{
					System.out.println(i);
				}
				
				if(s.contains(12)) {
					System.out.println("True");
				}
				
				
				
		}
}
