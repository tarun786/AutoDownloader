package AutoDownloader.IDSystemAutoDownloader;

import java.util.Properties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TC001_DownloadingSoftware extends TestBase {
	
		SoftwareDownloader softdownlaods;;
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
			
			softdownlaods=new SoftwareDownloader(driver);
			softdownlaods.mainPlatformSupportProducts();
				
		 }
		@AfterTest
		public void tearDown()
		{  
			sleepTime(10);
			driver.quit();
		}
		
}
