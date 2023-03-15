package String;

public class DoubleDiamondPattern 
{
	public static void main(String[] args) 
	{
			for(int i=1; i<=5; i++) {
				for(int j=i; j<=5;j++) {
					System.out.print("  ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("* ");
				}for(int j=1; j<i; j++) {
					System.out.print("* ");
				}
					System.out.println();
				
			}
		
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("  ");
				}
				for(int j=i; j<5; j++) {
					System.out.print("* ");
				}
				for(int j=i; j<=5; j++) {
					System.out.print("* ");
				}System.out.println();
			}
			
			
			
			
			int a[][]= new int[5][5];
			int k=1;
			int sum = 0;
			int l= a.length;
			
			for(int i=1; i<l; i++)
			{
				for(int j=1; j<l; j++) 
				{
						System.out.print(" "+(a[i][j]=k++));
						sum = sum + a[i][j];

				}System.out.println();
			
			}System.out.println(" "+sum);
	}
}
