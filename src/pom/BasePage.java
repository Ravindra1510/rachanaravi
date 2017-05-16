package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
  public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verifyTitle(String eTtile)
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		try{
		wait.until(ExpectedConditions.titleIs(eTtile));
		Reporter.log("Title is Matching : Pass", true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching:Fail",true);
			Assert.fail();
		}
	}
}
