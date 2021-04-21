package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage 
{
	public WebDriver driver;
	
	By pagenum = By.xpath("//a[contains(text(),'2')]");
	public SearchPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getPagenum()
	{
		return driver.findElement(pagenum);
	}

}
