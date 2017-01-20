package pageObjects;
//Prashant Pawase
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Answers
{

	public static WebElement panswers(WebDriver driver)
	{
		driver.navigate().to("http://www.edunuts.com/discussions");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	    WebElement dis = driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div[1]/div/div[2]/div/div[1]/div/h4/a"));
	    dis.click();
	    
	    WebElement Wans = driver.findElement(By.xpath("//a[@data-action='answer-question']"));
	    Wans.click();
	    
	    
	    Actions actt = new Actions(driver);

		actt.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
	    
	    WebElement ans = driver.findElement(By.xpath("//iframe[@id='answer-description_ifr']"));
	    ans.click();
	    ans.sendKeys("Testing Testing Testing Testing");
		
	    WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
	    submit.click();
		
		actt.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
	    
	    WebElement span = driver.findElement(By.xpath("html/body/header/div/div/div[2]/div/a/span"));
	    span.click();
	    
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		return span;
	}
	
}
