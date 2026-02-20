package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups={"heena"})
public class Basic {
	WebDriver driver;
	
	@BeforeClass
	public void browserinit()
	{
	//	WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
	
		
	}
	//String browser="edge";
	//@Test(groups={"smoke"})
	
	@Test
  @Parameters({"browser"})
  public void launchMyApp(String browser) throws InterruptedException {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	
		driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("safari"))
	  {
		  
			driver=new SafariDriver();
	  
	  }
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
  }
  //@Test(groups={"smoke"})
	@Test
  @Parameters({"product"})
  public void title(String product) {
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	 
  }

  
}
