package heena;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {

    WebDriver driver;

 
	@Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }
    }

    @Test
    public void loginTest() {
        driver.get("https://example.com");
        System.out.println("Title: " + driver.getTitle());
    }
}
