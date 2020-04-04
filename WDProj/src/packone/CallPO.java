package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		PO_LoginPage po=PageFactory.initElements(driver, PO_LoginPage.class);
		po.uid.sendKeys("kishore");
		po.pwd.sendKeys("abcdefgh");
		po.fp.click();
		
		PO_ForgotPassword fp=PageFactory.initElements(driver, PO_ForgotPassword.class);
		fp.email.sendKeys("fghjkl");
		
		
		/*PO_LoginPage login=new PO_LoginPage();
		driver.findElement(login.uid).sendKeys("Kishore");
		driver.findElement(login.pwd).sendKeys("fghjk");*/
		

	}

}
