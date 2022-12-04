package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingupload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@name='fileupload']")).sendKeys("C://Users//Jaypal reddy//Desktop");
	
	driver.close();
	
	
	
	}

}
