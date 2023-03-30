package String;

public class SplitString 
{
	public static void main(String[] args) {
		
		String str = "Jai Shree Ram";
		String rev = "";
		
		int l = str.length();
/**
 * 		// Reversing the Whole Sentence 
 */
		for(int i = l-1 ; i >= 0 ; i--) {
			
			rev = rev +""+str.charAt(i) ; 
			
		}
		System.out.println("Reverse of the Sentence is "+rev);
		
		
		String[] sp = str.split(" ");
/** 
 * 		// Reversing On the Basis of Words 
 */
		String rp = "";
		for(int j = sp.length - 1 ; j >= 0; j--) {
			rp = rp+""+sp[j];
			System.out.println("Rp value in loop "+rp);
		}
		System.out.println("Rp value after loop  "+rp);
		
/**		
		Reverse Each Word in the Sentence
	
*/		StringBuffer sb= new StringBuffer(str); //this is the java inbuild method
		String s1=sb.reverse().toString();
		System.out.println(  "Value of s1 is "+s1);
		
		String[] pp = s1.split(" ");
		// Reversing On the Basis of Words 
		String reverse ="";
		for(String temp : pp ) {
			reverse = temp+" "+reverse;
		}
		
		System.out.println("Reverse of each Word is :  "+ reverse);
	}
}