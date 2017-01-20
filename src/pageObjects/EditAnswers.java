package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditAnswers 
{

	public static WebElement peditanswers(WebDriver driver)
	{
       
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


	    WebElement EdtA = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-edit']"));
	    EdtA.click();
	    
	
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	    WebElement Ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
		Ans.click();
		Ans.sendKeys(Keys.CONTROL + "a");
		Ans.sendKeys(Keys.DELETE);
		Ans.sendKeys("Testing Answer Editing For Questions in Discussions");
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	
		WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
		update.click();
		
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	
	
		
		return null;
		
	}
	
}
