package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		System.out.println("total links: " + linksList.size());

		for (WebElement e : linksList) {
			String hrefVal = e.getAttribute("href");
			System.out.println(hrefVal);
			
			if (hrefVal != null && !hrefVal.isEmpty() && hrefVal !="javascript : void 0") {
				System.out.println(hrefVal);
			}
		}
		driver.close();

	}

}
