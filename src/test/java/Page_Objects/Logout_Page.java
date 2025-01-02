package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_Page extends Base_Page {
	
	public Logout_Page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[text()='Continue']") WebElement Logout;
	
	public void CContinue()
	{
		Logout.click();
	}

}
