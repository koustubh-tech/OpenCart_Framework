package Test_Cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.Home_Page;
import Page_Objects.Login_Page;
import Page_Objects.My_Account_Page;

public class Test003_Login_Logout_MultipleData extends Base_Class {
	
	@Test(dataProvider="logindata", dataProviderClass=data_Provider.class) 
	public void TC003_Login_MultipleData(String email, String pass, String stat) throws InterruptedException
	{
	
		Home_Page hp=new Home_Page(driver);
		
		hp.CMyaccount();
		
		hp.CLogin();
		
		
		
		Login_Page lp=new Login_Page(driver);
		lp.EEmail(email);
		lp.EPass(pass);
		lp.CLogin();
		
		My_Account_Page ma=new My_Account_Page(driver);
		boolean target=ma.is_myaccount_displayed();
		
		if(stat.equalsIgnoreCase("Valid"))
		{
			if(target==true)
			{
				ma.CLogout();
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		if(stat.equalsIgnoreCase("Invalid"))
		{
			if(target==true)
			{
				ma.CLogout();
				Assert.assertTrue(false);
				
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		
	
		
		
		
		
		



			
	}
	
	

}
