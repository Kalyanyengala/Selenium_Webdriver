package Day36;
import java.util.List;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class SliderElements {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement min_slide=driver.findElement(By.xpath("//span[1]"));
		System.out.println(min_slide.getLocation());                        //X AXIS:58  Y AXIS:250

		act.dragAndDropBy(min_slide,100,250).perform();
		
		Object x;
		//System.out.println(min_slide.getLocation().get(x));
		
		
		System.out.println(min_slide.getLocation());                       // 158, 250
		
		WebElement max_slide=driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max_slide,-100,250).perform();
		
		System.out.println(max_slide.getLocation());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
