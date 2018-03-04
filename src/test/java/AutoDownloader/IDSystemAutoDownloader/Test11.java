package AutoDownloader.IDSystemAutoDownloader;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test11 extends TestBase {
	
		
		@BeforeTest
		public void setUp()
		{   
			Properties properties=getProp();
		    String URL=properties.getProperty("URL");
			init(URL);
		}
		
		@Test() 
		 public void verifyLoginWithCreadentials() throws InterruptedException
		 {  
			//Properties properties=getProp();
			sleepTime(5);
			//driver.findElement(By.linkText("Windows Software")).click();
			driver.findElement(By.xpath(".//*[@id='wrapper']/div[1]/div[2]/div/div[3]/ul[1]/li[1]/a")).click();
			driver.findElement(By.linkText("Antivirus")).click();
			 WebElement productLink=driver.findElement(By.xpath(".//*[@id='sjmp']/div[6]/h4/a"));
			 //WebElement productLink1=driver.findElement(By.xpath(".//*[@id='sjmp']/div[7]/h4/a"));
			Actions action= new Actions(driver);
			action.contextClick(productLink).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
			sleepTime(5);
			int val=100;
			for(int i=6;i<=38;i++)
			{  try{
				WebElement productLink1=driver.findElement(By.xpath(".//*[@id='sjmp']/div["+i+"]/h4/a"));
			    sleepTime(2); 
				JavascriptExecutor js =(JavascriptExecutor)driver;
				//int ff = productLink1.getLocation().getX();
				  js.executeScript("window.scrollTo(0,"+val+")");	
				//e.click();
				//driver.navigate().refresh();
				  
					  if(productLink1.isDisplayed())
					  {
						  action.contextClick(productLink1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();		
						 	   
					  }
			}
				  
				  catch(NoSuchElementException e)
				  {
					  e.printStackTrace();
					  val+=100;
				  }
			catch (WebDriverException e) {
				// TODO: handle exception
				 val+=300;
				e.printStackTrace();
			}
				  val+=100;
			}
			//WebElement element = driver.findElement(By.id(""));
			
		 }
		
		public void tearDown()
		{  
			sleepTime(10);
			driver.quit();
		}
		
}
