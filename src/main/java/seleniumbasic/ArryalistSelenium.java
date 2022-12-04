package seleniumbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArryalistSelenium {

	WebDriver driver;

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver_win32 (2)//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void test() {

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("list of size is" + list.size());
		ArrayList<String> linktext = new ArrayList<String>();
		for (WebElement ele : list) {
			System.out.println(ele.getText());
			System.out.println(ele.getSize());
		}
		int i = 1;
		for (String s : linktext) {
			System.out.println(s);
			i++;
		}

	}

	public static void main(String[] args) {

		ArryalistSelenium als = new ArryalistSelenium();
		als.setup();
		als.test();

	}

}
