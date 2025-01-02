package Test_Cases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Class {
	public WebDriver driver;
	public Properties prop;  // Declaring Variable of the Property File
	@BeforeClass
	public void setup() throws IOException
	{
		FileReader file=new FileReader("C:\\Users\\Koustubh Pisal\\eclipse-workspace\\new workspace\\OpenCart_Framework\\src\\test\\resources\\Config.properties");
		prop=new Properties();  //Initializing Properties value in the Variable.
		prop.load(file);        //Inbuid Method.
		
		driver=new FirefoxDriver();
		driver.get(prop.getProperty("URL"));//Using Values from the Property File
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
	public String RandomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(10);
		return generatedString;
	}
	public String RandomInt()
	{
		String generatedNum=RandomStringUtils.randomNumeric(10);
		return generatedNum;
	}
	

}
