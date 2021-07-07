package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoWebTableAssignment {


	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/kwibuka-women-s-twenty20-2021-1265208/kenya-women-vs-namibia-women-7th-match-1265219/full-scorecard");
		
		System.out.print(getBowler("Queentor Abel") + " : ");
		getScoreCard("Queentor Abel").stream().forEach(e -> System.out.print(e+" "));
		
		driver.close();
		
		
	}
	public static String getBowler(String bowlerName) {
		return driver
		.findElement
		(By.xpath("//a[text() = '"+ bowlerName +"']"))
		.getText();
	}
	
	public static List<String> getScoreCard(String bowlerName) {
		List<WebElement> scoreList = 
				driver.findElements(By.xpath("//a[text()='"+bowlerName+"']/parent::td//following-sibling::td"));
	
		List<String> scoreValList = new ArrayList<String>();
		
		for(int i=0; i<=scoreList.size()-8; i++) {
			String text = scoreList.get(i).getText();
			if(!text.isEmpty()) {
				scoreValList.add(text);
			}
		}
	
	return scoreValList;
	
	}
	
}
