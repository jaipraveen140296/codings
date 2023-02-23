package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
		
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@type='text']")
	
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	
	private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	
	private WebElement loginClick;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginClick() {
		return loginClick;
	}
}
