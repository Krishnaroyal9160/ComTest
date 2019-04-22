package com.amazon.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.Homepage;

public class HomePageTest extends TestBase {

	Homepage home;

	public HomePageTest() {
		super();
	}

	@BeforeClass()
	public void setup() {
		initialize();
		home = new Homepage();

	}

	@Test(priority = 2)
	public void validatingTitle() {
		String title = home.titleCheck();
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Test(priority = 1)
	public void validateLogo() {
		boolean logo = home.checkLogo();
		Assert.assertTrue(logo);
	}

	@Test(priority = 3)
	public void launchLoginPage() {
		home.validatingSigInButton();

		assertEquals(driver.getTitle(), "Amazon Sign in", "InvalidTitle");
	}

	@Test(priority = 4)
	public void launchPrimepage() {
		home.validatingAmazonTagName();
		assertEquals(driver.getTitle(), "Amazon Prime", "InvalidTitle");
	}

	@AfterClass()
	public void tearDown() {
		driver.quit();
	}
}
