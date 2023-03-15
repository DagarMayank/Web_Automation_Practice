package HemlataClass;

public class Array 
{
	
	public static void main(String[] args) 
	{
		int a[][]= new int[5][5];
		int k=1;
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=k++;
				System.out.print(a[i][j]+" ");
				if(i==4 && j<=4)
				{
					sum=sum+a[i][j];
				}
			}
		System.out.println();
		}
		System.out.println(sum);
	}
}
