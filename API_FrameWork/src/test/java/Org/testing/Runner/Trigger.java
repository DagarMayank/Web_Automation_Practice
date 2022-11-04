package Org.testing.Runner;

import java.io.IOException;

import Org.testing.Testcases.TC1_Postrequest;
import Org.testing.Testcases.TC2_GetALL;
import Org.testing.Testcases.TC3_GetOrgParsing;

public class Trigger 
{
	public static void main(String[] args) throws IOException 
	{
		TC1_Postrequest tc1=new TC1_Postrequest();
		tc1.testcase1();
		
		TC2_GetALL tc2=new TC2_GetALL();
		tc2.testcase2();
		
		TC3_GetOrgParsing tc3=new TC3_GetOrgParsing();
		tc3.testcase3();
	}
}
