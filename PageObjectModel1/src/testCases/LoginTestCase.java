package testCases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {
@Test
	public void login() {
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp = p.getProfile("Arulkarthik");
		FirefoxBinary fb = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\Firefox.exe"));
		WebDriver driver = new FirefoxDriver(fb, fp);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		
		
		//LoginPageObjects LoginPageObjects = new LoginPageObjects();
		LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.loginButton(driver).click();
		
		
		
		
		
		
		/*WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement loginbutton = driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
		loginbutton.click();

		driver.quit();*/
	}

}
