package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.base.TestBase;

public class Homepage extends TestBase {
      //Page Factory Object Repository
	  @FindBy(id="nav-logo")
	   WebElement logo;
	  @FindBy(xpath="//*[@id=\'nav-link-accountList\']/span[1]")
	   WebElement signin;
	  @FindBy(xpath="//*[@id='nav-logo']/a[2]")
	   WebElement tryprime;
	  @FindBy(xpath="//*[@id=\"nav-main\"]/div[1]/div[2]/div/div[3]/span[2]/span/input")
	  WebElement changetheadress;
	  public Homepage() {
		  PageFactory.initElements(driver, this);
	  }
	   public String titleCheck() {
		   return driver.getTitle();
	   }
	  public boolean checkLogo() {
		  return logo.isDisplayed();
	  }
	  public LoginPage validatingSigInButton() {
		  signin.click();
		  return new LoginPage();
	  }
	  public PrimePage validatingAmazonTagName() {
	        tryprime.click();
	        return new PrimePage();
	  }
	  
	  }
	  
	

