package com.naukrilog.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	@FindBy(xpath = "/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]")
	private WebElement MyNaukriDropDown;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logOut;

	private static WebDriver driver;
	 
	public WebDriverWait wait;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void moveTOMyNaukri() {
		/*Actions a = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(MyNaukriDropDown));
		a.moveToElement(MyNaukriDropDown).perform();*/
		/*MouseOverActions m = new MouseOverActions();

		m.moveToPerticularElement(MyNaukriDropDown);*/
	}

	public void clickOnLogOut() {
		logOut.click();
	}

}
