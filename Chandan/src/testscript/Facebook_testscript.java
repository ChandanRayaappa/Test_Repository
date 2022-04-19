package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genricscript.Base_class;
import genricscript.Genric_Excel;
import pomscript.Pom_facebook;

public class Facebook_testscript extends Base_class {
	@Test
	public static void test() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
	{
		String un = Genric_Excel.getdata("Sheet1", 0, 0);
		String pwd = Genric_Excel.getdata("Sheet1", 1, 0);
	//	String txt=Genric_Excel.getdata("Sheet1", 2, 0);
	    Pom_facebook fb=new Pom_facebook(driver);
		 
		fb.Username(un);
		 fb.password(pwd);
		 fb.Loginbutton();
		 //fb.Searchbox(txt)
		 Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("Yashwanth M.R");
		 Thread.sleep(2000);
	Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
	driver.findElement(By.xpath("//div[@aria-label='Add friend']")).click();
	
	driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Log Out']")).click();
	Thread.sleep(2000);
	
	String un1=Genric_Excel.getdata("Sheet1", 2, 0);
	String pwd1=Genric_Excel.getdata("Sheet1", 3, 0);
			fb.Username(un1);
			fb.password(pwd1);
			fb.Loginbutton();
			driver.findElement(By.xpath("//span[.='Friends']")).click();
			Thread.sleep(2000);
			
	
			
	         
		
		
	}

}
