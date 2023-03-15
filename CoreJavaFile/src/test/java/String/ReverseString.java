package String;

public class ReverseString 
{
	public static void main(String[] args) 
	{
			String orginal="Hello";						//this is the one way custom way
			int l1= orginal.length();
			String rev ="";
			
			for(int i = l1-1; i>=0; i--) {
				rev=rev+orginal.charAt(i);
				}
			System.out.println(rev);
			
			
			
			StringBuffer sb= new StringBuffer(orginal); //this is the java inbuild method
			String s1=sb.reverse().toString();
			System.out.println(s1);
	}
}
