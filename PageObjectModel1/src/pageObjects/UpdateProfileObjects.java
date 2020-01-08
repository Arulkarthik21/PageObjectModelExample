package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfileObjects {
	
	public static WebElement myProfile(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
	}

	public static WebElement City(WebDriver driver) {
		return driver.findElement(By.name("city"));

	}
	
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='profilefrm']/div/div/div[7]/div/button"));

	}
}
