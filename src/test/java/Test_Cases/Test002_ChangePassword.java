package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Objects.Change_Password_Page;
import Page_Objects.Home_Page;
import Page_Objects.Login_Page;
import Page_Objects.Logout_Page;
import Page_Objects.My_Account_Page;

public class Test002_ChangePassword extends Base_Class {
	
	@BeforeMethod
	public void TC002_ChangePass()
	{
		Home_Page hp=new Home_Page(driver);
		hp.CMyaccount();
		hp.CLogin();
		
		Login_Page lp=new Login_Page(driver);
		lp.EEmail(prop.getProperty("email"));
		lp.EPass(prop.getProperty("password"));
		lp.CLogin();
		
		My_Account_Page ap=new My_Account_Page(driver);
		ap.ClickChangePass();
		
		Change_Password_Page cp=new Change_Password_Page(driver);
		cp.EPassword(prop.getProperty("newpassword"));
		cp.EConfPass(prop.getProperty("newpassword"));
		cp.CContinue();
		
	


	}
	@Test(priority=1)
	public void ConfirmationMessage()
	{
		My_Account_Page ap=new My_Account_Page(driver);
		ap.changepassmessage();
		Assert.assertEquals(ap.changepassmessage(),"Success: Your password has been successfully updated.");
		
		
	}
	

}
