package org.dd.test.Fblogin;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import utility.Base;

public class LoginTest extends Base {
	static WebDriver driver;
	LoginPage login;
	static Base base;
	@Before
	public  void launchBrowser() {
		driver = Base.getDriver();

	}

	@Test
	public void verifyLogin() {
	login=new LoginPage(driver);
	setText(login.getTxtUserName(), "ezhilr62@gmail.com");
setText(login.getTxtUserPassword(), "ezhilkeerthu9488");

	clickBtn(login.getBtnLoginButton());
	//verify next page recover option is available
	
	}
	@After
	public void closeBrowser() {
	driver.quit();
	}
	}


