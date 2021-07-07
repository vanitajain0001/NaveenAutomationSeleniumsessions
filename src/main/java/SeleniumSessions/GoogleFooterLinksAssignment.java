package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFooterLinksAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		List<WebElement> footerLinksList = driver.findElements(By.xpath("//div[@class='o3j99 c93Gbe']/div"));
		
		
		for(WebElement e : footerLinksList) {
			String text = e.getText();
			System.out.println(text);
			
		}
		driver.close();
		
		
		
		
	}

}
