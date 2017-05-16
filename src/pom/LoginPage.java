
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {

	

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//nobr[contains(.,'actiTIME')]")
	private WebElement version;
	
	//Intialization
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	public void clickLogin()
	{
		LoginBtn.click();
	}
	
	public void verifyVersion(String eVersion)
	{
		String aVersion= version.getText();
	    Assert.assertEquals(aVersion,eVersion);
	}
}
