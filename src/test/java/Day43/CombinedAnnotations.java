package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CombinedAnnotations
{
	@BeforeSuite
	void BeforeSuite()
	{
		System.out.println("This IS BeforeSuite");
	}
	@AfterSuite
	void AfterSuite()
	{
		System.out.println("This Is AfterSuite");
	}
	@BeforeMethod
	void TestAdvance() 
	{
		System.out.println("This is BeforeMethod");
	}
	@AfterMethod
 
	void TestAfterSearch()
	{
		System.out.println("This is AfterMethod");
	}
	@BeforeClass
	void BeforeSearch()
	{
		System.out.println("This is Before Class");
		
	}
	@AfterClass
	void AfterSearchClass()
	{
		System.out.println("This Is AfterClass");
	}
	
	@Test(priority=1)
	void Testlogin()
	{
		System.out.println("Test Login Was Succesed...");
	}

	@Test(priority=2)
	void Testlogout()
	{
		System.out.println("Test LogOut Was Successed...");
		
	}
	@Test(priority=3)
	void TestSearch()
	{
		System.out.println("Test Search Was Success...");
	}

}
