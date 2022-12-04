package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		
		driver.findElement(By.xpath("//*[@name='_nkw']")).sendKeys("java");
		
		//driver.findElement(By.xpath("//*[contains(@class,'gh-tb ui-autocomplete-input ui-autocomplete-loading')]")).sendKeys("java");
		driver.quit();
	}

}
