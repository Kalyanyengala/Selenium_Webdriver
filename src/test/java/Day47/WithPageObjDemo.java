package Day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPageObjDemo 
{
	WebDriver driver;
	

	WithPageObjDemo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_password;
	
	
	public void setusername(String user)
	{
		txt_username.sendKeys(user);
	}
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void setlogin()
	{
		btn_password.click();
		
	}
	
}