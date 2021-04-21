package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base 
{
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\alike\\eclipse-workspace\\Mavenjava\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\alike\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
		
		
		
		
	}
	

}
