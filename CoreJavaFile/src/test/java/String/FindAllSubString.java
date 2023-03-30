package String;

public class FindAllSubString 
{
	public static void main(String[] args) 
	{
		String str = "Badmass";
		System.out.println("lenght of String is  "+str.length());
		int l = str.length();
		
//		for(int i = 0; i < l; i++)
//		{
//			for(int j =1; j < l; j++) 
//			{
//				String x = str.substring(i,j);
//				System.out.println(x);
//			}
//		}
		
		String[] s = str.split("");
		int l1 = s.length;
		String s1 ="";
		for(int x = 0; x < l1; x++)
			
		{
			s1 =  s[x];
			for(int z =1; z < l1; z++) 
			{
				
			
				s1 = s1 +s[z];
				System.out.println(s1);
			}
		}	
	}
}
