package String;

public class RemoveDuplicateandSpecialCharacter 
{
	public void reverseCharacterOnly(String str) {
				String a = str.replaceAll("[^0-9_!_@_#_$_%_&_*_-]"," ");
				char[] ch=str.toCharArray(); 
				char c = 0;
				
				for(int i = 0; i < ch.length/2 ; i++ ) 
				{
					for(int j = ch.length -1 ; j >= ch.length/2 ; j-- )
					{
						if(Character.isAlphabetic(ch[i])&& (Character.isAlphabetic(ch[j])))
						{
							c = ch[i];
							ch[i] = ch[j];
							ch[j] = c ;
							System.out.println(ch[i]+ "    "+ch[j]);
							break;
							
						}
						
					}
				}
				
				for(char x : ch) {
					System.out.print(x);
				}
				
				
	}		
	
	
	
	public static void main(String[] args) 
	{
	
		RemoveDuplicateandSpecialCharacter  rm = new RemoveDuplicateandSpecialCharacter();
		rm.reverseCharacterOnly("#%$@#May@#$%@#$ank-@12!#%$*&&");
	
	
	}
	
	
}
