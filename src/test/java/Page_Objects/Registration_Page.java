package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_Page extends Base_Page {
	
	public Registration_Page(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@name='firstname']") WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']") WebElement LastName;
	@FindBy(xpath="//input[@name='email']") WebElement Email;
	@FindBy(xpath="//input[@name='telephone']") WebElement Number;
	@FindBy(xpath="//input[@name='password']") WebElement Pass;
	@FindBy(xpath="//input[@name='confirm']") WebElement CPass;
	@FindBy(xpath="(//input[@name='newsletter'])[1]") WebElement News;
	@FindBy(xpath="//input[@name='agree']") WebElement agree;
	@FindBy(xpath="//input[@type='submit']") WebElement Cont;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement Message;
	
	public void FName(String EName)
	{
		FirstName.sendKeys(EName);
	}
	public void LName(String ELName)
	{
		LastName.sendKeys(ELName);
	}
	public void email(String EEmail)
	{
		Email.sendKeys(EEmail);
	}
	public void telenumber(String ENumber)
	{
		Number.sendKeys(ENumber);
	}
	public void Password(String EPass)
	{
		Pass.sendKeys(EPass);
	}
	public void Confirm(String ECPass)
	{
		CPass.sendKeys(ECPass);
	}
	public void newspappser()
	{
		News.click();
	}
	public void Agree()
	{
		agree.click();
	}
	public void Continue()
	{
		Cont.click();
	}
	public String confirmationmsg()
	{
		try {
			return(Message.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	
	
}


