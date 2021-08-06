package com.inetbankingv3.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InsuranceProject {
	WebDriver ldriver;
	
public  InsuranceProject(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements( rdriver, this);
	
}
@FindBy(xpath="//a[text()='Insurance Project']")
WebElement clickinsurance;
@FindBy(id="email")
WebElement setemail;
@FindBy(id="password")
WebElement setpwd;
@FindBy(name="submit")
WebElement clicksubmit;
@FindBy(xpath="//*[@id=\"tabs-1\"]/h2")
WebElement linktext;
@FindBy(xpath="/html/body/div[3]/a")
WebElement txtRegister;
@FindBy(id="user_title")
WebElement setdropdown;
@FindBy(name="firstname")
WebElement txtfname;
@FindBy(name="lastname")
WebElement txtlname;
@FindBy(name="phone")
WebElement txtphone;
@FindBy(name="year")
WebElement setyear;
@FindBy(name="month")
WebElement setmonth;
@FindBy(name="date")
WebElement setdate;
@FindBy(name="licencetype")
WebElement radiobutton2;
@FindBy(name="licenceperiod")
WebElement setlicencePeriod;
@FindBy(name="occupation")
WebElement setoccupation;
@FindBy(name="street")
WebElement txtaddress;
@FindBy(name="city")
WebElement txtcity;
@FindBy(name="county")
WebElement txtcounty;
@FindBy(name="post_code")
WebElement txtPINcode;
@FindBy(name="email")
WebElement txtemail;
@FindBy(name="password")
WebElement txtpwd;
@FindBy(name="c_password")
WebElement txtcpwd;
@FindBy(name="submit")
WebElement btnsubmit;




public void clickinsurance() {
	clickinsurance.click();
}
public void setmailid(String mailid) {
	setemail.sendKeys(mailid);
}
	public void setpassword(String pwd) {
		setpwd.sendKeys(pwd);
	
}
	public void clicklogin() {
		clicksubmit.click();
	}
	public WebElement linktext() {
		return linktext;
	}
	public void setRegister() {
		txtRegister.click();
	}
	
	public WebElement dropdown() {
		return setdropdown; 
	}
	public void setFirstname(String fname) {
		txtfname.sendKeys(fname);
	}
	public void setlname(String lname) {
		txtlname.sendKeys(lname);
	}
	public void  setphone(String phone) {
		txtphone.sendKeys(phone);
	}
	public WebElement year() {
		return setyear;
	}
	public WebElement month() {
		return setmonth;
	}
	public WebElement date() {
		return setdate;
	}
	public void RDbtn2() {
		radiobutton2.click();
	}
	public WebElement  licenceperiod() {
		return setlicencePeriod;
	}
	
	public WebElement occuption() {
		return setoccupation;
	}
	public void setaddress(String address) {
		txtaddress.sendKeys(address);
	}
	public void setcity(String city) {
		txtcity.sendKeys(city);
	}
	public void setcountry(String country) {
		txtcounty.sendKeys(country);
	}
	public void setpin(String pin) {
		txtPINcode.sendKeys(pin);
	}
	public void setemail(String email) {
		txtemail.sendKeys(email);
	}
	public void setepwd(String pwd) {
		txtpwd.sendKeys(pwd);
	}
	public void setcpwd(String cpwd) {
		txtcpwd.sendKeys(cpwd);
	}
	public void clicksub() {
		btnsubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	

