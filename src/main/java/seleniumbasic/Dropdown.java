package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		
		
		
	String tit = driver.getTitle();
		System.out.println(tit);

		// tit.length();

		System.out.println(tit.length());

		WebElement wb=driver.findElement(By.id("day"));

		Select sel = new Select(wb);
		sel.selectByValue("15");
		// System.out.println(sel);

		WebElement mt1 = driver.findElement(By.id("month"));
		
		
		if(mt1.isEnabled()) {
			System.out.println("is passed");
		}
		else {
			System.out.println("is failed");
		}
		Select mt = new Select(mt1);
		
		mt.selectByVisibleText("May");
		// System.out.println(mt);

		WebElement yer = driver.findElement(By.id("year"));
		
		Select year = new Select(yer);
		year.selectByValue("1923");
		

	}

}