package heena;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderr {
	WebDriver driver;
	SoftAssert s=new SoftAssert();
	
	
  @DataProvider
  public Object[][] heena() {
    return new Object[][] {
    	
    	                   { "demo", "demo" }
    	                //   {"demo","test@123"},
    	               //    {"sathvik","demo"}
    	
    };
    }
    @Test(dataProvider="heena")
    public void login(String username,String password) throws InterruptedException
    {
    	 driver=new ChromeDriver();
    	driver.get("https://www.demoblaze.com/index.html");
    	driver.manage().window().maximize();
    	String threadName = Thread.currentThread().getName();
        System.out.println("Thread Name: " + threadName);
    	Thread.sleep(4000);
    	driver.findElement(By.id("login2")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("loginusername")).sendKeys(username);
    	driver.findElement(By.id("loginpassword")).sendKeys(password);
    	driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
    	Thread.sleep(4000);
    	Assert.assertEquals(driver.findElement(By.id("logout2")).isDisplayed(), true,"logout is not displaying for invalid user");
    	//driver.quit();
    
    
    
    	
    }
}
