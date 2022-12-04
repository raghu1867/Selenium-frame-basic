package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();

		//validation
		  if (text.equals("Please enter a valid user name")) 
		  {
			  System.out.println("correct msg"); } 
		  else {
		  System.out.println("in correct msg"); }
		 

		alert.accept();

//driver.findElement(By.name("q")).sendKeys("selenium");
//driver.findElement(By.className())
//driver.findElement(By.xpath("//*[@name='btnK']").c
		// driver.findElement(By.xpath(null))

	}

}
