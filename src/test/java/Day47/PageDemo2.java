package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageDemo2
{
	WebDriver driver;
	
	PageDemo2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By btn_login=By.xpath("//span[normalize-space()='Log in']");
	By txt_email=By.xpath("//input[@id='form-group--1']");
	By btn_clicklog=By.xpath("//span[@class='ud-btn-label']");
	By btn_otpclick=By.xpath("//input[@id='u76-form-group--16']");
	By btn_loginclick=By.xpath("//span[@class='ud-btn-label']");
	
	public void setlogin()
	{
		driver.findElement(btn_login).click();
	}
	public void setemail(String user)

	{
		driver.findElement(txt_email).sendKeys(user);
	}
	public void setclickbutton()
	{
		driver.findElement(btn_clicklog).click();
	}
	
	public void setotpclick() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(btn_otpclick).click();
	}
	public void setloginclick()
	{
		driver.findElement(btn_loginclick).click();
	}
}
