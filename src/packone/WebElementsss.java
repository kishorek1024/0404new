package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD9March\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
				
		WebElement uid=driver.findElement(By.id("email"));
		uid.sendKeys("Kishore");
		uid.clear();
		uid.sendKeys("sdjskdf");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("dkjsfsdlf");
		pwd.clear();
		

	}

}
