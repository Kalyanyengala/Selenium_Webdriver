package Day42;

import org.testng.annotations.Test;

public class TestCase1

{
	
	@Test(priority=1)
	void OpenApplication() 
	{
		System.out.println("TestCasePassed...!");
	}
	@Test(priority=2)
	void Login()
	{
		System.out.println("Logined SuccessFully...!");
		
	}
	@Test(priority=3)
    void Logout()
    {
		System.out.println("LogOuteedSuccessfully");	
    }


}

