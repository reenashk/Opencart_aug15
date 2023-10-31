package testcase;

import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.LoginPage;

public class TC_002_LoginTest extends BaseClass {
	
	@Test
	public void test_login()
	{
		
	try
	{
		AccountRegistrationPage Ar=new AccountRegistrationPage(driver);
		
		Ar.clickMyAccount();
		
		LoginPage lp=new LoginPage(driver);
		
		lp.click_login();
				
		lp.email("reens482@gmail.com");
		
		lp.psswd("djhkfg");
		
		
	}catch(Exception e)
	{
		
	}
}

}
