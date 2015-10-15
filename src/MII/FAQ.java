package MII;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageFactory.FAQ_Page;
import PageFactory.Query_Page;
import PageFactory.Site_Feedback_Page;
import Utils.Log;


public class FAQ {
	
	WebDriver driver;
	private static final long TIMEOUT = 12000;
	//private static Logger Log = Logger.getLogger(FAQ.class.getName());
	
	FAQ_Page objFaq;
	Query_Page objQuery;
	Site_Feedback_Page objSiteFeedBack;
	
	@BeforeClass
	
	public void browser() {
		DOMConfigurator.configure("Log4j.xml");
		Log.startTestCase("sTestCaseName");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahnawaz\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		Log.info("New driver instantiated");
		//driver = new FirefoxDriver();	
		driver.get("http://192.168.10.171:8080");
		Log.info("Web application launched");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 Log.info("Implicit wait applied on the driver");
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	
	public void close() {
		
		driver.close();
		driver.quit();
		Log.info("Browser closed");
		Log.endTestCase("THIS IS AN END");
	}
	
	@Test
	public void MakeinIndia() throws InterruptedException {
		
		
		
		objFaq = new FAQ_Page(driver);
		objFaq.eventsOnFAQPage();
		Thread.sleep(TIMEOUT);
		Log.info("Events performed on the FAQ page");
		
		objQuery = new Query_Page(driver);
		objQuery.eventsOnQueryPage();
		Thread.sleep(TIMEOUT);
		Log.info("Events performed on the Query Form");
		
		objSiteFeedBack = new Site_Feedback_Page(driver);
		objSiteFeedBack.eventsOnSiteFeedBackPage();
		Thread.sleep(TIMEOUT);
		Log.info("Events performed on the Site Feed Back Page");
		
	
	}
}
