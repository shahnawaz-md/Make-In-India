package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Log;

public class Site_Feedback_Page {
	
	WebDriver driver;
	private static final long TIMEOUT = 12000;
	
	@FindBy(xpath=".//*[@id='footerColumns']/li[5]/a")
	public WebElement link_SiteFeedback;
	
	@FindBy(id="_miifeedback_WAR_MIIUbiqueportlet_INSTANCE_EZrTdn3TMvty_First_Name")
	public WebElement txtbx_FirstName;
	
	@FindBy(id="_miifeedback_WAR_MIIUbiqueportlet_INSTANCE_EZrTdn3TMvty_Last_Name")
	public WebElement txtbx_LastName;
	
	@FindBy(id="_miifeedback_WAR_MIIUbiqueportlet_INSTANCE_EZrTdn3TMvty_Mail_Id")
	public WebElement txtbx_Email;
	
	@FindBy(id="_miifeedback_WAR_MIIUbiqueportlet_INSTANCE_EZrTdn3TMvty_phone")
	public WebElement txtbx_ContactNumber;
	
	@FindBy(id="_miifeedback_WAR_MIIUbiqueportlet_INSTANCE_EZrTdn3TMvty_Subject")
	public WebElement txtbx_Subject;
	
	@FindBy(id="_miifeedback_WAR_MIIUbiqueportlet_INSTANCE_EZrTdn3TMvty_Feedback")
	public WebElement txtbx_Feedback;
	
	@FindBy(id="submit_btn")
	public WebElement btn_Submit;
	
	public Site_Feedback_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSiteFeedbackLink() throws InterruptedException
	{
		link_SiteFeedback.click();
		Thread.sleep(200);
		Log.info("Clicking on Site FeedBack link");
		Log.info("We are now on Site Feed Back Page");
	}
	
	public void enterFirstName() throws InterruptedException
	{
		txtbx_FirstName.sendKeys("Test");
		Thread.sleep(200);
		Log.info("Entering the First Name");
	}
	
	public void enterLastName() throws InterruptedException
	{
		txtbx_LastName.sendKeys("Test");
		Thread.sleep(200);
		Log.info("Entering the Last Name");
	}
	
	public void enterEmailId() throws InterruptedException
	{
		txtbx_Email.sendKeys("abctest@gmail.com");
		Thread.sleep(200);
		Log.info("Entering the Email Id");
	}
	
	public void enterContactNumber() throws InterruptedException
	{
		txtbx_ContactNumber.sendKeys("8820596321");
		Thread.sleep(200);
		Log.info("Entering the Contact Number");
	}
	
	public void enterSubject() throws InterruptedException
	{
		txtbx_Subject.sendKeys("Testing");
		Thread.sleep(200);
		Log.info("Entering the Subject");
	}
	
	public void enterFeedback() throws InterruptedException
	{
		txtbx_Feedback.sendKeys("This is for testing purpose");
		Thread.sleep(200);
		Log.info("Entering the Feed Back");
	}
	
	public void clickSubmitButton() throws InterruptedException
	{
		btn_Submit.click();
		Thread.sleep(200);
		Log.info("Clicking the Submit Button");
	}
	
	public void eventsOnSiteFeedBackPage() throws InterruptedException
	{
		this.clickSiteFeedbackLink();
		Thread.sleep(2000);
		this.enterFirstName();
		Thread.sleep(2000);
		this.enterLastName();
		Thread.sleep(2000);
		this.enterEmailId();
		Thread.sleep(2000);
		this.enterContactNumber();
		Thread.sleep(2000);
		this.enterSubject();
		Thread.sleep(2000);
		this.enterFeedback();
		Thread.sleep(2000);
		this.clickSubmitButton();
		Thread.sleep(TIMEOUT);
	}

}
