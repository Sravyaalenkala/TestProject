
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firstprogram {
	WebDriver driver;

	@Test
	public void webelementtesting()
	{
	
	
	System.setProperty("webdriver.chrome.driver","C://sravya//SeleniumDrivers//chromedriver.exe");//open browser
	WebDriver driver = new ChromeDriver(); 


	driver.get("http://demo.guru99.com/test/login.html");  //launch url
	WebElement txtusername=driver.findElement(By.name("email")); //find  webelements n perform action
	WebElement password=driver.findElement(By.name("passwd"));
	WebElement submit=driver.findElement(By.name("SubmitLogin"));

	txtusername.sendKeys("Sravya");
	password.sendKeys("Advaitgoli");

	submit.click();
	driver.close();  
	}
}

