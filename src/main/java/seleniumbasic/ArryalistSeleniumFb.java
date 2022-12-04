package seleniumbasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArryalistSeleniumFb {
	WebDriver driver;

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	public void test() {
		
		
		List<WebElement>list=driver.findElements(By.tagName("a"));
		
		System.out.println("size of link"  +"    "+   list.size());
		String text=driver.getTitle();
		System.out.println(text);
		
		for(WebElement ele:list) {
			
			
		
		}
		
		
		
		
		
	}
	
	
	
	
public static void main(String[] args) {
		
	ArryalistSeleniumFb alsf=new ArryalistSeleniumFb();
	alsf.setup();
	alsf.test();
		
		

	}

}
