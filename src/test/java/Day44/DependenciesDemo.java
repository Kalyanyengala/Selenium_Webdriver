package Day44;
import org.testng.Assert;
import org.testng.annotations.*;
//Login
//Search
//Logout

public class DependenciesDemo 
{
	@Test(priority=1)
	void TestLogin()
	{
		Assert.assertTrue(false);
		System.out.println("This Is For Login");
	}
	@Test(priority=2)
	void TestSearch()
	{
		System.out.println("This is For LogOut");
	}
	@Test (priority=3)
	void TestLogout()
	{
		System.out.println("This IS For Logout");
		
	}
	

	
	
}
