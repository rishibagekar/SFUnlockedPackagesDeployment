package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMKH extends BaseClass {
	
	@FindBy(xpath="//input[@class='input r4 wide mb16 mt8 username']")
	@CacheLookup
	private WebElement UN;
	@FindBy(xpath="//input[@class='input r4 wide mb16 mt8 password']")
	@CacheLookup
	private WebElement PA;
	@FindBy(xpath="//input[@id='Login']")
	@CacheLookup
	private WebElement LoginButton;
	

	public LoginPageMKH(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	
	public void username() {

		UN.sendKeys("automation.testing@mckesson.com.cgatqa");
	}

	public void Password() {
		PA.sendKeys("newuser@1990");

	}
	public void LoginBTW() {
		LoginButton.click();

	}

}
