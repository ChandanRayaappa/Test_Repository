package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_facebook  {
	@FindBy(id="email")
	private WebElement Username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement Loginbutton;
	//@FindBy(xpath="//input[@aria-label='Search Facebook']")
	//private WebElement Searchbox;
	
	public Pom_facebook(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public void Username(String un){
		Username.sendKeys(un);
		
	}
	public void password(String pwd){
		password.sendKeys(pwd);
	}
	public void Loginbutton(){
		Loginbutton.click();
	}
	/*public void Searchbox(String txt){
		Searchbox.sendKeys(txt);
	}*/


}
