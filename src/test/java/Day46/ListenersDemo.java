package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener
{
 public void onStart(ITestContext context )
 {
	 System.out.println("This Is OnStart Method...."); 
 }
 public void onTestStart(ITestResult result)
 {
	 System.out.println("This IS For TestStarting....");
 }
 public void onTestSuccess(ITestResult result)
 {
	 System.out.println("This Is For Success...");
 }
 public void onTestSkipped(ITestResult result)
 {
	 System.out.println("This Is For SkippedTests..");
 }
 public void onTestFailure(ITestResult result)
 {
	 System.out.println("This Is For Failure...");
 }
 public void onFinish(ITestContext context)
 {
	System.out.println("This Is For Finishing...."); 
 }}