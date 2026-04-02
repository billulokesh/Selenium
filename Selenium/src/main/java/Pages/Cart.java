package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import elements.Elements;

public class Cart {

	private WebDriver driver;
	public Cart(WebDriver driver) {
this.driver=driver;
	
	}
	public void quantitycheck()
	{
		driver.findElement(By.xpath(Elements.Cartpage)).click();;
		List<WebElement> quantities = driver.findElements(
		        By.xpath("//td[@class='cart_quantity']//button")
		);

		for(WebElement qty : quantities)
		{
		    int actualQty = Integer.parseInt(qty.getText());

		    Assert.assertEquals(actualQty, 1, "Quantity mismatch");
		} 
	}
}
