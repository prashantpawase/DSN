package automationFramework;
//Prashant Pawase (ASUS)
//Prashant Pawase (DELL)
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import appModules.SignIn_Action;
import pageObjects.Answers;
import pageObjects.EditAnswers;
import pageObjects.EditQuestions;
import pageObjects.Home_Page;
import pageObjects.Questions;
import utility.Constant;

public class Prashant
{

	private static WebDriver driver = null;
	
	public static void main(String args[]) throws Exception
	{
		
	//	System.setProperty("webdriver.gecko.driver","E:\\geckodriver\\geckodriver.exe");
		
		System.setProperty("webdriver.firefox.marionette","E:\\geckodriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement city = driver.findElement(By.xpath("//a[@data-url='delhi']"));
		city.click();
		
		Thread.sleep(1000);
		
		SignIn_Action.Execute(driver);
		System.out.println("Login Success");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		WebElement discussions = driver.findElement(By.xpath("//a[@href='http://www.edunuts.com/discussions']"));
	    discussions.click();
	    
	    Thread.sleep(2000);

	    try
	    {
		Questions.pquestions(driver).click();
		
		Thread.sleep(2000);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("");
	    }
  
	    try
	    {
		driver.navigate().to("http://www.edunuts.com/discussions");
		
		EditQuestions.peditquestions(driver).click();
		
		Thread.sleep(2000);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("");
	    }
	
	    try
	    {
	 
	    	Answers.panswers(driver).click();
	    	Thread.sleep(1000);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("");
	    }
	    
	    try
	    {
	    	EditAnswers.peditanswers(driver).click();
	    	Thread.sleep(1000);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("");
	    }
	    
	    
	    Thread.sleep(1000);
	    
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
		Home_Page.lnk_Logout(driver);
		System.out.println("Logout Success");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}
}
