package com.novell.ZENworks.Autodownloader;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.novell.ZENworks.testbase.TestBase;

public class SoftwareDownloader extends TestBase {
	Scanner sc = new Scanner(System.in);
	public static final int total_items_in_page = 30;
	public static final Logger logger = Logger.getLogger(SoftwareDownloader.class.getName());
	// WebDriver driver;

	@FindBy(xpath = "//a[@title='Windows Software']")
	WebElement windowsOs;

	@FindBy(xpath = "//a[@title='Windows Device Drivers']")
	WebElement widowsdrivers;

	@FindBy(xpath = "//a[@title='Video Games and Tools']")
	WebElement games;

	@FindBy(xpath = "//a[@title='Mac Apps']")
	WebElement mac;

	@FindBy(xpath = "//a[@title='Android Apps (APK)']")
	WebElement android;

	@FindBy(xpath = "//a[@title='Linux Software']")
	WebElement linux;

	// windows sub category

	@FindBy(xpath = "//li[@title='Expand list']")
	WebElement windows_expand_list;

	// page item extraction
	@FindBy(xpath = ".//*[@id='wrapper']/div[2]/div[1]/div/div[1]/div/span[4]")
	WebElement page_items_element;

	// subcategory...

	// -------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Antivirus")
	WebElement W_antivirus;

	// ........ antivirus subcategory......\\

	@FindBy(linkText = "Removal Tools")
	WebElement Sub_Removaltools;
	// -------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Authoring Tools")
	WebElement W_authoringtools;

	// ------------------------------------------------------------------------------------------------------\\
	@FindBy(linkText = "Authoring Related")
	WebElement Sub_authoringrelated;

	@FindBy(linkText = "Business Cards")
	WebElement Sub_businesscards;

	@FindBy(linkText = "Cover editors")
	WebElement Sub_covereditors;

	@FindBy(linkText = "Digital Album")
	WebElement Sub_digitalalbum;

	@FindBy(linkText = "Help & e-book creators")
	WebElement Sub_Helpebookcreators;

	@FindBy(linkText = "Screensaver Tools")
	WebElement Sub_ScreensaverTools;

	@FindBy(linkText = "Setup creators")
	WebElement Sub_Setupcreators;
	// -------------------------------------------------------------------------------------------------------------------\\

	@FindBy(xpath = "CD / DVD / Blu-ray Tools")
	WebElement W_cd_dvd_tools;

	// ---------------------------------------------------------------------------------------------------------------------\\

	@FindBy(xpath = "Audio CD/DVD Burning")
	WebElement Sub_AudioCDDVDBurning;

	@FindBy(xpath = "AutoRun Builders")
	WebElement Sub_AutoRunBuilders;

	@FindBy(xpath = "CD/DVD Images Utils")
	WebElement Sub_CDDVDImagesUtils;

	@FindBy(xpath = "CD/DVD Rip/Other Tools")
	WebElement Sub_CDDVDRipOtherToolss;

	@FindBy(xpath = "Data CD/DVD Burning")
	WebElement Sub_DataCDDVDBurning;

	@FindBy(xpath = "Virtual CD/DVD-Rom")
	WebElement Sub_VirtualCDDVDRom;

	// ----------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Compression tools")
	WebElement W_compression_tools;
	// -------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Desktop Enhancements")
	WebElement W_desktop_enhancement;

	// ------------------------------------------------------------------------------------------------------------------------------\\
	@FindBy(linkText = "Clocks & Time Management")
	WebElement Sub_ClockTimeManagement;

	@FindBy(linkText = "Icon Collections")
	WebElement Sub_IconCollections;

	@FindBy(linkText = "Icons Related")
	WebElement Sub_IconsRelated;

	@FindBy(linkText = "Other Desktop Enhancements")
	WebElement Sub_OtherDesktopEnhancements;

	@FindBy(linkText = "Screensavers")
	WebElement Sub_Screensavers;

	@FindBy(linkText = "Shell Replacements")
	WebElement Sub_ShellReplacements;

	@FindBy(linkText = "Themes")
	WebElement Sub_Themes;
	// -------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "File managers")
	WebElement W_file_manages;

	// --------------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Gaming Related")
	WebElement W_gaming_releted;

	// ......................................................................................................................\\

	@FindBy(linkText = "Internet")
	WebElement W_internet;

	// ................................................................................................................................................\\

	@FindBy(linkText = "Bookmark Manager")
	WebElement Sub_BookmarkManager;

	@FindBy(linkText = "Browsers")
	WebElement Sub_Browsers;

	@FindBy(linkText = "Chat:")
	WebElement Sub_Chat;

	@FindBy(linkText = "Download Managers")
	WebElement Sub_DownloadManagers;

	@FindBy(linkText = "E-mail:")
	WebElement Sub_Email;

	@FindBy(linkText = "FTP Clients")
	WebElement Sub_FTPClients;

	@FindBy(linkText = "File Sharing")
	WebElement Sub_FileSharing;

	@FindBy(linkText = "Internet Applications Addons:")
	WebElement Sub_InternetApplicationsAddons;

	@FindBy(linkText = "Internet Radio/TV Player")
	WebElement Sub_InternetRadioTVPlayer;

	@FindBy(linkText = "News / Newsgroups /Blog Tools")
	WebElement Sub_NewsNewsgroupsBlogTools;

	@FindBy(linkText = "Offline Browsers")
	WebElement Sub_OfflineBrowsers;

	@FindBy(linkText = "Other Internet Related")
	WebElement Sub_OtherInternetRelated;

	@FindBy(linkText = "Popup / Ad / Spyware Blockers")
	WebElement Sub_PopupAdSpywareBlockers;

	@FindBy(linkText = "Remote Utils")
	WebElement Sub_RemoteUtils;

	@FindBy(linkText = "Search engine tools/submiting")
	WebElement Sub_Searchenginetoolssubmiting;

	@FindBy(linkText = "Secure Browsing / VPN")
	WebElement Sub_SecureBrowsingVPN;

	@FindBy(linkText = "Servers:")
	WebElement Sub_Servers;

	@FindBy(linkText = "Streaming")
	WebElement Sub_Streaming;

	@FindBy(linkText = "Telephony / SMS & GSM")
	WebElement Sub_TelephonySMSGSM;

	@FindBy(linkText = "WEB Design:")
	WebElement Sub_WEBDesign;

	@FindBy(linkText = "Weather@Home")
	WebElement Sub_WeatherHome;

	@FindBy(linkText = "WebCam")
	WebElement Sub_WebCam;

	// --------------------------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "iPod Tools")
	WebElement W_ipod_tools;
	// ---------------------------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Multimedia IPOD tools")
	WebElement Sub_MultimediaIPODtools;

	@FindBy(linkText = "Office IPOD tools")
	WebElement Sub_OfficeIPODtools;

	@FindBy(linkText = "Other IPOD tools/Updates")
	WebElement Sub_OtherIPODtoolsUpdates;

	@FindBy(linkText = "Podcast")
	WebElement Sub_Podcast;
	// -----------------------------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Maps / GPS")
	WebElement W_maps_gps;
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Mobile Phone Tools")
	WebElement W_mobile_phone;
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "IPhone")
	WebElement Sub_IPhone;

	@FindBy(linkText = "Nokia")
	WebElement Sub_Nokia;

	@FindBy(linkText = "Others")
	WebElement Sub_Others;

	@FindBy(linkText = "Siemens")
	WebElement Sub_Siemens;

	@FindBy(linkText = "Sony Ericsson")
	WebElement Sub_SonyEricsson;
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Multimedia")
	WebElement W_multimedia;
	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------\\
	// audio toggle button
	@FindBy(xpath = ".//*[@id='wrapper']/div[2]/div[2]/div[2]/div[1]/span")
	WebElement audiotoggle_btn;

	// Audio Category

	@FindBy(linkText = "Audio CD Rippers & Encoders")
	WebElement W2Sub_AudioCDRippersEncoders;

	@FindBy(linkText = "Audio Codecs")
	WebElement W2Sub_AudioCodecs;

	@FindBy(linkText = "Audio Converters")
	WebElement W2Sub_AudioConverters;

	@FindBy(linkText = "Audio Editors/Recorders")
	WebElement W2Sub_AudioEditorsRecorders;

	@FindBy(linkText = "Audio Mixers/Synthesizers")
	WebElement W2Sub_AudioMixerSynthesizers;

	@FindBy(linkText = "Audio Players")
	WebElement W2Sub_AudioPlayers;

	@FindBy(linkText = "Audio Plugins")
	WebElement W2Sub_AudioPlugins;

	@FindBy(linkText = "Other AUDIO Tools")
	WebElement W2Sub_OtherAUDIOTools;

	@FindBy(linkText = "Tag Editors")
	WebElement W2Sub_TagEditors;

	// ....................................................................................................................................................................\\
	// Graphic:

	@FindBy(linkText = "Graphic:")
	WebElement WSubGraphic;

	@FindBy(linkText = "Digital Photo Tools")
	WebElement W2Sub_DigitalPhotoTools;

	@FindBy(linkText = "Graphic Capture")
	WebElement W2Sub_GraphicCapture;

	@FindBy(linkText = "Graphic Editors")
	WebElement W2Sub_GraphicEditors;

	@FindBy(linkText = "Graphic Others")
	WebElement W2Sub_GraphicOthers;

	@FindBy(linkText = "Graphic Plugins")
	WebElement W2Sub_GraphicPlugins;

	@FindBy(linkText = "Graphic Viewers")
	WebElement W2Sub_GraphicViewers;

	@FindBy(linkText = "Image Converters")
	WebElement W2Sub_ImageConverters;

	// ....................................................................................................................................................................\\

	@FindBy(linkText = "Multimedia Servers")
	WebElement W2Sub_MultimediaServers;

	// Video
	// ......................................................................................................................................................................\\
	@FindBy(linkText = "Codec Packs/ Video Codecs")
	WebElement W2Sub_CodecPacksVideoCodecs;

	@FindBy(linkText = "Encoders/Converter/DIVX Related")
	WebElement W2Sub_EncodersConverterDIVXRelated;

	@FindBy(linkText = "Other VIDEO Tools")
	WebElement W2Sub_OtherVIDEOTools;

	@FindBy(linkText = "Video Editors")
	WebElement W2Sub_VideoEditors;

	@FindBy(linkText = "Video Players")
	WebElement W2Sub_VideoPlayers;

	@FindBy(linkText = "Video Recording")
	WebElement W2Sub_VideoRecording;

	// ....................................................................................................................................................................\\

	@FindBy(linkText = "Multimedia Servers")
	WebElement WSub_MultimediaServers;

	@FindBy(linkText = "Video:")
	WebElement WSub_Video;

	@FindBy(linkText = "Network Tools")
	WebElement W_network_tools;
	// ...........................................................................................................................................................\\

	@FindBy(linkText = "Bandwidth Tools")
	WebElement WSub_BandwidthTools;

	@FindBy(linkText = "IP Tools")
	WebElement WSub_IPTools;

	@FindBy(linkText = "Misc. Networking Tools")
	WebElement WSub_MiscNetworkingTools;

	@FindBy(linkText = "Network Information")
	WebElement WSub_NetworkInformation;

	@FindBy(linkText = "Network Monitoring")
	WebElement WSub_NetworkMonitoring;

	@FindBy(linkText = "Network Testing")
	WebElement WSub_NetworkTesting;

	@FindBy(linkText = "Network Tools Suites")
	WebElement WSub_NetworkToolsSuites;

	@FindBy(linkText = "Network/IP Scanner")
	WebElement WSub_NetworkIPScanner;

	@FindBy(linkText = "Protocol Analyzers/Sniffers")
	WebElement WSub_ProtocolAnalyzersSniffers;

	@FindBy(linkText = "Telnet/SSH Clients")
	WebElement WSub_TelnetSSHClients;

	@FindBy(linkText = "Traceroute/Whois Tools")
	WebElement WSub_TracerouteWhoisTools;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------\\

	@FindBy(linkText = "Office tools")
	WebElement W_office_tools;

	// ..............................................................................................................................................................\\
	@FindBy(linkText = "Clipboard")
	WebElement WSub_Clipboard;

	@FindBy(linkText = "Diary/Organizers/Calendar")
	WebElement WSub_DiaryOrganizersCalendar;

	@FindBy(linkText = "Fax & Telephony")
	WebElement WSub_FaxTelephony;

	@FindBy(linkText = "Office suites")
	WebElement WSub_Officesuites;

	@FindBy(linkText = "Other Office Tools")
	WebElement WSub_OtherOfficeTools;

	@FindBy(linkText = "PDF")
	WebElement WSub_PDF;

	@FindBy(linkText = "Text editors")
	WebElement WSub_Texteditors;
//...................................................................................................................................................................\\
	

	
	@FindBy(linkText = "Others")
	WebElement W_others;
//.................................................................................................................................................................\\
	
	
	@FindBy(linkText ="E-Book")
	WebElement WSub_EBook;

	@FindBy(linkText = "File/CD/DVD Catalog")
	WebElement WSub_FileCDDVDCatalog;
	
	@FindBy(linkText = "Finances & Business")
	WebElement WSub_FinancesBusiness;
	
	@FindBy(linkText = "Font Utils")
	WebElement WSub_FontUtils;
	
	@FindBy(linkText = "Fun")
	WebElement WSub_Fun;
	
	@FindBy(linkText = "Home & Education")
	WebElement WSub_HomeEducation;
	
	@FindBy(linkText = "Miscellaneous")
	WebElement WSub_Miscellaneous;
	
	@FindBy(linkText = "Scheduling")
	WebElement WSub_Scheduling;
	
	@FindBy(linkText = "Signatures/Updates")
	WebElement WSub_SignaturesUpdates;
	
	@FindBy(linkText = "Unit Conversion")
	WebElement WSub_UnitConversion;
	
//..................................................................................................................................................................\\
	
	
	@FindBy(linkText = "Portable Software")
	WebElement W_portablesoftware;
	
//....................................................................................................................................................................\\
	@FindBy(linkText = "Antivirus & Antispyware")
	WebElement WSub_AntivirusAntispyware;
	
	@FindBy(linkText = "Applications suites")
	WebElement WSub_Applicationssuites;
	
	@FindBy(linkText = "Authoring Tools")
	WebElement WSub_AuthoringTools;
	
	@FindBy(linkText = "CD/DVD Tools")
	WebElement WSub_CDDVDTools;
	
	@FindBy(linkText = "Compression Tools")
	WebElement WSub_CompressionTools;
	
	@FindBy(linkText = "Database Utils")
	WebElement WSub_DatabaseUtils;
	
	@FindBy(linkText = "Education")
	WebElement WSub_Education;
	
	@FindBy(linkText = "Gaming Related")
	WebElement WSub_GamingRelated;
	
	@FindBy(linkText = "HDD Tools")
	WebElement WSub_HDDTools;
	
	@FindBy(linkText = "Internet:")
	WebElement WSub_Internet;
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\

	@FindBy(linkText = "Bookmark Managers")
	WebElement W2Sub_BookmarkManagersTools;
	
	@FindBy(linkText = "Browsers")
	WebElement W2Sub_Browsers;
	
	@FindBy(linkText = "Chat")
	WebElement W2Sub_Chat;
	
	@FindBy(linkText = "E-mail")
	WebElement W2Sub_Email;
	
	@FindBy(linkText = "FTP Client")
	WebElement W2Sub_FTPClient;
	
	@FindBy(linkText = "File Sharing")
	WebElement W2Sub_FileSharing;
	
	@FindBy(linkText = "Newsgroups / Feed / Blog Tools")
	WebElement W2Sub_NewsgroupsFeedBlogTools;
	
	
	@FindBy(linkText = "Offline Browsers")
	WebElement W2Sub_OfflineBrowsers;
	
	@FindBy(linkText = "Others")
	WebElement W2Sub_Others;
	
	@FindBy(linkText = "Servers")
	WebElement W2Sub_Servers;
	
	@FindBy(linkText = "Telnet/SSH Clients")
	WebElement W2Sub_TelnetSSHClients;
	
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\	
	
	
	@FindBy(linkText = "Mobile Phone Tools")
	WebElement WSub_MobilePhoneTools;
	
	@FindBy(linkText = "Multimedia:")
	WebElement WSub_Multimedia;
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\
	
	@FindBy(linkText = "Audio")
	WebElement W2Sub_Audio;
	
	@FindBy(linkText = "Graphics")
	WebElement W2Sub_Graphics;
	
	@FindBy(linkText = "Video")
	WebElement W2Sub_Video;

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\	

	@FindBy(linkText = "Network")
	WebElement WSub_Network;
	
	@FindBy(linkText = "Office:")
	WebElement WSub_Office;
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\
	
	@FindBy(linkText = "Calendar/Organizers")
	WebElement W2Sub_CalendarOrganizers;

	@FindBy(linkText = "Clipboard")
	WebElement W2Sub_Clipboard;

	@FindBy(linkText = "PDF")
	WebElement W2Sub_PDF;

	@FindBy(linkText = "Suites & editors")
	WebElement W2Sub_Suiteseditors;

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\
	
	
	@FindBy(linkText = "Other Portable Applications")
	WebElement WSub_OtherPortableApplications;
	
	@FindBy(linkText = "Personal Finances")
	WebElement WSub_PersonalFinances;
	
	@FindBy(linkText = "Programming")
	WebElement WSub_Programming;
	
	@FindBy(linkText = "Security:")
	WebElement WSub_Security;
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\
	
	@FindBy(linkText = "Encrypting")
	WebElement W2Sub_Encrypting;

	@FindBy(linkText = "Password Managers & Generators")
	WebElement W2Sub_PasswordManagersGenerators;

	@FindBy(linkText = "Secure cleaning")
	WebElement W2Sub_Securecleaning;

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\

	@FindBy(linkText = "System:")
	WebElement WSub_System;
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\
	@FindBy(linkText = "Backup and Recovery")
	WebElement W2Sub_BackupandRecovery;

	@FindBy(linkText = "File management")
	WebElement W2Sub_Filemanagement;

	@FindBy(linkText = "Launchers")
	WebElement W2Sub_Launchers;

	@FindBy(linkText = "System Enhancements")
	WebElement W2Sub_SystemEnhancements;

	@FindBy(linkText = "System Info")
	WebElement W2Sub_SystemInfo;
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\\
	
//........................................................................................................................................\\	
	
	@FindBy(linkText = "Programming")
	WebElement W_programming;

	@FindBy(linkText = "System")
	WebElement W_system;

	@FindBy(linkText = "Tweak")
	WebElement W_tweak;

	@FindBy(linkText = "Windows Widgets")
	WebElement W_widgets;

	// ---------------------------------------------------------------------------------------------------------\\

	public SoftwareDownloader(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	ProductsDownloadFromWebSite productdownload = new ProductsDownloadFromWebSite(driver);

	public void mainPlatformSupportProducts() throws InterruptedException {

		System.out.println("1)\t Windows");
		System.out.println("2)\t Drivers");
		System.out.println("3)\t Games");
		System.out.println("4)\t Android");
		System.out.println("5)\t Linux");

		System.out.println("please choose the software platform");
		logger.info("please choose the software platform");

		int choice_val = sc.nextInt();

		switch (choice_val) {
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
			logger.info("you opted wroung option");
			break;
		}

	}

	public void windowsOs() throws InterruptedException {
		windowsOs.click();
		windows_expand_list.click();

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

		System.out.println("All are category are above please choose anyone if you want to downloads software");
		System.out.println("plese enter the value to choose the right option?");
		logger.info("plese enter the value to choose the right option?");
		int choice_downloads = sc.nextInt();

		switch (choice_downloads) {
		case 1:
			wincategoryAntivirus();

			break;
		case 2:
			wincategoryAuthoringTools();
			break;
		case 3:
			wincategoryCDDVDBlurayTools();
			break;

		case 4:
			wincategoryCompressionTools();
			break;
		case 5:
			wincategoryDesktopEnhancements();
			break;

		case 6:
			wincategoryFilemanagers();
			break;

		case 7:
			wincategoryGamingRelated();
			break;

		case 8:
			wincategoryInternet();
			break;

		case 9:
			wincategoryiPodTools();
			break;
		case 10:
			wincategoryMapsGps();
			break;

		case 11:
			wincategoryMobilePhoneTools();
			break;

		case 12:
			wincategoryMultimedia();
			break;

		case 13:
			wincategoryNetworkTools();
			break;
			
		case 14:
			wincategoryOfficetools();
			break;
		
		case 15:
			wincategoryPortableSoftware();
			break;

		default:
			break;
		}

	}

	/**
	 * Here we are declared all the method for downloading windows platform
	 * software
	 * 
	 * @throws InterruptedException
	 * 
	 */

	@SuppressWarnings("static-access")
	private void wincategoryAntivirus() throws InterruptedException {
		// widowsdrivers.click();
		W_antivirus.click();
		int total_page = totalPages();
		System.out.println("Total page of antivirus category " + total_page);
		logger.info("Total page of antivirus category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;
			System.out.println("ONLY ONE CATEGORY ARE THERE RemovalTools ");
			logger.info("ONLY ONE CATEGORY ARE THERE RemovalTools ");

			Sub_Removaltools.click();
			logger.info("Removal category is clicked...");
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					// .//*[@id='sjmp']/div[39]/div[2]/div/a[1]
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();
					/*
					 * for (int i = 6; i <= 36; i++) {
					 * 
					 * driver.findElement(By.xpath(".//*[@id='sjmp']/div[" + i +
					 * "]/h4/a"));
					 * 
					 * }
					 */
					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}

	@SuppressWarnings("static-access")
	private void wincategoryAuthoringTools() throws InterruptedException {

		W_authoringtools.click();
		int total_page = totalPages();
		System.out.println("Total page of authoring tools category " + total_page);
		logger.info("Total page of authoring tools category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t Authoring Related");
			System.out.println("1\t Business Cards");
			System.out.println("2\t Cover editors");
			System.out.println("3\t Digital Album");
			System.out.println("4\t Help & e-book creators");
			System.out.println("5\t Screensaver Tools");
			System.out.println("6\t Setup creators");
			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			// System.out.println("ONLY ONE CATEGORY ARE THERE RemovalTools ");
			// logger.info("ONLY ONE CATEGORY ARE THERE RemovalTools ");
			WebElement[] list_elements = { Sub_authoringrelated, Sub_businesscards, Sub_covereditors, Sub_digitalalbum,
					Sub_Helpebookcreators, Sub_ScreensaverTools, Sub_Setupcreators };
			list_elements[sub_auth_tools].click();

			// Sub_Removaltools.click();
			logger.info("Removal category is clicked...");
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					// .//*[@id='sjmp']/div[39]/div[2]/div/a[1]
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();
					/*
					 * for (int i = 6; i <= 36; i++) {
					 * 
					 * driver.findElement(By.xpath(".//*[@id='sjmp']/div[" + i +
					 * "]/h4/a"));
					 * 
					 * }
					 */
					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}

	}

	@SuppressWarnings({ "unused", "static-access" })
	private void wincategoryCDDVDBlurayTools() throws InterruptedException {
		W_authoringtools.click();
		int total_page = totalPages();
		System.out.println("Total page of CDDVDBlurays tools category " + total_page);
		logger.info("Total page of DDVDBlurays tools category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t Audio CD/DVD Burning");
			System.out.println("1\t AutoRun Builders");
			System.out.println("2\t CD/DVD Images Utils");
			System.out.println("3\t CD/DVD Rip/Other Tools");
			System.out.println("4\t Data CD/DVD Burning");
			System.out.println("5\t Virtual CD/DVD-Rom");
			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			// System.out.println("ONLY ONE CATEGORY ARE THERE RemovalTools ");
			// logger.info("ONLY ONE CATEGORY ARE THERE RemovalTools ");
			WebElement[] list_elements = { Sub_AudioCDDVDBurning, Sub_AutoRunBuilders, Sub_CDDVDImagesUtils,
					Sub_CDDVDRipOtherToolss, Sub_DataCDDVDBurning, Sub_VirtualCDDVDRom, };
			list_elements[sub_auth_tools].click();

			// Sub_Removaltools.click();
			// logger.info("Removal category is clicked...");
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					// .//*[@id='sjmp']/div[39]/div[2]/div/a[1]
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}

	}

	@SuppressWarnings("static-access")
	private void wincategoryCompressionTools() throws InterruptedException {
		W_compression_tools.click();
		int total_page = totalPages();
		System.out.println("Total page of compression tools category " + total_page);
		logger.info("Total page of compression tools category " + total_page);

		System.out.println("there is one way to downloads choose  any page without specific subcategory");
		logger.info("there is one way to downloads choose  any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 1) {
			char choice = 0;
			int cur_page = 0;
			System.out.println("ONLY ONE CATEGORY ARE THERE RemovalTools ");
			logger.info("ONLY ONE CATEGORY ARE THERE RemovalTools ");

			if (total_page >= 9) {
				System.out.println("total page of this category " + total_page);
				logger.info("total page of this category " + total_page);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_page);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_page);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_page) {
					System.out.println("you are on this page " + cur_page);
					// .//*[@id='sjmp']/div[39]/div[2]/div/a[1]
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}

	@SuppressWarnings("static-access")
	private void wincategoryDesktopEnhancements() throws InterruptedException {
		W_desktop_enhancement.click();
		int total_page = totalPages();
		System.out.println("Total page of DesktopEnhancements category " + total_page);
		logger.info("Total page of DesktopEnhancements category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t Clocks & Time Management");
			System.out.println("1\t Icon Collections");
			System.out.println("2\t Icons Related");
			System.out.println("3\t Other Desktop Enhancements");
			System.out.println("4\t Screensavers");
			System.out.println("5\t Shell Replacements");
			System.out.println("6\t Themes");

			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			// System.out.println("ONLY ONE CATEGORY ARE THERE RemovalTools ");
			// logger.info("ONLY ONE CATEGORY ARE THERE RemovalTools ");
			WebElement[] list_elements = { Sub_ClockTimeManagement, Sub_IconCollections, Sub_IconsRelated,
					Sub_OtherDesktopEnhancements, Sub_Screensavers, Sub_ShellReplacements, Sub_Themes };
			list_elements[sub_auth_tools].click();

			// Sub_Removaltools.click();
			// logger.info("Removal category is clicked...");
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}

	@SuppressWarnings("static-access")
	private void wincategoryFilemanagers() throws InterruptedException {
		W_file_manages.click();
		int total_page = totalPages();
		System.out.println("Total page of Filemanagers category " + total_page);
		logger.info("Total page of Filemanagers category " + total_page);

		System.out.println("there is one way to downloads choose  any page without specific subcategory");
		logger.info("there is one way to downloads choose  any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 1) {
			char choice = 0;
			int cur_page = 0;

			if (total_page >= 9) {
				System.out.println("total page of this category " + total_page);
				logger.info("total page of this category " + total_page);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_page);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_page);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_page) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}

	}

	@SuppressWarnings("static-access")
	private void wincategoryGamingRelated() throws InterruptedException {
		W_gaming_releted.click();
		int total_page = totalPages();
		System.out.println("Total page of GamingRelated category " + total_page);
		logger.info("Total page of GamingRelated category " + total_page);

		System.out.println("there is one way to downloads choose  any page without specific subcategory");
		logger.info("there is one way to downloads choose  any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 1) {
			char choice = 0;
			int cur_page = 0;

			if (total_page >= 9) {
				System.out.println("total page of this category " + total_page);
				logger.info("total page of this category " + total_page);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_page);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_page);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_page) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}

	}

	@SuppressWarnings("static-access")
	private void wincategoryInternet() throws InterruptedException {

		W_internet.click();
		int total_page = totalPages();
		System.out.println("Total page ofInternet category " + total_page);
		logger.info("Total page of Internet category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t Multimedia IPOD tools");
			System.out.println("1\t Office IPOD tools");
			System.out.println("2\t Other IPOD tools/Updates");
			System.out.println("3\t Download Managers");
			System.out.println("4\t Podcast");
			System.out.println("5\t FTP Clients");
			System.out.println("6\t File Sharing");

			System.out.println("7\t Internet Applications Addons:");
			System.out.println("8\t Internet Radio/TV Player");
			System.out.println("9\t News / Newsgroups /Blog Tools");
			System.out.println("10\t Offline Browsers");
			System.out.println("11\t Other Internet Related");
			System.out.println("12\t Popup / Ad / Spyware Blockers");
			System.out.println("13\t Remote Utils");
			System.out.println("14\t Search engine tools/submiting");
			System.out.println("15\t Secure Browsing / VPN");
			System.out.println("16\t Servers:");
			System.out.println("17\t Streaming");
			System.out.println("18\t Telephony / SMS & GSM");
			System.out.println("19\t WEB Design:");
			System.out.println("20\t Weather@Home");
			System.out.println("21\t WebCam");

			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			WebElement[] list_elements = { Sub_BookmarkManager, Sub_Browsers, Sub_Chat, Sub_DownloadManagers, Sub_Email,
					Sub_FTPClients, Sub_FileSharing, Sub_InternetApplicationsAddons, Sub_InternetRadioTVPlayer,
					Sub_NewsNewsgroupsBlogTools, Sub_OfflineBrowsers, Sub_OtherInternetRelated,
					Sub_PopupAdSpywareBlockers, Sub_RemoteUtils, Sub_Searchenginetoolssubmiting, Sub_SecureBrowsingVPN,
					Sub_Servers, Sub_Streaming, Sub_TelephonySMSGSM, Sub_WEBDesign, Sub_WeatherHome, Sub_WebCam };

			list_elements[sub_auth_tools].click();
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}

	@SuppressWarnings("static-access")
	private void wincategoryiPodTools() throws InterruptedException {
		W_ipod_tools.click();
		int total_page = totalPages();
		System.out.println("Total page of iPodTools category " + total_page);
		logger.info("Total page of iPodTools category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t Multimedia IPOD tools");
			System.out.println("1\t Office IPOD tools");
			System.out.println("2\t Other IPOD tools/Updates");
			System.out.println("3\t Podcast");

			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			WebElement[] list_elements = { Sub_MultimediaIPODtools, Sub_OfficeIPODtools, Sub_OtherIPODtoolsUpdates,
					Sub_Podcast };
			list_elements[sub_auth_tools].click();
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}

	}

	@SuppressWarnings({ "static-access", "unused" })
	private void wincategoryMapsGps() throws InterruptedException {
		W_maps_gps.click();
		int total_page = totalPages();
		System.out.println("Total page of MapsGps category " + total_page);
		logger.info("Total page of MapsGps category " + total_page);

		System.out.println("there is one way to downloads choose  any page without specific subcategory");
		logger.info("there is one way to downloads choose  any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 1) {
			char choice = 0;
			int cur_page = 0;

			if (total_page >= 9) {
				System.out.println("total page of this category " + total_page);
				logger.info("total page of this category " + total_page);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			}

			else if (total_page == 0) {
				cur_page = 0;
				System.out.println("You are set on page zero");
			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_page);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_page);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_page) {
					System.out.println("you are on this page " + cur_page);
					// driver.findElement(By.xpath("//a[text()='" + cur_page +
					// "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}

	}

	@SuppressWarnings("static-access")
	private void wincategoryMobilePhoneTools() throws InterruptedException {
		W_mobile_phone.click();
		int total_page = totalPages();
		System.out.println("Total page of MobilePhoneTools category " + total_page);
		logger.info("Total page of MobilePhoneTools category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t IPhone");
			System.out.println("1\t Nokia");
			System.out.println("2\t Others");
			System.out.println("3\t Siemens");
			System.out.println("4\t Sony Ericsson");
			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			WebElement[] list_elements = { Sub_IPhone, Sub_Nokia, Sub_Others, Sub_Siemens, Sub_SonyEricsson };
			list_elements[sub_auth_tools].click();
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}

	@SuppressWarnings("static-access")
	private void wincategoryMultimedia() throws InterruptedException {
		W_multimedia.click();
		int total_page = totalPages();
		System.out.println("Total page of Multimedia category " + total_page);
		logger.info("Total page of Multimedia category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("In Multimedia having four category");
			System.out.println("Please choose any one category");
			System.out.println("1\t Audio");
			System.out.println("2\t Graphic");
			System.out.println("3\t Multimedia Servers");
			System.out.println("4\t Video");
			int choose_category = sc.nextInt();

			switch (choose_category) {
			case 1:
				System.out.println("This is the Audio subcategory ");
				System.out.println("0\t Audio CD Rippers & Encoders");
				System.out.println("1\t Audio Codecs");
				System.out.println("2\t Audio Converters");
				System.out.println("3\t Audio Editors/Recorders");
				System.out.println("4\t Audio Mixers/Synthesizers");

				System.out.println("5\t Audio Players");
				System.out.println("6\t Audio Plugins");
				System.out.println("7\t Other AUDIO Tools");
				System.out.println("8\t Tag Editors");

				System.out.println("please choose the subcategory ");
				int sub_auth_tools = sc.nextInt();
				WebElement[] list_elements = { W2Sub_AudioCDRippersEncoders, W2Sub_AudioCodecs, W2Sub_AudioConverters,
						W2Sub_AudioEditorsRecorders, W2Sub_AudioMixerSynthesizers, W2Sub_AudioPlayers,
						W2Sub_AudioPlugins, W2Sub_OtherAUDIOTools, W2Sub_TagEditors };
				audiotoggle_btn.click();
				list_elements[sub_auth_tools].click();

				break;

			case 2:

				System.out.println("This is the Graphics subcategory ");
				System.out.println("0\t Digital Photo Tools");
				System.out.println("1\t Graphic Capture");
				System.out.println("2\t Graphic Editors");
				System.out.println("3\t Graphic Others");
				System.out.println("4\t Graphic Plugins");
				System.out.println("5\t Graphic Viewers");
				System.out.println("6\t Image Converters");

				System.out.println("please choose the subcategory ");
				int sub_auth_tools2 = sc.nextInt();
				WebElement[] list_elements2 = { W2Sub_DigitalPhotoTools, W2Sub_GraphicCapture, W2Sub_GraphicEditors,
						W2Sub_GraphicOthers, W2Sub_GraphicPlugins, W2Sub_GraphicViewers, W2Sub_ImageConverters };
				list_elements2[sub_auth_tools2].click();

				break;

			case 3:
				System.out.println("This is the Multimedia Servers category ");
				W2Sub_MultimediaServers.click();
				break;

			case 4:
				System.out.println("This is the Vedio subcategory ");
				System.out.println("0\t Codec Packs/ Video Codecs");
				System.out.println("1\t Encoders/Converter/DIVX Related");
				System.out.println("2\t Other VIDEO Tools");
				System.out.println("3\t Video Editors");
				System.out.println("4\t Video Players");
				System.out.println("5\t Video Recording");
				System.out.println("6\t Image Converters");

				System.out.println("please choose the subcategory ");
				int sub_auth_tools4 = sc.nextInt();
				WebElement[] list_elements4 = { W2Sub_CodecPacksVideoCodecs, W2Sub_EncodersConverterDIVXRelated,
						W2Sub_OtherVIDEOTools, W2Sub_VideoEditors, W2Sub_VideoPlayers, W2Sub_VideoPlayers,
						W2Sub_VideoRecording, W2Sub_ImageConverters };
				list_elements4[sub_auth_tools4].click();

				break;

			default:
				break;

			}

			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}

	@SuppressWarnings("static-access")
	private void wincategoryNetworkTools() throws InterruptedException {
		W_network_tools.click();
		int total_page = totalPages();
		System.out.println("Total page of NetworkTools category " + total_page);
		logger.info("Total page of NetworkTools category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t Bandwidth Tools");
			System.out.println("1\t IP Tools");
			System.out.println("2\t Misc. Networking Tools");
			System.out.println("4\t Network Information");
			System.out.println("5\t Network Monitoring");
			System.out.println("6\t Network Testing");
			System.out.println("7\t Network Tools Suites");
			System.out.println("8\t Network/IP Scanner");
			System.out.println("9\t Protocol Analyzers/Sniffers");
			System.out.println("10\t Telnet/SSH Clients");
			System.out.println("11\t Traceroute/Whois Tools");

			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			WebElement[] list_elements = { WSub_BandwidthTools, WSub_IPTools, WSub_MiscNetworkingTools,
					WSub_NetworkInformation, WSub_NetworkMonitoring, WSub_NetworkTesting, WSub_NetworkToolsSuites,
					WSub_NetworkIPScanner, WSub_ProtocolAnalyzersSniffers, WSub_TelnetSSHClients,
					WSub_TracerouteWhoisTools };
			list_elements[sub_auth_tools].click();
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}

	}

	@SuppressWarnings({ "unused", "static-access" })
	private void wincategoryOfficetools() throws InterruptedException {
		W_office_tools.click();
		int total_page = totalPages();
		System.out.println("Total page of Officetools category " + total_page);
		logger.info("Total page of Officetools category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t Clipboard");
			System.out.println("1\t Diary/Organizers/Calendar");
			System.out.println("2\t Fax & Telephony");
			System.out.println("4\t Office suites");
			System.out.println("5\t Other Office Tools");
			System.out.println("6\t PDF");
			System.out.println("7\t Text editors");
			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			WebElement[] list_elements = { WSub_Clipboard, WSub_DiaryOrganizersCalendar, WSub_FaxTelephony,
					WSub_Officesuites, WSub_OtherOfficeTools, WSub_PDF, WSub_Texteditors };

			list_elements[sub_auth_tools].click();
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}
	
	@SuppressWarnings("static-access")
	private void wincategoryOthers() throws InterruptedException

	{
		W_others.click();
		int total_page = totalPages();
		System.out.println("Total page of Others category " + total_page);
		logger.info("Total page of Others category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("0\t E-Book");
			System.out.println("1\t File/CD/DVD Catalog");
			System.out.println("2\t Finances & Business");
			System.out.println("4\t Font Utils");
			System.out.println("5\t Fun");
			System.out.println("6\t Home & Education");
			System.out.println("7\t Miscellaneous");	
			System.out.println("8\t Scheduling");
			System.out.println("9\t Signatures/Updates");
			System.out.println("10\t Unit Conversion");
			
			System.out.println("please choose the subcategory ");
			int sub_auth_tools = sc.nextInt();
			WebElement[] list_elements = {WSub_EBook, WSub_FileCDDVDCatalog, WSub_FinancesBusiness, WSub_FontUtils, WSub_Fun, WSub_HomeEducation,
					WSub_Miscellaneous, WSub_Scheduling, WSub_SignaturesUpdates, WSub_UnitConversion};

			list_elements[sub_auth_tools].click();
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}

	@SuppressWarnings("static-access")
	private void wincategoryPortableSoftware() throws InterruptedException
	{
		W_portablesoftware.click();
		int total_page = totalPages();
		System.out.println("Total page of Portable Software category " + total_page);
		logger.info("Total page of Portable Software category " + total_page);

		System.out.println(
				"there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");
		logger.info("there is two way to downloads 1) subcetory or other 2) any page without specific subcategory");

		System.out.println("If you want to downlaod, please choose the page number in range 1 to " + total_page);
		// 0==subcategory and 1=any page without subcategory
		logger.info("If you want to downlaod, please choose the page number in range 1 to " + total_page);

		System.out.println("Please enter the option for");
		logger.info("Please enter the option for");
		System.out.println("0\t By Subcategory option ");
		System.out.println("1\t By only pages without subcategory ");

		int sub_category = sc.nextInt();
		logger.info("you choosed the option " + sub_category);

		if (sub_category == 0) {
			char choice = 0;
			int cur_page = 0;

			System.out.println("In Multimedia having 19 category");
			System.out.println("1\t Antivirus & Antispyware");
			System.out.println("2\t Applications suites");
			System.out.println("3\t Authoring Tools");
			System.out.println("4\t CD/DVD Tools");
			System.out.println("5\t Compression Tools");
			System.out.println("6\t Database Utils");
			System.out.println("7\t Education");
			System.out.println("8\t Gaming Related");
			System.out.println("9\t HDD Tools");
			System.out.println("10\t Internet:");
			System.out.println("11\t Mobile Phone Tools");
			System.out.println("12\t Multimedia:");
			System.out.println("13\t Network");
			System.out.println("14\t Office:");
			System.out.println("15\t Other Portable Applications");
			System.out.println("16\t Personal Finances");
			System.out.println("17\t Programming");
			System.out.println("18\t Security:");
			System.out.println("19\t System:");
			int choose_category = sc.nextInt();
            
			if(choose_category==10 || choose_category==14 || choose_category==12 || choose_category==18 || choose_category==19)
			{
				switch (choose_category) {
				case 10:
					System.out.println("This is the Internet subcategory ");
					System.out.println("0\t Bookmark Managers");
					System.out.println("1\t Browsers");
					System.out.println("2\t Chat");
					System.out.println("3\t E-mail");
					System.out.println("4\t FTP Clients");
					System.out.println("5\t File Sharing");
					System.out.println("6\t Newsgroups / Feed / Blog Tools");
					System.out.println("7\t Offline Browsers");
					System.out.println("8\t Others");
					System.out.println("9\t Servers");
					System.out.println("10\t Telnet/SSH Clients");

					System.out.println("please choose the subcategory ");
					int sub_auth_tools = sc.nextInt();
					WebElement[] list_elements = { W2Sub_AudioCDRippersEncoders, W2Sub_AudioCodecs, W2Sub_AudioConverters,
							W2Sub_AudioEditorsRecorders, W2Sub_AudioMixerSynthesizers, W2Sub_AudioPlayers,
							W2Sub_AudioPlugins, W2Sub_OtherAUDIOTools, W2Sub_TagEditors };
					audiotoggle_btn.click();
					list_elements[sub_auth_tools].click();

					break;

				case 12:

					System.out.println("This is the Multimedia subcategory ");
					System.out.println("0\t Audio");
					System.out.println("1\t Graphics");
					System.out.println("2\t Video");

					System.out.println("please choose the subcategory ");
					int sub_auth_tools2 = sc.nextInt();
					WebElement[] list_elements2 = { W2Sub_DigitalPhotoTools, W2Sub_GraphicCapture, W2Sub_GraphicEditors,
							W2Sub_GraphicOthers, W2Sub_GraphicPlugins, W2Sub_GraphicViewers, W2Sub_ImageConverters };
					list_elements2[sub_auth_tools2].click();

					break;

				case 14:
					System.out.println("This is the Office  subcategory ");
					System.out.println("0\t Calendar/Organizers");
					System.out.println("1\t Clipboard");
					System.out.println("2\t PDF");
					System.out.println("3\t Suites & editors");
					break;

				case 18:
					System.out.println("This is the Security subcategory ");
					System.out.println("0\t Encrypting");	
					System.out.println("1\t Password Managers & Generators");
					System.out.println("2\t Secure cleaning");

					System.out.println("please choose the subcategory ");
					int sub_auth_tools4 = sc.nextInt();
					WebElement[] list_elements4 = { W2Sub_CodecPacksVideoCodecs, W2Sub_EncodersConverterDIVXRelated,
							W2Sub_OtherVIDEOTools, W2Sub_VideoEditors, W2Sub_VideoPlayers, W2Sub_VideoPlayers,
							W2Sub_VideoRecording, W2Sub_ImageConverters };
					list_elements4[sub_auth_tools4].click();

					break;
				case 19:
					System.out.println("This is the System subcategory ");
					
					System.out.println("0\t Backup and Recovery");
					System.out.println("1\t File management");
					System.out.println("2\t Launchers");
					System.out.println("3\t System Enhancements");
					System.out.println("4\t System Info");
					
					break;
				default:
					break;

				}
		
				
			}
			
			WebElement all_elements[]={};
			
		
			int total_pages = totalPages();
			logger.info("total page of this category  " + total_pages);

			if (total_pages % 30 == 0) {
				System.out.println("page items number is in multiple of 30");
			} else {
				System.out.println("page is not multiple of 30");
			}

			if (total_pages >= 9) {
				System.out.println("total page of this category " + total_pages);
				logger.info("total page of this category " + total_pages);
				System.out.println(
						"please download the page number between 1 to 9 , this is only for visiable first 9 pages ,after reaching 9th page you can go for a ahead like {10-17} etc ");
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);

			} else {
				// System.out.println("please download the page number betwe");

				System.out.println(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				logger.info(
						"please choose the page no if you want to download from in range ( " + 1 + " - " + total_pages);
				cur_page = sc.nextInt();
				System.out.println("you entered the page number " + cur_page);
				logger.info("you entered the page number " + cur_page);
			}

			int more_page = 0;
			boolean flg = false;

			do {
				if (flg == true) {
					System.out.println("please enter the page number you want to download more");
					more_page = sc.nextInt();
					logger.info("you entered the more page number " + more_page);
					cur_page = more_page;
				}

				if (cur_page <= total_pages) {
					System.out.println("you are on this page " + cur_page);
					driver.findElement(By.xpath("//a[text()='" + cur_page + "']")).click();

					productdownload.donwloadingSoftware();
					System.out.println(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					logger.info(
							"Do you want to download to more page please type continue(y/Y) or else type anything..to stop");
					choice = sc.next().charAt(0);
					logger.info("you entered the choice is " + choice);
					if (choice == 'y' || choice == 'Y') {
						flg = true;
					}

				} else {
					System.out.println("You choose page number is out of bound range...oops we are exiting.");
					System.exit(0);
				}
			} while (choice == 'y' || choice == 'Y');

		}
	}
	
	/**
	 * collect total pages
	 * 
	 * @return
	 */
	public int totalPages() {
		String item_number = driver.findElement(By.xpath("//span[contains(@title,'items total in this')]")).getText();
		String extract_item = item_number.replaceAll("[\\[\\](){}[items]]", "").trim();
		int total_items = Integer.parseInt(extract_item);
		int total_page = (total_items / 30);
		// System.out.println("Total page of antivirus category " +total_page);
		return total_page;
	}

	public void drivers() {

	}

	public void games() {
		games.click();
	}

	public void android() {
		android.click();
	}

	public void linux() {
		linux.click();
	}

}
