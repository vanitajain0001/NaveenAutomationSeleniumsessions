package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "chrome";
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver(browserName);
		br.launchUrl("https://www.amazon.co.uk/");
		String title = br.doGetTiltle();
		System.out.println("title is :" + title);
		br.closeBrowser();
	}

}
