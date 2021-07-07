package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		String title = driver.getTitle();
		
		System.out.println("The page title is :" + title);
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("wrong title");
		}
		driver.quit();
	}
	
	  

}
