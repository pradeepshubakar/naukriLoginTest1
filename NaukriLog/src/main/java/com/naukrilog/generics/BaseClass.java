package com.naukrilog.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/driver/geckodriver.exe");

	}
	public static WebDriver driver;
	public FileLib f = new FileLib();

	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--disable-notifications");
			driver = new FirefoxDriver(option);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	/*@BeforeMethod
	public void login() throws IOException {
		driver.get(f.getPropertyFileData("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyFileData("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyFileData("password"));
		driver.findElement(By.id("loginButton")).click();
	}

	@AfterMethod
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='logoutLink']"))));
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}
*/}
