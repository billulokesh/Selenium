
package Basetest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.*;

public class Base {
    protected WebDriver driver;
    
    @BeforeClass
    public void setUp() {
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--disable-notifications");
    	options.addArguments("--disable-infobars");
    	options.addArguments("--disable-extensions");
    	options.addArguments("--disable-popup-blocking");

    	Map<String, Object> prefs = new HashMap<>();
    	prefs.put("profile.default_content_setting_values.notifications", 2);
    	prefs.put("profile.default_content_setting_values.popups", 2);

    	options.setExperimentalOption("prefs", prefs);


        driver = new ChromeDriver(options);
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/products");
        driver.navigate().refresh();

        ((JavascriptExecutor)driver).executeScript(
        "document.querySelectorAll('iframe').forEach(e => e.remove());");
    }

   /* @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}*/
}

