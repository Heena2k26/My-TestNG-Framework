package heena;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssignmentDataProvider {
	WebDriver driver;
	
	@DataProvider
	public Object[][] phone() {
	    return new Object[] []{
	    	
	    	                   {"Iphone"},
	    	                   {"motorola"},
	    	                   {"one plus"} 
	    };
	}
	
  @Test(dataProvider="phone")
  public void selectphone(String phonename) throws InterruptedException {
	  driver= new ChromeDriver();
	  SoftAssert s=new SoftAssert();
	  driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(3000);
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(phonename);
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  Thread.sleep(3000);
	  
	 // Assert.assertEquals(driver.getTitle().contains(phonename), true, "phone is not available");
	  
	  Assert.assertEquals(driver.getTitle().contains(phonename), true, "phone is not available");
	  driver.quit();
	  s.assertAll();
	  
	  
  }
}
