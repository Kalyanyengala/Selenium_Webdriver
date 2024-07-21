package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoDependc 
{
	public class DependenciesDemo 
	{
		@Test(priority=1)
		void TestLogin()
		{
			Assert.assertTrue(false);
			System.out.println("This Is For Login");
		}
		@Test(priority=2,dependsOnMethods= {"TestLogin"})
		void TestSearch()
		{
			System.out.println("This is For LogOut");
		}
		@Test (priority=3,dependsOnMethods= {"TestLogin"})
		void TestLogout()
		{
			System.out.println("This IS For Logout");
			
		}

}}
