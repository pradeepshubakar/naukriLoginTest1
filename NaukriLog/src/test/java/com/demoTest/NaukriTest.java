package com.demoTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.naukrilog.generics.BaseClass;
import com.naukrilog.generics.FileLib;
//import com.actiTime.generics.MouseOverActions;
import com.naukrilog.pom.HomePage;
import com.naukrilog.pom.LoginPage;

public class NaukriTest extends BaseClass {

	@Test
	public void testNaukriTest() throws IOException, InterruptedException {
		
		LoginPage l = new LoginPage(driver);
		HomePage h = new HomePage(driver);
		FileLib f = new FileLib();
		driver.get(f.getPropertyFileData("naukriUrl"));
		l.clickOnLoginLink();
		l.enterEmailIdOrUserName(f.getPropertyFileData("naukriUn"));
		l.enterPassword(f.getPropertyFileData("naukriPw"));
		l.clickOnLoginButton();
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"))).perform();
		//h.moveTOMyNaukri();
		
		//Thread.sleep(5000);
		h.clickOnLogOut();
	}
	
}
