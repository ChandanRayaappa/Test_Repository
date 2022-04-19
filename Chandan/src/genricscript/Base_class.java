package genricscript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Framework_constant {
	public static	WebDriver driver;
	@BeforeMethod
	public void openapp(){
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		 driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	@AfterMethod
	public void closeapp() throws IOException{
		Genric_Takescreenshot.getData(driver);
		driver.close();
	}
	

}
