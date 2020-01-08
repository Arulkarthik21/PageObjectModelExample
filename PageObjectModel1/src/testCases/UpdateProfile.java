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
import pageObjects.UpdateProfileObjects;

public class UpdateProfile {
	@Test
	public void updateprofiletest() {
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp = p.getProfile("Arulkarthik");
		FirefoxBinary fb = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\Firefox.exe"));
		WebDriver driver = new FirefoxDriver(fb, fp);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/login");
		
		
		LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.loginButton(driver).click();
		
		
		UpdateProfileObjects.myProfile(driver).click();
		UpdateProfileObjects.City(driver).sendKeys("Newyork");
		UpdateProfileObjects.submit(driver).click();
		

		/*WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement login = driver.findElement(By.xpath("//*[@id='loginfrm']/button"));
		login.click();

		driver.quit();

		WebElement myprofile = driver
				.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a"));
		myprofile.click();

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Newyork");

		WebElement submit = driver.findElement(By.xpath("//*[@id='profilefrm']/div/div/div[7]/div/button"));
		submit.click();*/
	}

}
