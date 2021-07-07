package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	 static WebDriver driver;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "/Users/Abhi/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.close();
		
		
		
		
	}

}
