package webpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginTest{
	
	public String baseURL = "http://uat.drivetrackplus.com/web/LiteIndex.aspx";
	public WebDriver driver;

@BeforeTest
	public void setUp() 
{
	System.setProperty("webdriver.chrome.driver","C:\\Sanjay\\Softwares\\AAA\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(baseURL);
}

@Test
public void testlogin() throws Exception
{
	
	driver.findElement(By.id("UserName")).sendKeys("sanjay");
	driver.findElement(By.id("Password")).sendKeys("Test@123");
}

	

@AfterTest
public void close()
{
//driver.close();	
}

}