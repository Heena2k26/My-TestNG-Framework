package heena;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 {
	/*
	 * Assertions are of 2 types: 1.hard assert 2.soft assert
	 */
  
  WebDriver driver;
 
	@BeforeClass
	public void browserinit()
	{
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
		
	}


	@Test(priority=1)
public void launchMyApp() throws InterruptedException {
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		Thread.sleep(2000);
	/*	if(driver.findElement(By.xpath("//h2[text()='Nokia lumia 1520']")).getText().contentEquals("Nokia lumia 120"))
		{
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		*/
		/// hard assert
	//	Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Nokia lumia 1520']")).getText(), "Nokia lumia 120","itemnot displaying");

		// soft assert
		SoftAssert s=new SoftAssert();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//h2[text()='Nokia lumia 1520']")).getText(), "Nokia lumia 120","itemnot displaying");
		
		System.out.println("Good morning Heena");
	
		s.assertAll();}
	
	
}
