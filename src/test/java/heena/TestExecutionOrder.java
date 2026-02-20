package heena;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestExecutionOrder {
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void browserinit()
	{
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
		
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("hello");
	}

	@Test(priority=1,groups={"heena"})
  public void launchMyApp() {
		driver.get("https://www.myntra.com/");
		String threadName = Thread.currentThread().getName();
	    System.out.println("Thread Name: " + threadName);
  }
 	@Test(priority=3)
  public void title() {
 		String threadName = Thread.currentThread().getName();
 	    System.out.println("Thread Name: " + threadName);
	  System.out.println(driver.getTitle());
  }

@Test(priority=2,enabled=true)
  public void urlofmypage(){
	String threadName = Thread.currentThread().getName();
    System.out.println("Thread Name: " + threadName);
	  System.out.println(driver.getCurrentUrl());
	  
  }
  @AfterClass()
  public void teardown()
  {
	//  driver.quit();
  }
}
