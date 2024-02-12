package uat;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HTMLTest {

	private RemoteWebDriver driver;
	private WebDriverWait wait;

	@BeforeEach
	void init() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	}

	@Test
	void htmlTest() {

		this.driver.get("http://127.0.0.1:5500/SeleniumTest.html");

		WebElement title = this.driver.findElement(By.cssSelector("body > div > h1"));
		Assertions.assertEquals("TEST", title.getText());

		WebElement alert = this.driver.findElement(By.cssSelector("body > div > script"));
		Assertions.assertEquals(null, alert.getAttribute(""));

		WebElement alert2 = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > div > script")));
		Assertions.assertEquals(null, alert2.getAttribute(""));

		wait.until(ExpectedConditions.alertIsPresent());
		Assertions.assertEquals(true, this.driver.switchTo().alert().getText().contains("Craig"));
	}

}
