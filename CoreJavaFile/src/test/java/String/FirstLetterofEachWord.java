package String;

public class FirstLetterofEachWord 
{
	public static void main(String[] args) 
	{
		String str = "Mera Baap Badmass tha mein bhi Badmass hu";
		
		String[] s = str.split(" ");
		
		for(int i = 0 ; i < s.length ; i++) {
			System.out.println("words in Array are : "+s[i]);
			
			int j =0 ;
			
			char x = s[i].charAt(j);
			
			System.out.println(x);
		}
	}
}
