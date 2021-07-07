package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartDemo {
	WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		By firstName = By.name("firstname");
		By lastName = By.id("input-lastname");
		By email = By.name("email");
		By telephone = By.cssSelector("#input-telephone");
		By password = By.xpath("//*[@id=\"input-password\"]");
		By confirmPassword = By.xpath("//*[@id=\"input-confirm\"]");
		By privacyCheckbox = By.name("agree");
		By continueButton = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		By accountCreated = By.xpath("//*[@id=\"content\"]/h1");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.doSendKeys(firstName, "rita");
		ele.doSendKeys(lastName, "abcb");
		ele.doSendKeys(email, "nia@gmail.com");
		ele.doSendKeys(telephone, "00919922110035");
		ele.doSendKeys(password, "abcdef");
		ele.doSendKeys(confirmPassword, "abcdef");
		ele.doClick(privacyCheckbox);
		ele.doClick(continueButton);
		if(ele.doGetText(accountCreated).contains("Your Account Has Been Created")) {
			System.out.println("test passed");
		}
		
		
		br.closeBrowser();
		
	}

}
