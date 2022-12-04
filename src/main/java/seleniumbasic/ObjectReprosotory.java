package seleniumbasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectReprosotory {
	 static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fip = new FileInputStream(
				"C:\\Users\\Jaypal reddy\\eclipse-workspace\\Seleniumpom\\src\\main\\java\\seleniumbasic\\config.properities");

		prop.load(fip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

		//System.out.println(prop.getProperty("url"));
		String url = prop.getProperty("url");
		System.out.println(url);
		
		
		String browsername = prop.getProperty("browser");
		System.out.println(browsername);
		
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");
                driver = new ChromeDriver();
		}else if (browsername.equals("ff")) {
			System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//geckodriver.exe");
            driver = new FirefoxDriver();
			
		}
		driver.get(url);
		
		
		driver.quit();		
		
		

	}
}
