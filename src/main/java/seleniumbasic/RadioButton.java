package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://www.singaporeair.com/en_UK/in/home?ds_rl=1012408&gclid=EAIaIQobChMI-9iGtYWZ-gIVTorCCh1T2gPjEAAYASAAEgJMyfD_BwE&gclsrc=aw.ds#/book/bookflight");
		driver.manage().window().maximize();

		String tit = driver.getTitle();
		System.out.println(tit);
		System.out.println(tit.length());
		
		
		
		 
		 // Actions act=new Actions(driver); //
		//  act.moveToElement(button).build().perform(); 
		//  button.click();
		 // System.out.println( button.isSelected());
		 WebElement button1=driver.findElement(By.id("redeemFlights"));
		  WebElement button=driver.findElement(By.id("bookFlights"));
	        button1.click();
	        System.out.println( button.isSelected());
	        //button1.click();
	          System.out.println(button1.isSelected());
	          //  button1.click();
	System.out.println(driver.findElement(By.xpath("//*[@name='book-flight-radio']")).getText());
	}

}
