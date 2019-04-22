package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "ap_email")
	WebElement Email;
	@FindBy(id = "ap_password")
	WebElement password;
	@FindBy(id = "signInSubmit")
	WebElement signin;
	@FindBy(xpath = "//*[@id='continue']")
	WebElement ContinueButton;
	@FindBy(xpath="//a[@id='nav-link-accountList']//span[@class='nav-line-1']")
	WebElement Username;

	@FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/div[3]/div/a/span")
	WebElement NeedHelp;
	@FindBy(xpath="//*[@id=\"auth-fpp-link-bottom\"]")
	WebElement ForgotPassword;
	@FindBy(xpath="//*[@id=\"ap-other-signin-issues-link\"]")
	WebElement IssuesinSignin;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public Homepage singnIN(String email, String Pwd) {
		Email.sendKeys(email);
		ContinueButton.click();
		String rl = driver.getCurrentUrl();
		if (rl.equals("https://www.amazon.in/ap/signin")) {
			System.out.println(" your in expected page");
		} else {
			System.out.println("invalid page");
			driver.quit();

		}
		password.sendKeys(Pwd);
		signin.click();
		return new Homepage();
	}
	public String ValidatingUser() {
		
		return Username.getText();
		
	}
	public ForgotPage needHelp() {
		NeedHelp.click();
		ForgotPassword.click();
		return new ForgotPage();
		
	}
	

}
