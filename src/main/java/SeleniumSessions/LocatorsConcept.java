package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	 static WebDriver driver;
	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      
	}   
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
}
