package seleniumbasic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
