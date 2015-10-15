package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Log;



public class FAQ_Page {
	
	WebDriver driver;
	private static final long TIMEOUT = 12000;
	//private static Logger Log = Logger.getLogger(FAQ_Page.class.getName());
	
	@FindBy(xpath=".//*[@id='layout_7']/a/span")
	public WebElement link_FAQ;
	
	@FindBy(id="_miiqueryfaq_WAR_MIIUbiqueportlet_INSTANCE_A4GwGa0sNDF9_question")
	public WebElement search_TextBox;
	
	@FindBy(id="ansButton")
	public WebElement search_Button;
	
	public FAQ_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFAQLink() throws InterruptedException
	{
		link_FAQ.click();
		Thread.sleep(200);
		Log.info("Clicking on FAQ link");
		Log.info("We are now on the Faq page");
		
	}
	
	public void clickSearchTextBox() throws InterruptedException
	{
		search_TextBox.click();
		Log.info("Clicking on Search Textbox");
		search_TextBox.sendKeys("What is visa");
		Log.info("Entering the data in the Search Textbox");
		Thread.sleep(200);
	}
	
	public void clickSearchButton() throws InterruptedException
	{
		search_Button.click();
		Thread.sleep(200);
		Log.info("Clicking on the Search Button");
	}
	
	public void eventsOnFAQPage() throws InterruptedException
	{
		this.clickFAQLink();
		this.clickSearchTextBox();
		Thread.sleep(1000);
		this.clickSearchButton();
		Thread.sleep(TIMEOUT);
	}
}


