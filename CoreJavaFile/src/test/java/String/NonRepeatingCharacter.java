package String;
import java.util.*;
public class NonRepeatingCharacter {
	public static void main(String[] args) {

		String a = "algoritlhmmyxzqede ";
		int l = a.length();
		int count = 0;

		for (int i = 0; i < l; i++) 
		{

					for (int j = 0; j < l; j++) 
						{
								if (a.charAt(i) == a.charAt(j)) 
								{
												count++;
															if (count == 2) 
															{
																a.replace((char) i,' ');
																	break;
																}

								}
				
						}
			if (count != 2)
			{
				System.out.println("In the String  " + a.charAt(i) + "  is non repetive correcter");
			}
			count = 0;

		}
	
//	for(int i=0;i<a.length();i++)	{
//		
//		if(hm.containsKey(a.charAt(i))) {
//			System.out.println(a.charAt(i));
//
//			hm.put(a.charAt(i),1);
//		}
//		else {
//			System.out.println(a.charAt(i));
//			hm.put(a.charAt(i),hm.get(a.charAt(i))+1);
//		}
//	}
//	
//	System.out.println(hm);
//	
//	
	}
	
}
