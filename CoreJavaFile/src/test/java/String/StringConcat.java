package String;

public class StringConcat 
{
	public static void main(String[] args) 
	{
			String s1= "Hello all of you";
			String s2= "Lets Start Automation";
			
			String s3 =  s1+s2;
			String s4=   s1.concat(s3);
			System.out.println(s3);
	
			String s5= s4.toUpperCase();
			System.out.println(s4);
			int l1=s5.length();
			System.out.println(s5);
			System.out.println(l1);
	}
}
