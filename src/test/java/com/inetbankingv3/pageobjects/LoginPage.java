package com.inetbankingv3.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage (WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(name="uid")
	WebElement txtusername;
	@FindBy(name="password")
	WebElement txtpassword;
	@FindBy(name="btnLogin")
	WebElement btnlogin;
	@FindBy(xpath="//a[text()='Log out']")
	WebElement btnlogout;
	public void setusername(String uname) {
		txtusername.sendKeys(uname);
	}
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void Setbtnlogin() {
		btnlogin.click();;
	}
	public void setbtnlogout() {
		btnlogout.click();
	}
}




