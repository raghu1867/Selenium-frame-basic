package seleniumbasic;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//////to print all the links/////////////////////
public class Printalltags {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// launching browser
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
// size of tags
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("total tags" + alltags.size());
// print all links
for (int i = 0; i < alltags.size(); i++) {
			System.out.println("link on page are" + alltags.get(i).getAttribute("href"));
			System.out.println("link on page are" + alltags.get(i).getText());
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		List<WebElement> alltag = driver.findElements(By.tagName("a"));
		System.out.println("total tags" + alltag.size());

		// print all links

		for (int i = 0; i < alltag.size(); i++) {
			System.out.println("link on page are" + alltag.get(i).getAttribute("href"));
			System.out.println("link on page are" + alltag.get(i).getText());
		}
	}
}
