package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Account_Page extends Base_Page {
	
	public My_Account_Page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[text()='Change your password']") WebElement CChangePass;
	@FindBy(xpath="//div[text()='Success: Your password has been successfully updated.']") WebElement ChangePasswordMessage;
	@FindBy(xpath="(//a[text()='Logout'])[2]") WebElement Logout;
	@FindBy(xpath="//h2[text()='My Account']") WebElement my_account;
	
	public void ClickChangePass()
	{
		CChangePass.click();
	}
	public String changepassmessage()
	{
		return (ChangePasswordMessage.getText());
	}
	public void CLogout()
	{
		Logout.click();
	}
	public boolean is_myaccount_displayed()
	{
		my_account.isDisplayed();
		return false;
		
	
	}

}
