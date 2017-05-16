package script;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Excel;
import pom.LoginPage;

public class ValidLogin extends BaseTest {

	
	@Test(priority=1)
	public void testVerifyLogin()
	{
	  String un= Excel.getCellData(INPUT_PATH,"ValidLogin",1,0);
	  String pw= Excel.getCellData(INPUT_PATH,"ValidLogin",1,1);
	  
	  LoginPage l= new LoginPage(driver);
	  l.setUsername(un);
	  l.setPassword(pw);
	  l.clickLogin();
	  
	}
}
