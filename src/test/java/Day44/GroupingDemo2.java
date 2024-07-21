package Day44;

import org.testng.annotations.Test;

public class GroupingDemo2 
{
	@Test(priority=1,groups= {"Regression"})
	void TestLogin()
	{
		System.out.println("This Is for Login");
		
		
	}
	@Test(priority=2,groups= {"Regression"})
	void TestSearch()
	{
		System.out.println("This Is FOr Searching");
	}
	@Test(priority=3,groups= {"Regression"})
	void TestLogout()
	{
		System.out.println("This is For Logout");
	}

}
