package pageObjects;
//Prashant Pawase

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Questions 
{

	public static WebElement pquestions(WebDriver driver)
	{
		/*
		    WebElement askQ = driver.findElement(By.xpath("//a[@data-target='#askQuestion']"));
		    askQ.click();
		 */   
		    WebElement askQ = driver.findElement(By.xpath("//a[@data-action='ask-question']"));
		    askQ.click();
		    
	    
		    Actions act = new Actions(driver);

			act.keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
			
			WebElement title = driver.findElement(By.xpath("//input[@id='question-title']"));
			title.click();
			title.sendKeys("What you think about Education in India ?");
			
			WebElement ds = driver.findElement(By.xpath("//input[@id='question-title']"));
			ds.click();
			ds.sendKeys(Keys.TAB);
			
		  
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
			WebElement desc = driver.findElement(By.xpath("//iframe[@id='question-description_ifr']"));
			desc.click();
			desc.sendKeys("Education in India");
			
			
			WebElement topics = driver.findElement(By.xpath("//input[@placeholder='Topics (example: DU, learning, philosophy)']"));
			topics.click();
			topics.sendKeys("education");
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	//		driver.findElement(By.xpath("html/body/div[2]/div/div/form/div[1]/div[2]/ul/li[3]/a/strong")).click();
			driver.findElement(By.xpath("html/body/div[3]/div/div/form/div[1]/div[2]/ul/li[1]/a")).click();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			/*
			driver.findElement(By.xpath("html/body/div[2]/div/div/div/p")).click();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			*/
			WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
			Submit.click();
			
		    act.keyUp(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).perform();
	/*
		    String WindowHandl = driver.getWindowHandle();
		    driver.switchTo().window(WindowHandl);
	*/
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    
		    WebElement Verify = driver.findElement(By.xpath("//h4[@class='question-title']"));
		    System.out.println(Verify.getText());
		    
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    
		    String WindowHandl = driver.getWindowHandle();
		    driver.switchTo().window(WindowHandl);
		    
		    
		return null;
		
	}
}
