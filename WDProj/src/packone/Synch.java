package packone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']")).click();
		WebDriverWait ww=new WebDriverWait(driver, 30);
		//ww.until(ExpectedConditions.urlContains("recghfhover"));
		ww.until(ExpectedConditions.titleContains("Password"));
		ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 50));
		ww.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"), 50));
		ww.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
		driver.findElement(By.id("identify_email")).sendKeys("9390101111");
		
		
		
		
		

	}

}
