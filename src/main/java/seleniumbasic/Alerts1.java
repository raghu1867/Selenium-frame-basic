package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		/*
		 * //alert window with single button
		 * driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).
		 * click(); //alert window with ok and cancel button //acept the ok button
		 * driver.switchTo().alert().accept();
		 * 
		 * //cancel the button driver.switchTo().alert().dismiss();
		 */

//alert window and capature the text		

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		Thread.sleep(2000);

		Alert all = driver.switchTo().alert();
		System.out.println(all.getText());

		all.sendKeys("hello");
		all.accept();

	}

}
