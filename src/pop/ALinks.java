//Prashant Pawase
//General Folder
package pop;

import java.io.IOException;
import java.util.List; 
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse; 
import org.apache.http.client.methods.HttpGet; 
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ALinks 
{ 
	public static void main(String[] args) throws IOException
	{ 
		System.setProperty("webdriver.firefox.marionette","E:\\geckodriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize(); 
		driver.get("http://www.edunuts.com/sitemap/listing.xml"); 
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
/*
		WebElement city = driver.findElement(By.xpath("//a[@data-url='delhi']"));
		city.click();
		
*/	
		
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	    
		List<WebElement> total_links = driver.findElements(By.tagName("a")); 
		System.out.println("Total Number of Links found on page = " + total_links.size());
	
		boolean isValid = false;
		for (int i = 0; i < total_links.size(); i++) 
		{ 
			System.out.println(total_links.get(i).getSize());
			String url = total_links.get(i).getAttribute("href");
			if (url != null) 
			{ 
				
				isValid = getResponseCode(url); 
				
				if (isValid) 
				{ 
					
					System.out.println("\033[32;1;2mValid Link:\033[0m" + url); 
					System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------"); 
					System.out.println(); 
					} 
				else 
				{
					System.out.println("\033[31;1mBroken Link\033[0m ------> " + url); 
					System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------"); 
					System.out.println();
					} 
				} 
			else
			{ 
				
               System.out.println("String null"); 
				System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------"); 
				System.out.println();
				continue; 
				} 
			
		}
		driver.close();
		} 
	
	public static boolean getResponseCode(String chkurl) 
	{ 
		boolean validResponse = false;
		try
		{ 
			
			HttpResponse urlresp = new DefaultHttpClient().execute(new HttpGet(chkurl));
			int resp_Code = urlresp.getStatusLine().getStatusCode();
			System.out.println("Response Code Is : "+resp_Code);
			if
			((resp_Code == 404) || (resp_Code == 505))
			{ 
				validResponse = false;
			}
			else 
			{
				validResponse = true;
			} 
			} 
		catch (Exception e) 
		{
			
		} 
		return validResponse; 
		
		} 
	
	}

