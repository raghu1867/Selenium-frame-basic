package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// launching browser
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
	
	
	driver.findElement(By.xpath("(//*[@class='oxd-main-menu-item'])[1]")).click();
	
	driver.findElement(By.xpath("//*[@class='oxd-main-menu-item active']")).click();	
	
	
	
	
	
	
	
	
	
	}

}
