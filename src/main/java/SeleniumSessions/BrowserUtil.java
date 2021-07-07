package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public WebDriver driver;
	/**
	 * this method is used to initialise the driver on the basis of given browser name
	 * @param browserName
	 * @return this will return driver
	 */

	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is :" + browserName);

		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;
			
		case "safari":
			driver = new SafariDriver();

			break;

		default:
			System.out.println("please pass the correct browser " + browserName);
			break;
		}
		return driver;

	}
	/**
	 * this method is used to launch the url
	 * @param url
	 */
	public void launchUrl(String url) {
		if(url.isEmpty()) {
			System.out.println("url is empty");
			return;
		}
		if(url.contains("http") || url.contains("https")) {
			driver.get(url);
			
		}
	
	}
	/**
	 * this method is used to get title 
	 * @return this will return title of the page(string)
	 */
	public String doGetTiltle() {
		return driver.getTitle();
	}
	
	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
		
	}

}
