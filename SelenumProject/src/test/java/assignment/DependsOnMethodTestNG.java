package assignment;

import org.testng.annotations.Test;

public class DependsOnMethodTestNG 
{
	@Test()
	public void setup()
	{
		System.out.println("This  is executed first");
	}
	@Test
	public void Action()//dependsOnMethods= "setup")
	{
		System.out.println("This  is executed Last");
	}
	@Test
	public void close()
	{
		System.out.println("This  is executed Second");
	}
}
