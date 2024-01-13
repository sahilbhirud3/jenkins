package first_test_project;

import static first_test_project.UtilMethods.*;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCheckFlipkart {

	WebDriver driver = launchBrowser("https://www.flipkart.com/");

	@Test
	void testInputSearch() {
		By by = By.xpath("//input[@name='q']");
		input(driver, by, "mobiles");
//		WebElement elem=driver.findElement(By.tagName("title"));
		assertEquals(driver.getTitle(),"Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
	}

}
