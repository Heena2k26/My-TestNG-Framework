package basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups="e2e")
public class DemoBalze {
	WebDriver driver;
	
	  @Test(groups="heena")
	  public void launchMyApp() {
		  WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		
			driver.get("https://www.demoblaze.com/");
	  }
	  @Test(groups="heena")
	  public void title() {
		  System.out.println(driver.getTitle());
	  }

	  @Test(groups="heena")

	  public void productclick() throws InterruptedException {
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/a/img")).click();
		  
	  }
	  @Test(groups="heena")
	  public void urlofmypage(){
		  System.out.println(driver.getCurrentUrl());
		  
	  }
}
