package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends Base_Page {

	
         public Home_Page (WebDriver driver)
	{
		super(driver);
		
	}
	@FindBy(xpath="//span[text()='My Account']") WebElement Myaccount;
	@FindBy(xpath="//a[text()='Register']") WebElement Registration;
	@FindBy(xpath="//a[text()='Login']") WebElement Login; 
	public void CMyaccount()
	{
		Myaccount.click();
	}
	public void CRegistration()
	{
	   Registration.click();
	}
	public void CLogin()
	{
		Login.click();
	}

}
