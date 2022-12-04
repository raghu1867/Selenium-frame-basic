package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemomentaction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		Actions action=new  Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div/a[2]"))).build().perform();
		
		
		

	}

}
