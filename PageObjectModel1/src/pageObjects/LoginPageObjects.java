package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}

	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
	}
}
