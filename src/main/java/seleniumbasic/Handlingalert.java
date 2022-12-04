package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
	Alert alert=driver.switchTo().alert();
		alert.getText();
		String text=alert.getText();
		System.out.println(text);
//validation
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("valid msg");
		}
		else {
			System.out.println("in valid msg");
		}
		alert.accept();
		driver.quit();
		
	}

}
