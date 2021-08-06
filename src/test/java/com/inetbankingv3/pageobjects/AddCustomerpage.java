package com.inetbankingv3.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerpage {
	 WebDriver ldriver;
     
     public AddCustomerpage( WebDriver rdriver) {
   	  ldriver=rdriver;
   	  PageFactory.initElements( rdriver, this);
     }
    @FindBy(how=How.XPATH,using="//a[text()='New Customer']")
     WebElement linkAddcustomer;
    
    @FindBy(how=How.NAME,using="name")
    WebElement txtcustomer;
    
    @FindBy(how=How.NAME,using="rad1")
    WebElement rdGender;
    
    @FindBy(how=How.ID_OR_NAME,using="dob")
    WebElement txtdob;
    
    @FindBy(how=How.NAME,using="addr")
    WebElement txtaddress;
    
    @FindBy(how=How.NAME,using="city")
    WebElement txtcity;
   
    @FindBy(how=How.NAME,using="state")
    WebElement txtstate;
    
    @FindBy(how=How.NAME,using="pinno")
    WebElement txtpinno;
    
    @FindBy(how=How.NAME,using="telephoneno")
    WebElement txttelephoneno;
    
    @FindBy(how=How.NAME,using="emailid")
    WebElement txtmailid;
    
    @FindBy(how=How.NAME,using="password")
    WebElement txtpassword;
    
    @FindBy(how=How.NAME,using="sub")
    WebElement btnSubmit;
    
    public void clickAddnewCustomer() {
   	 linkAddcustomer.click();//password
    }
    public void custname(String cname) {
   	 txtcustomer.sendKeys(cname);
    }
    public void custGender(String cgender) {
   	 rdGender.click();
    }
    public void custdob(String mm,String dd,String yy) {
   	 txtdob.sendKeys(mm);
   	 txtdob.sendKeys(dd);
   	 txtdob.sendKeys(yy);
    }
    public void custaddress(String caddress) {
   	 txtaddress.sendKeys(caddress);
   	 
    }
    public void custcity(String ccity) {
   	 txtcity.sendKeys(ccity);
    }
    public void custstate(String cstate) {
   	 txtstate.sendKeys(cstate);
    }
    public void pincode( String cpincode) {
   	 txtpinno.sendKeys(String.valueOf(cpincode));
    }
    
    public void custcell(String cellno) {
   	 txttelephoneno.sendKeys(String.valueOf(cellno));
    }
    public void custmailid(String mail) {
   	 txtmailid.sendKeys(mail);
    }
    public void clicksubmit() {
   	 btnSubmit.click();
    }
    public void custpassword(String pwd) {
   	 txtpassword.sendKeys(pwd);
    }
    
    
    

    
    

}
