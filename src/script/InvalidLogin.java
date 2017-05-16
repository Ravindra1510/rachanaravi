package script;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Excel;
import pom.LoginPage;

public class InvalidLogin extends BaseTest {

	@Test
	public void testInvalidLogin(){
		
		for(int i=0;i<=Excel.getRowCount(INPUT_PATH, "InvalidLogin");i++){
			LoginPage l=new LoginPage(driver);
			String un=Excel.getCellData(INPUT_PATH, "InvalidLogin", i, 0);
			String pw=Excel.getCellData(INPUT_PATH, "InvalidLogin", i, 1);
			l.setUsername(un);
			l.setPassword(pw);
			l.clickLogin();
		}
		
		
		
	}
	
}
