package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get("https://classic.crmpro.com/index.html");
		 
		 ElementUtil ele = new ElementUtil(driver);
		 ele.doSendKeys(By.name("username"), "groupautomation");
		 ele.doSendKeys(By.name("password"), "test@12345");
		 ele.doClick(By.xpath("//*[@id=\"loginForm\"]/div/div/input"));
		 
		 ele.waitForFrameAndSwitch("mainpanel", 10);
		 ele.doClick(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a"));
		 System.out.println(ele.doGetText(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/table[1]/tbody/tr[1]/td[1]")));
	
		 
		 driver.close();
		
		
	}

}
