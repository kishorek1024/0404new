package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITT {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		// Click on Upload image
		driver.findElement(By.xpath("//img[@src='//pcdn-transfer.pcloud.com/ZBb/img/add_files_ico.png']")).click();
		// Run Autoit exe file
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\WD8Feb\\0304.exe");
		
		

	}

}
