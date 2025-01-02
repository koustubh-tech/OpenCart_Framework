package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Change_Password_Page extends Base_Page {
	
	public Change_Password_Page(WebDriver driver)
	{
		super (driver);
	}
	@FindBy(xpath="//input[@name='password']") WebElement EPass;
	@FindBy(xpath="//input[@name='confirm']") WebElement EConfirmPass;
	@FindBy(xpath="//input[@value='Continue']") WebElement Ccontinue;
	
	public void EPassword(String enterpass)
	{
		EPass.sendKeys(enterpass);
	}
	public void EConfPass(String entercnfpass)
	{
		EConfirmPass.sendKeys(entercnfpass);
	}
	public void CContinue()
	{
		Ccontinue.click();
	}

}
