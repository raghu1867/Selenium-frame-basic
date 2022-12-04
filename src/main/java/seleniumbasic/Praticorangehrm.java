package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Praticorangehrm {
//how to get url,titleof page,length of title,pagesource
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// launching browser

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
//url
		String currenturl = driver.getCurrentUrl();
		System.out.println("current url is" + currenturl);

		// title of page
		String title = driver.getTitle();
		System.out.println("title of page is" + title);
		int length = driver.getTitle().length();
		System.out.println("title length is" + length);
		// pagesource
		// String pagesource = driver.getPageSource();
		// System.out.println("pagesource is" + pagesource);

		// how to get tagname,html attributes values,text,
		// tagname
// String st=driver.findElement(By.xpath("//*[@type='submit']")).getTagName();
		// System.out.println(st);

		String st = driver.findElement(By.xpath("//*[@type='submit']")).getAttribute("type");
		System.out.println(st);

		WebElement usernametxt = driver.findElement(By.name("username"));
		usernametxt.sendKeys("Admin");
		System.out.println(usernametxt.getAttribute("value"));

		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// entering admin and password

		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		// driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		// driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();

		/*
		 * //employeelist element
		 * driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		 * 
		 * //
		 * driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose")
		 * ; // //self //
		 * 
		 * String text=driver.findElement(By.
		 * xpath("//a[contains(text(),'India Glycols')]/self::a")).getText();
		 * System.out.println(text); text=driver.findElement(By.
		 * xpath("//a[contains(text(),'India Glycols')]/parent::td")).getText();
		 * System.out.println(text);
		 * 
		 * 
		 */

		// handling images
		/*
		 * WebElement element = driver.findElement(By.
		 * xpath(" //*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[1]/img"));
		 * 
		 * // verify the image is displaye or not if (element.isDisplayed()) {
		 * System.out.println("login image");
		 * 
		 * // verify the text System.out.println(element.getAttribute("alt")); }
		 * 
		 * else { System.out.println("is not display image"); }
		 */
		/*
		 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 * driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		 * driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		 * 
		 * 
		 * // using webelement interface WebElement img =
		 * driver.findElement(By.className("oxd-userdropdown-img")); // verify the image
		 * is displayed if (img.isDisplayed()) {
		 * System.out.println("image is displayed"); System.out.println("image is" +
		 * img.getAttribute("alt")); } else { System.out.println("is not displayed"); }
		 * 
		 * 
		 * // // image class="employee-image" //contact details
		 * //*[contains(text(),'Contact Details')] //emercency contacts
		 * //*[contains(text(),'Emergency Contacts')] //dependets
		 * //*[starts-with(text(),'Depen')] //
		 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 * driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		 * driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		 * 
		 * //driver.findElement(By.cssSelector(
		 * "h5.oxd-text.oxd-text--h5.oxd-table-filter-title"));
		 * 
		 */

	}

}
