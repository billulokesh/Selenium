package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import elements.Elements;

public class testcases {
	
		private WebDriver driver;
		public testcases(WebDriver driver) {
	this.driver=driver;
		}
public void  testcase()
{
	 driver.findElement(By.xpath(Elements.testcases)).click();
	 WebElement mes= driver.findElement(By.xpath("//span[text()='Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:']"));
	 Assert.assertEquals("Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:", mes.getText());
}
}
