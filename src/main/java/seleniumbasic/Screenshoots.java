package seleniumbasic;

import java.io.File; 
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshoots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Files.copy(f,new File("C:\\Users\\Jaypal reddy\\Desktop\\New folder\\amazonscrrenshots.jpg"));

		WebElement w1 = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		w1.click();
		w1.sendKeys("pen drive");
		File f1 = w1.getScreenshotAs(OutputType.FILE);
		Files.copy(f1,new File("C:\\Users\\Jaypal reddy\\Desktop\\New folder\\textboxtext.jpg"));

		WebElement w2 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
		File f2 = w2.getScreenshotAs(OutputType.FILE);
		Files.copy(f2,new File("C:\\Users\\Jaypal reddy\\Desktop\\New folder\\image.jpg"));

	}

}
