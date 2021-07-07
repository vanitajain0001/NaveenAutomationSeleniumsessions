package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/Abhi/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.uk/");
		driver.quit();
	}

}
