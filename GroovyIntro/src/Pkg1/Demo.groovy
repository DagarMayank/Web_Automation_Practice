package Pkg1;

public class Demo
{
	public def firstmethod()
	{
		println "Its my first groovy project"
	}
	
	public def sum() {
		def a=5;
		def b=6;
		def c=a+b;
		return c;
	}
	public static void main(String[] a)
	{
		def ob=new Demo()
		ob.firstmethod()
		println " "+ob.sum()
	}
}