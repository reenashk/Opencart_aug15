package testcase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	//public ResourceBundle rb;
	
	@BeforeClass
	public void setup()
	{			
		//rb=ResourceBundle.getBundle("config");
		//if(br.equals("chrome"))
		//{
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		//}
		/*else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();
		}*/
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
