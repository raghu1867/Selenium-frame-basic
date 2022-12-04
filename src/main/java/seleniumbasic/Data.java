package seleniumbasic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class Data {
	WebDriver driver;

	@Test(dataProvider = "OrangeHRM")
	public void loginorm(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();

		Thread.sleep(5000);
		//assert.assertEquals(dr, false)
		//equals(driver.getTitle().contains("Dashboard"));
     //  assert.assertTrue(driver.getTitle().contains("Dashboard"));
    //   Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@DataProvider(name = "OrangeHRM")
	public Object[][] passData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "reddy";
		data[0][1] = "reddy1234";

		data[1][0] = "Admin";
		data[1][1] = "admin123";

		data[2][0] = "jaya";
		data[2][1] = "jaya12";

		return data;

	}

}
