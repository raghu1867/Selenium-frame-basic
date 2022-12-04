package seleniumbasic;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	//String str1=driver.getTitle();
	//System.out.println(str1.length());
		List<WebElement>ele=driver.findElements(By.tagName("a"));
		
		
		
	for(WebElement currlink:ele) {
		
	String str= currlink.getText();
		System.out.println(str);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
