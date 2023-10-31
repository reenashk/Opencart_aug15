package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		WebDriver Ldriver;
	public LoginPage(WebDriver Gdriver) {
		
		Ldriver=Gdriver;
		
		PageFactory.initElements(Gdriver,this);
	}
	@FindBy(xpath = "//span[@class='d-none d-md-inline'][contains(.,'My Account')]")
	
	public static WebElement lnkMyAccount;
	
	@FindBy(xpath="(//a[contains(.,'Register')])[1]")
	
	public static WebElement lnkRegister;
	
	@FindBy(xpath = "//a[contains(.,'Login')]")
	
	public static WebElement Login;
	
	@FindBy(xpath = "//input[@name='email']")
	
	public static WebElement email;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	
	public static WebElement psswd;
	
	@FindBy(xpath = "//button[@type='submit']")
	 
	public static WebElement submit;

	public void email(String emailid) 
	{
		email.sendKeys(emailid);
		
	}

	public void psswd(String pwd) {
		
		
		psswd.sendKeys(pwd);
		// TODO Auto-generated method stub
		
	}
	
	public void click_login()
	{
		Login.click();
	}
}
