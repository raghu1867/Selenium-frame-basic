package seleniumbasic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//driver.findElement(By.xpath(""));
public class Org {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");

	//WebElement email=	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(45));
		WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		email.sendKeys("Admin");
		
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(45));
		WebElement password =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='password']")));
		//	driver.findElement(By.xpath("//*[@name='password']")).
	password.	sendKeys("admin123");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		
		
		
		//driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i"));

		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("tom");
	//	driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("peter");

		//driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("pal");

		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("0272");

//(input[@class='oxd-input oxd-input--active'])[2]

	
	//Select dropdown=new Select(driver.findElement(By.xpath("//span[@ class='oxd-userdropdown-tab']")));
	//	dropdown.selectByVisibleText("Change Password");
	
	
	//class="oxd-icon bi-caret-down-fill oxd-userdropdown-icon"
	//Paul Collings
	//Change Password
	
	}

}
