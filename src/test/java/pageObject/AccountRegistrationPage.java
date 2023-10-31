package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	
	WebDriver Ldriver;
	
	public AccountRegistrationPage(WebDriver Gdriver) {
		
		Ldriver=Gdriver;
		
		PageFactory.initElements(Gdriver,this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@class='d-none d-md-inline'][contains(.,'My Account')]")
	
	public static WebElement lnkMyAccount;
	
	@FindBy(xpath="(//a[contains(.,'Register')])[1]")
	
	public static WebElement lnkRegister;
	
	@FindBy(xpath = "//a[contains(.,'Login')]")
	
	public static WebElement Login;
	
	@FindBy(xpath="//input[@name='firstname']")
	
	public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	
	public static WebElement lstname;
	
	@FindBy(xpath="//input[@id='input-email']")
	
	public static WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	
	public static WebElement pwd;
	
	@FindBy(xpath="//input[@ id='input-newsletter-yes' ]")
	
	public static WebElement rbutton;
	
	@FindBy(xpath="//input[@name='agree']")
	
	public static WebElement chkbox;
	
	@FindBy(xpath="//button[@type='submit']")
	
	public static WebElement btn;
	
	public void clickMyAccount() 
	{
		lnkMyAccount.click();	
	}
	
	public void click_login()
	{
		Login.click();
	}
	public void clickregister() 
	{
		lnkRegister.click();
	
	}
	
	public void Setfirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void Setlstname(String lname)
	{
		lstname.sendKeys(lname);
	}
	
	public void Setemail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void Setpwd(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void checkbox()
	{
		rbutton.click();
	}
	public void setprivacypolicy()
	{
		chkbox.click();
	}
	
	public void clickcontinue()
	{
		btn.click();
	}
	
	
	
}
