package test_ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example 
{
	@Test
	public void test()
	{
		Reporter.log("Framework starts",true);
	}
	@Test
	public void test1()
	{
		Reporter.log("Framework Ends",false);
	}
}
