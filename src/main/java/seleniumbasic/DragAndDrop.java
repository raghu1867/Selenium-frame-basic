package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");
//launching crome browser	
		WebDriver driver = new ChromeDriver();
//launching url	
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
//Actions class methods for draganddrop		
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement des = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		System.out.println(des.getText());
//perform drag and drop		
		act.dragAndDrop(src, des).build().perform();
		String text = des.getText();
		if (text.equals("Dropped!")) {
			System.out.println("pass:source is dropped to target as expected");
		} else {
			System.out.println("fail:soure couldnt be dropped to target as expected");
		}
		driver.close();

	}

}
