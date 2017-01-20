package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditQuestions 
{

	public static WebElement peditquestions(WebDriver driver)
	{
		
		
		
		    WebElement EdtQ = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-edit']"));
		    EdtQ.click();
		    
		    
		    WebElement Utitle = driver.findElement(By.xpath("//input[@id='question-title']"));
			Utitle.click();
			Utitle.clear();
			Utitle.sendKeys("How to studying?");
		    
	      
			WebElement Udesc = driver.findElement(By.xpath("//iframe[@id='question-description_ifr']"));
			Udesc.click();
			Udesc.sendKeys(Keys.CONTROL + "a");
			Udesc.sendKeys(Keys.DELETE);
			Udesc.sendKeys("Studying discussions Questions");
			
			
			WebElement RTopic = driver.findElement(By.xpath("//span[@data-role='remove']"));
			RTopic.click();
			
			
			WebElement Utopics = driver.findElement(By.xpath("//input[@placeholder='Topics (example: DU, learning, philosophy)']"));
			Utopics.click();
			Utopics.sendKeys("management");
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	   //     driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div/div/div/form/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div[1]/div/div/div/form/div[2]/div/ul/li[1]/a")).click();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		
			WebElement update = driver.findElement(By.xpath("//button[@type='submit']"));
			update.click();
			
			
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		return null;
		
	}
	
	
}
