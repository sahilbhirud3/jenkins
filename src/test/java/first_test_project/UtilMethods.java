package first_test_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilMethods {

	public static WebDriver launchBrowser(String url) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		return driver;

	}
	
	
	
	public static void input(WebDriver driver, By locator, String value)
			{
		WebElement element= driver.findElement(locator);
		element.sendKeys(value);
		element.sendKeys(Keys.ENTER);
	
			}
	
	
	

	public static void closeBrowser(WebDriver driver) {

		driver.close();

	}

}