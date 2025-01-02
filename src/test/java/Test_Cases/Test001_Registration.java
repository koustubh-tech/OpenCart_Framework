package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_Objects.Home_Page;
import Page_Objects.Registration_Page;

      
public class Test001_Registration extends Base_Class {
	//public WebDriver driver;
	
	
	@Test
	public void TC01_Registration()
	{
		Home_Page hp=new Home_Page(driver);
		hp.CMyaccount();
		hp.CRegistration();
		
		Registration_Page rp=new Registration_Page(driver);
		rp.FName("Gaurav");
		rp.LName("Tiwari");
		rp.email("gaurav.tiwariii567@gami.com");
		rp.telenumber(RandomInt());
		rp.Password("Test@123");
		rp.Confirm("Test@123");
		rp.newspappser();
		rp.Agree();
		rp.Continue();
		Assert.assertEquals(rp.confirmationmsg(),"Your Account Has Been Created!");
		
		
	}

}
