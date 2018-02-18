package AutoDownloader.IDSystemAutoDownloader;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoftwareDownloader extends TestBase
{
    Scanner sc=new Scanner(System.in);
    public static final int total_items_in_page=30;
    //WebDriver driver;
    
    @FindBy(xpath="//a[@title='Windows Software']")
    WebElement windowsOs;
    
    @FindBy(xpath="//a[@title='Windows Device Drivers']")
    WebElement widowsdrivers;
    
    @FindBy(xpath="//a[@title='Video Games and Tools']")
    WebElement games;
    
    @FindBy(xpath="//a[@title='Mac Apps']")
    WebElement mac;
    
    @FindBy(xpath="//a[@title='Android Apps (APK)']")
    WebElement android;
    
    @FindBy(xpath="//a[@title='Linux Software']")
    WebElement linux;
    
    //windows sub category
    
    @FindBy(xpath="//li[@title='Expand list']")
    WebElement windows_expand_list;
    
    //page item extraction
    @FindBy(xpath=".//*[@id='wrapper']/div[2]/div[1]/div/div[1]/div/span[4]")
    WebElement page_items_element;
    
    //subcategory...
    
  //-------------------------------------------------------------------------------------------------\\
    
    @FindBy(linkText="Antivirus")
    WebElement W_antivirus;
    
 //........ antivirus subcategory......\\
    
    @FindBy(linkText="Removal Tools")
    WebElement Sub_Removaltools;
//------------------------------------\\    
   
    @FindBy(linkText="Authoring Tools")
    WebElement W_authoringtools;
    
    @FindBy(xpath="CD / DVD / Blu-ray Tools")
    WebElement W_cd_dvd_tools;
    
    @FindBy(linkText="Compression tools")
    WebElement W_compression_tools;
    
    @FindBy(linkText="Desktop Enhancements")
    WebElement W_desktop_enhancement;
    
    @FindBy(linkText="File managers")
    WebElement W_file_manages;
    
    @FindBy(linkText="Gaming Related")
    WebElement W_gaming_releted;
    
    @FindBy(linkText="Internet")
    WebElement W_internet;
   
    @FindBy(linkText="iPod Tools")
    WebElement W_ipod_tools;
    
    @FindBy(linkText="Maps / GPS")
    WebElement W_maps_gps;
    
    @FindBy(linkText="Mobile Phone Tools")
    WebElement W_mobile_phone;
    
    @FindBy(linkText="Multimedia")
    WebElement W_multimedia;
    
    @FindBy(linkText="Network Tools")
    WebElement W_network_tools;
    
    @FindBy(linkText="Office tools")
    WebElement W_office_tools;
    
    @FindBy(linkText="Others")
    WebElement W_others;
    
    @FindBy(linkText="Portable Software")
    WebElement W_portablesoftware;
    
    @FindBy(linkText="Programming")
    WebElement W_programming;

    @FindBy(linkText="System")
    WebElement W_system;
    
    @FindBy(linkText="Tweak")
    WebElement W_tweak;
    
    @FindBy(linkText="Windows Widgets")
    WebElement W_widgets;
   
    //---------------------------------------------------------------------------------------------------------\\
    
    
    public SoftwareDownloader(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    
    public void mainPlatformSupportProducts()
	{
		
    	System.out.println("1)\t Windows");
	    System.out.println("2)\t Drivers");
	    System.out.println("3)\t Games");
	    System.out.println("4)\t Android");
	    System.out.println("5)\t Linux");
	    
	    
	    System.out.println("please choose the software platform");
	    
		int choice_val=sc.nextInt();
		
		switch (choice_val) 
		{
		case 1:
			windowsOs();
			break;
        
		case 2:
			drivers();
			break;
			
		case 3:
			games();
			break;
			
		case 4:
			android();
			break;
			
		case 5:
			linux();
			break;
		
		default:
			System.out.println("you opted wroung option");
			break;
		}
		
	}
	
	
	public void windowsOs()
	{
		windowsOs.click();
		windows_expand_list.click();
		System.out.println("All are category are below please choose anyone if you want to downloads software");
		int choice_downloads=sc.nextInt();
	    
		System.out.println("1\t Antivirus");
	    System.out.println("2\t Authoring Tools");
	    System.out.println("3\t CD / DVD / Blu-ray Tools");
	    System.out.println("4\t Compression tools");
	    System.out.println("5\t Desktop Enhancements");
	    
	    System.out.println("6\t File managers");
	    System.out.println("7\t Gaming Related");
	    System.out.println("8\t Internet");
	    System.out.println("9\t iPod Tools");
	    System.out.println("10\t Maps / GPS");
	    System.out.println("11\t Mobile Phone Tools");
	    System.out.println("12\t Multimedia");
	    System.out.println("13\t Network Tools");
	    System.out.println("14\t Office tools");
	    System.out.println("15\t Others");
	    System.out.println("16\t Portable Software");
	    System.out.println("17\t Programming");
	    System.out.println("18\t Science / CAD");
	    System.out.println("19\t Security");
	    System.out.println("20\t System");
	    System.out.println("21\t Tweak");
	    System.out.println("22\t Windows Widgets");
	    
	    switch (choice_downloads) {
		case 1:
			wincategoryAntivirus();
			
			break;

		default:
			break;
		}
	    
	}
	/**
	 * Here we are declared all the method for downloading windows platform software
	 * 
	 */
	
	
	private void wincategoryAntivirus()
	{
		 //widowsdrivers.click();
		 W_antivirus.click();
		 int total_page=totalPages();
		 System.out.println("Total page of antivirus category " +total_page);
		 
		 System.out.println("there is two way to downloads one is by subcetory or other one is any page without specific subcategory");
		 System.out.println("If you want to downlaod, please choose the page number in range 1 to "+total_page);
		 //0==subcategory and 1=any page without subcategory 
		 System.out.println("Please enter the option for");
		 System.out.println("0\t By Subcategory option ");
		 System.out.println("1\t By only pages without subcategory ");
			
		 int sub_category=sc.nextInt();
		 if(sub_category==0)
		 {
			 System.out.println("1\t RemovalTools ");
			 Sub_Removaltools.click();
			 int total_pages=totalPages();
			 if(total_page%30==0)
			 {
				 System.out.println("page items number is in multiple of 30");
			 }
			 System.out.println("please choose the page no if you want to download");
			 int cur_page=sc.nextInt();
			 
			 while(cur_page<=total_pages)
			 {
				 driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div/div["+cur_page+"]")).click();
				 for(int i=6;i<=36;i++)
				 {
					 
					 driver.findElement(By.xpath(".//*[@id='sjmp']/div["+i+"]/h4/a"));
					 
				 }
						 
			 }
			 if(cur_page<=total_pages)
			 {
				 driver.findElement(By.xpath(".//*[@id='wrapper']/div[4]/div/div["+cur_page+"]")).click();
			 }
			 else
			 {
				 System.out.println("You entered page number is not in given range");
				 System.exit(0);
			 }
		 }
           		 
                		 
		 
	}
	/**
	 * collect total pages
	 * @return
	 */
	public int totalPages()
	{
		String item_number=driver.findElement(By.xpath("//span[contains(@title,'items total in this')]")).getText();
		 String extract_item=item_number.replaceAll("[\\[\\](){}[items]]", "").trim();
		 int total_items=Integer.parseInt(extract_item);
		 int total_page=(total_items/30);
		 //System.out.println("Total page of antivirus category " +total_page);
		 return total_page;
	}
	
	public void drivers()
	{
		 
	}
	
	
	
	public void games()
	{
		games.click();
	}
	
	public void android()
	{
		android.click();
	}
	
	public void linux()
	{
		linux.click();
	}
	
}
