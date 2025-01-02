package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {
	
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@name='email']") WebElement Email;
	@FindBy(xpath="//input[@name='password']") WebElement Password;
	@FindBy(xpath="//input[@value='Login']") WebElement CLOgin;
	
	public void EEmail(String Eemail)
	{
		Email.sendKeys(Eemail);
	}
	public void EPass(String Epass)
	{
		Password.sendKeys(Epass);
	}
	public void CLogin()
	{
		CLOgin.click();
	}

}
