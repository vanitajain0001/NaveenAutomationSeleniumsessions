package SeleniumSessions;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAssignmentCRMPRO {
     static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();
		
		
		contactDetails("Aliss Jeyhun").stream().forEach(e -> System.out.print(e + " "));
		driver.close();
		
		
		
		

	}
	 public  static List<String> contactDetails( String name ) {
		 List<WebElement> ContactDetails = driver.findElements(By.xpath("(//a[text() = '"+ name +"']/../following-sibling::td)"));
		 List<String> detailVal = new ArrayList<String>();
		 
		 for(int i = 1; i<= ContactDetails.size()-2; i++ ) {
			 String text = ContactDetails.get(i).getText();
			 detailVal.add(text);
		 }
		 return  detailVal;
		 
		 
	 }
	 

}
