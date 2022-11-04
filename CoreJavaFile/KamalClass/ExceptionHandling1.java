package KamalClass;

public class ExceptionHandling1 
{
public static void main(String[] args) {
	int sum = 0;
		try {
			int a=10;
			int b=0;
			 sum=a+b;
			
			int div=a/b;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("-----");
			
		}
		finally {
			System.out.println(sum);
		}
		
}
	
	
	
	
}
