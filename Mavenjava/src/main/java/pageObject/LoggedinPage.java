package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedinPage 
{
	public WebDriver driver;
	
	By input = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
	By search = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/button[1]");
	public LoggedinPage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement getInput()
	{
		return driver.findElement(input);
	}
	
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}

}
