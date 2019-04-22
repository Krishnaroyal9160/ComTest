package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.Homepage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	Homepage home;
	LoginPage login;

	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialize();
		home = new Homepage();
		login = new LoginPage();

	}

	@Test(priority=2)
	public void validatingSignIn() {
		home.validatingSigInButton();
		login.singnIN("7416907802", "Alliswell66");
		Assert.assertEquals(home.titleCheck(),
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", 
				"Invalid title");
		System.out.println(login.ValidatingUser()+" Wlecome to Amazon Website");

	}
	@Test(priority=1)
	public void ValidatingNeedHelp() {
		home.validatingSigInButton();
		login.needHelp();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
