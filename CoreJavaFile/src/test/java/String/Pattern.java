package String;

public class Pattern 
{
		public static void main(String[] args) 
		{
					for(int i=0 ; i<5 ; i++) {
						for(int j=0 ; j<5 ; j++) {
							System.out.print("* ");
						}System.out.println();
					}
				
					System.out.println("Square Box");

		
					for(int i=1 ; i<=5 ; i++) {
					for(int j=1 ; j<=i ; j++) {
						System.out.print("* ");
					}System.out.println();
		}
				System.out.println("Increasing Triangle");
				
				
					for(int i=1 ; i<=5 ; i++) {
						for(int j=i ; j<=5 ; j++) {
							System.out.print("* ");
						}System.out.println();
			}
					
					System.out.println("Decreasing Triangle");
					
					
		
					for(int i=1 ; i<=5 ; i++) {
						for(int j=1 ; j<=i ; j++) {
							System.out.print("  ");
						}
						for(int j=i ; j<=5 ; j++) {
							System.out.print("* ");
						}
						System.out.println();
					}
					
						System.out.println("Right side Reverse Triangle");
						
						
						for(int i=1 ; i<=5 ; i++) {
							for(int j=5; j>=i ; j--) {
								System.out.print("  ");
							}for(int j=1; j<=i;j++) {
								System.out.print("* ");
							}System.out.println();
						}System.out.println("Right Side Triangle");
		
		
						for(int i=1 ; i<=5 ; i++) {
							for(int j=5 ;j>=i ; j--) {
								System.out.print("  ");
							}for(int j=1 ; j<i; j++){
									System.out.print("* ");
							}for(int j=1; j<=i ; j++) {
								System.out.print("* ");
							}System.out.println();
						}
						System.out.println("This is Mountain");
		
						
						for(int i=1 ;i<=5; i++) {
							for(int j=1 ;j<=i; j++) {
								System.out.print("  ");
							}	for(int j=i ; j<5 ; j++){
								System.out.print("* ");
							}for(int j=i ; j<= 5 ;j++) {
									System.out.print("* ");
							}System.out.println();
						}System.out.println("This is Reverse Mountain");
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
						for(int i=1 ;i<=5; i++) {
							for(int j=i ; j<=5 ;j++) {
								System.out.print("  ");
							}for(int j=1 ; j<i; j++) {
								System.out.print("* ");
							}for(int j=1 ; j<=i ; j++) {
								System.out.print("* ");
							}System.out.println();
						}
						for(int i=1 ;i<=5; i++) {
							for(int j=1 ;j<= i;j++) {
								System.out.print("  ");
							}for(int j=i ; j<5; j++) {
								System.out.print("* ");
							}for(int j=i ; j<=5; j++) {
								System.out.print("* ");
							}System.out.println();
						}System.out.println("This Is Diamond");
		}				
}
