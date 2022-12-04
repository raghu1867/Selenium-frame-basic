package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Logopratic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// dynamic wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		/*
		 * driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("jaya");
		 * driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("reddy");
		 * driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys(
		 * "raghu.jaya05");
		 * driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys(
		 * "12345");
		 * 
		 * 
		 * 
		 * WebElement day= driver.findElement(By.id("day")); WebElement
		 * month=driver.findElement(By.id("month")); WebElement
		 * year=driver.findElement(By.id("year"));
		 * 
		 * 
		 * Select select=new Select(day); select.selectByVisibleText("10");
		 * System.out.println(select);
		 * 
		 * 
		 * Select select1=new Select(month); select.selectByVisibleText("may");
		 * System.out.println(select1);
		 * 
		 * Select select2=new Select(year); select.selectByVisibleText("2022");
		 * System.out.println(select2);
		 */

	}

}
