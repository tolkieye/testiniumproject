package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage 
{
	
	public WebDriver driver;
		
	By signin = By.xpath("//div[contains(text(),'Sepetim')]");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public WebElement getLogin()
	{
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]"));
		
		action.moveToElement(element).click(element).perform();
		WebElement element2 = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a"));
		action.moveToElement(element2).click(element2).build().perform();
		return (null);
		
	}

}
