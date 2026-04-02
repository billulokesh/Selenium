package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import elements.Elements;

public class contactUs {
	private WebDriver driver;
	public contactUs(WebDriver driver) {
this.driver=driver;
	}
	
	public void contact()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 driver.findElement(By.xpath(Elements.contactus)).click();
		 driver.findElement(By.xpath(Elements.name)).sendKeys("billu");
		 driver.findElement(By.xpath(Elements. email1)).sendKeys(Elements.email);
		 driver.findElement(By.xpath(Elements.subject)).sendKeys("Contact us");
		 driver.findElement(By.xpath(Elements. message)).sendKeys("billu");
		 driver.findElement(By.xpath(Elements.submit)).click();
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 WebElement mes= driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
		 Assert.assertEquals("Success! Your details have been submitted successfully.", mes.getText());
		 try
		 {
		    

		     WebElement popupClose = wait.until(
		             ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='continue-prompt-text']"))
		     );

		     popupClose.click();
		     System.out.println("Popup closed");

		 }
		 catch (Exception e)
		 {
		     System.out.println("Popup not displayed");
		 }
	}

}
