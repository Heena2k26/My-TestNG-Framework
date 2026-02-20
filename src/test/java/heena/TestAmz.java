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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class TestAmz {
	WebDriver driver;
	
	@BeforeClass
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

	@Test
  public void launchMyApp() {
		driver.get("https://www.amazon.in/");
		String threadName = Thread.currentThread().getName();
	    System.out.println("Thread Name: " + threadName);
  }
 	@Test
  public void title() {
	  System.out.println(driver.getTitle());
	  String threadName = Thread.currentThread().getName();
	    System.out.println("Thread Name: " + threadName);
  }

@Test
  public void urlofmypage(){
	  System.out.println(driver.getCurrentUrl());
	  String threadName = Thread.currentThread().getName();
	    System.out.println("Thread Name: " + threadName);
	  
  }
  @AfterClass()
  public void teardown()
  {
	//  driver.quit();
  }
}
