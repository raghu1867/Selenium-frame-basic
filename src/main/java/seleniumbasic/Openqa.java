package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openqa {

	public static void main(String[] args) {

// set up the chromebrowser
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//maxming the window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//launching the url browser
		driver.get("https://www.seleniumhq.org/");
//get current url
		String currenturl = driver.getCurrentUrl();
		System.out.println("current url" + currenturl);
//get title of page
		String title = driver.getTitle();
		System.out.println("title is   " + title);
//get page source
		String pagesource = driver.getPageSource();
		System.out.println("page source is" + pagesource);

	}

}
