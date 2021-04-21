package project.Mavenjava;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoggedinPage;
import pageObject.LoginPage;
import pageObject.SearchPage;
import resources.base;

public class HomePage extends base
{
	@Test
	public void basePage() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://www.gittigidiyor.com");
		LandingPage l = new LandingPage(driver);
		l.getLogin();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("gittigidiyoralik@gmail.com");
		lp.getPassword().sendKeys("123321a");
		lp.getLogin().click();
		LoggedinPage lip = new LoggedinPage(driver);
		lip.getInput().sendKeys("bilgisayar");
		lip.getSearch().click();
		SearchPage sp = new SearchPage(driver);
		sp.getPagenum().click();
		
	}
}
