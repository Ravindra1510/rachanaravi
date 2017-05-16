package script;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Excel;
import pom.LoginPage;

public class VerifyVersion extends BaseTest {

   @Test
   public void testVerifyVersion()
   {
	 String eVersion = Excel.getCellData(INPUT_PATH, "VerifyVersion", 1, 0);  
     
	 LoginPage l=new LoginPage(driver);
	 l.verifyVersion(eVersion);
   }

}
