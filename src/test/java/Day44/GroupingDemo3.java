package Day44;

import org.testng.annotations.Test;

public class GroupingDemo3 
{
	@Test(priority=1,groups= {"Sanitary","Regression","Functional"})
	void TestLogin()
	{
		System.out.println("This Is for Login");
		
		
	}
	@Test(priority=2,groups= {"Sanitary","Regression","Functional"})
	void TestSearch()
	{
		System.out.println("This Is FOr Searching");
	}
	@Test(priority=3,groups= {"Sanitary","Regression","Functional"})
	void TestLogout()
	{
		System.out.println("This is For Logout");
	}

}
