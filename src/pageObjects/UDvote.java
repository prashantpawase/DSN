package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UDvote 
{

	public static WebElement pUDvote(WebDriver driver)
	{
		
	    WebElement upvote = driver.findElement(By.xpath("//i[@class='fa fa-thumbs-up']"));
	    upvote.click();
		
	    WebElement upvoteC = driver.findElement(By.xpath("//span[@class='vote-counter']"));
	    System.out.println(upvoteC.getText());
	    
	    WebElement downvote = driver.findElement(By.xpath("//i[@class='fa fa-thumbs-o-down']"));
	    downvote.click();
		
	    WebElement downvoteC = driver.findElement(By.xpath("//span[@class='vote-counter']"));
	    System.out.println(downvoteC.getText());
	    
		
		return null;
		
	}
	
	
	
}
