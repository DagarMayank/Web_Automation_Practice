package Listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class TestNGListenerDemo 
{
	@Test
	public void test1()
	{
		System.out.println(" i am inside test1");
	}
	@Test
	public void test2()
	{
		System.out.println(" i am inside test2");
	}
	@Test
	public void test3()
	{
		System.out.println(" i am inside test3");
		throw new SkipException("This test is skipped ");
	}
}
