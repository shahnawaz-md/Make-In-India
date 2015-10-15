package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utils.Log;

public class Query_Page {
	
	WebDriver driver;
	private static final long TIMEOUT = 12000;
	//private static Logger Log = Logger.getLogger(FAQ_Page.class.getName());
	
	@FindBy(xpath=".//*[@id='layout_7']/a/span")
	public WebElement link_FAQ;
	
	@FindBy(xpath=".//*[@id='faq_instr']/ul/li[3]/a")
	public WebElement link_ClickHere;
	
	@FindBy(id="_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_First_Name")
	public WebElement txtbx_FirstName ;
	
	@FindBy(id="_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_Last_Name")
	public WebElement txtbx_LastName;
	
	@FindBy(id="_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_Mail_Id")
	public WebElement txtbx_Email;
	
	@FindBy(id="_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_phone")
	public WebElement txtbx_ContactNumber;
	
	@FindBy(id="_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_Question")
	public WebElement txtbx_QueryTitle;
	
	@FindBy(id="_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_sectors")
	public WebElement select_Sectors;
	
	@FindBy(id="_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_country")
	public WebElement select_Country;
	
	@FindBy(id="_miiquerysubmission_WAR_MIIUbiqueportlet_INSTANCE_U02ozVb8o4w2_Feedback")
	public WebElement enter_QueryDetail;
	
	@FindBy(id="submit_btn")
	public WebElement click_SubmitButton;
	
	public Query_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFAQLink() throws InterruptedException
	{
		link_FAQ.click();
		Thread.sleep(200);
		Log.info("Clicking on FAQ link");
	}
	
	public void clickQueryPageLink() throws InterruptedException
	{
		link_ClickHere.click();
		Thread.sleep(200);
		Log.info("Clicking on Query Form link");
		Log.info("We are now on the Query Form Page");
	}
	
	public void enterFirstName() throws InterruptedException
	{
		txtbx_FirstName.sendKeys("Shahnawaz");
		Thread.sleep(200);
		Log.info("Entering the First Name");
	}
	
	public void enterLastName() throws InterruptedException
	{
		txtbx_LastName.sendKeys("Md");
		Thread.sleep(200);
		Log.info("Entering the Last Name");
	}
	
	public void enterEmailId() throws InterruptedException
	{
		txtbx_Email.sendKeys("shaan@gmail.com");
		Thread.sleep(200);
		Log.info("Entering the Email Id");
	}
	
	public void enterContactNumber() throws InterruptedException
	{
		txtbx_ContactNumber.sendKeys("8825698741");
		Thread.sleep(200);
		Log.info("Entering the Contact Number");
	}
	
	public void enterQueryTitle() throws InterruptedException
	{
		txtbx_QueryTitle.sendKeys("Test test");
		Thread.sleep(200);
		Log.info("Entering the Query Title");
	}
	
	public void selectSectors() throws InterruptedException
	{
		Select sector = new Select(select_Sectors);
		sector.selectByValue("AVIATION");
		Thread.sleep(200);
		Log.info("Selecting the Sectors");
	}
	
	public void selectCountry() throws InterruptedException
	{
		Select country = new Select(select_Country);
		country.selectByValue("IE");
		Thread.sleep(200);
		Log.info("Selecting the Country");
	}
	
	public void enterQueryDetail() throws InterruptedException
	{
		enter_QueryDetail.sendKeys("This is for testing purpose");
		Thread.sleep(200);
		Log.info("Entering the Query Details");
	}
	
	public void clickSubmitButton() throws InterruptedException
	{
		click_SubmitButton.click();
		Thread.sleep(200);
		Log.info("Clicking on Submit Button");
	}
	
	public void eventsOnQueryPage() throws InterruptedException
	{
		/*this.clickFAQLink();
		Thread.sleep(1000);*/
		this.clickQueryPageLink();
		Thread.sleep(1000);
		this.enterFirstName();
		Thread.sleep(1000);
		this.enterLastName();
		Thread.sleep(1000);
		this.enterEmailId();
		Thread.sleep(1000);
		this.enterContactNumber();
		Thread.sleep(1000);
		this.enterQueryTitle();
		Thread.sleep(1000);
		this.selectSectors();
		Thread.sleep(1000);
		this.selectCountry();
		Thread.sleep(1000);
		this.enterQueryDetail();
		Thread.sleep(1000);
		this.clickSubmitButton();
		Thread.sleep(TIMEOUT);
	}
}