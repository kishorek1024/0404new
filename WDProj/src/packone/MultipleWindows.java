package packone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// Click on Data policy and Cookie Policy Links
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.id("cookie-use-link")).click();
		
		Set<String> a=driver.getWindowHandles();
		ArrayList windows=new ArrayList(a);
		
		driver.switchTo().window((String)windows.get(0)).findElement(By.id("email")).sendKeys("Kishore");
		Thread.sleep(3000);
		driver.switchTo().window((String)windows.get(1)).findElement(By.id("pass")).sendKeys("Kishore");
		//driver.switchTo().window((String)windows.get(0)).findElement(By.id(
		
		/*int i;
		
		for(i=0; i<windows.size(); i++){
			System.out.println(driver.switchTo().window((String)windows.get(i)).getTitle());
			List<WebElement> lianks=driver.switchTo().window((String)windows.get(i)).findElements(By.tagName("a"));
			System.out.println(lianks.size());
			driver.close();
		}*/

	}

}
