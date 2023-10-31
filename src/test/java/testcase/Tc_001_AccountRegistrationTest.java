package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;

public class Tc_001_AccountRegistrationTest extends BaseClass {

	public WebDriver wait;
	
@Test
 void test_account_Registration() throws InterruptedException
	{
		
		try {
			AccountRegistrationPage Ar=new AccountRegistrationPage(driver);
									
			Ar.clickMyAccount();
						
			Ar.clickregister();
			
			Ar.Setfirstname("Anjali");

			Ar.Setlstname("Reddy");

			Ar.Setemail("reens482@gmail.com");

			Ar.Setpwd("djhkfg");
			
			Ar.checkbox();
			
			Ar.setprivacypolicy();

			Ar.clickcontinue();
			
		
		} catch (Exception e) {
			
		}
		
	}
	
}
