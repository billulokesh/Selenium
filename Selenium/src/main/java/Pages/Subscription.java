package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import elements.Elements;

public class Subscription {
	private WebDriver driver;
	public Subscription(WebDriver driver) {
this.driver=driver;
	}
	public void subscribe()
	{
		driver.findElement(By.xpath(Elements.homepage)).click();
		driver.findElement(By.xpath(Elements.subsrciption)).isDisplayed();
		driver.findElement(By.xpath(Elements.Cartpage)).click();
		driver.findElement(By.xpath(Elements.subsrciption)).isDisplayed();
		
	}
	
}
