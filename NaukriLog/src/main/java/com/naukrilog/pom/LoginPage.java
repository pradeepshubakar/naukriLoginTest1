package com.naukrilog.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="login_Layer")
	private WebElement loginLink;
	@FindBy(xpath="//input[contains(@placeholder,'Enter your active Email ID')]")
	private WebElement EmailIdOrUserName;
	@FindBy(xpath="//input[contains(@placeholder,'Enter your password')]")
	private WebElement password;
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginLink() {
		loginLink.click();
	}
	public void enterEmailIdOrUserName(String un) {
		EmailIdOrUserName.sendKeys(un);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
