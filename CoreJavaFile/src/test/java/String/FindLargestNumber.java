package String;

public class FindLargestNumber
{
	public static void main(String[] args) 
	{
			int[] a = {1, 2, 3, 4, 10, 5, 11};
			int temp;
			for (int i = 0; i < a.length; i++) 
	        {
	            for (int j = i + 1; j < a.length; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.println("Second Largest:"+a[a.length-2]);
	        System.out.println("Smallest:"+a[0]);
	    }
	
}
