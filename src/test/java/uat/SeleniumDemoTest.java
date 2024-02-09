package uat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemoTest {

	private RemoteWebDriver driver;

	@BeforeEach // runs before each test
	void init() {
//		creates new window for each test
		this.driver = new ChromeDriver();
//		sets to full screen
		this.driver.manage().window().maximize();
	}
//
//	@Test
//	void seleniumTest() {
//		this.driver.get("http://www.bing.com");
//	}

	@Test
	void textBoxTest() {
		this.driver.get("https://demoqa.com/text-box");

		WebElement consent = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
		consent.click();

		WebElement fullName = this.driver.findElement(By.id("userName"));
		fullName.sendKeys("Craig");

		WebElement email = this.driver.findElement(By.id("userEmail"));
		email.sendKeys("Craig@Morris.com");

		WebElement currAdd = this.driver.findElement(By.id("currentAddress"));
		currAdd.sendKeys("Ravenstone");

		WebElement permAdd = this.driver.findElement(By.id("permanentAddress"));
		permAdd.sendKeys("Leicestershire");

		WebElement submit = this.driver.findElement(By.id("submit"));
//		this.driver.executeScript("arguments[0].scrollIntoView(true);", submit); - this auto scrolls to the required part
		submit.click();

		WebElement displayN = this.driver.findElement(By.id("name"));
		Assertions.assertEquals(true, displayN.getText().contains("Craig"));
		WebElement displayE = this.driver.findElement(By.id("email"));
		Assertions.assertEquals(true, displayE.getText().contains("Craig@Morris.com"));
		WebElement displayCA = this.driver.findElement(By.id("currentAddress"));
		Assertions.assertEquals(true, displayCA.getText().contains("Ravenstone"));
		WebElement displayPA = this.driver.findElement(By.id("permanentAddress"));
		Assertions.assertEquals(true, displayPA.getText().contains("Leicestershire"));
	}

//	@Test
//	void checkBoxTest() {
//
//		this.driver.get("https://demoqa.com/text-box");
//
//		WebElement consent = this.driver.findElement(By.cssSelector(
//				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
//		consent.click();
//
//		WebElement checkBox = this.driver.findElement(By.id("item-1"));
//		checkBox.click();
//
//		WebElement dropDown = this.driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
//		this.driver.executeScript("arguments[0].scrollIntoView(true);", dropDown);
//		dropDown.click();
//	}
//
//	@AfterEach
//	void close() {
//		this.driver.quit();
//	}
}
