package pageObjects;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorMsg
{
public static WebDriver driver = null;


public static WebElement Qstn(WebDriver driver) throws InterruptedException
{

        WebElement erromsgsize =  driver.findElement(By.xpath("//span[@class='msg']"));
        String txt = erromsgsize.getText();
        
        
        
            if(txt.equals("Question posted successfully"))
            {
            	 System.out.println("true");
            }
            else
            {
        //    	System.out.println("false");
            	driver.navigate().to("http://www.edunuts.com/discussions");
            }
      
		return null;

}

}
