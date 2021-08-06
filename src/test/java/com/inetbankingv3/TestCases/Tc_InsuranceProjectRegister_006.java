package com.inetbankingv3.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inetbankingv3.pageobjects.InsuranceProject;
import com.inetbankingv3.pageobjects.LoginPage;

public class Tc_InsuranceProjectRegister_006 extends Baseclass {
	@Test
	public void register() {
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		logger.info("user name entered");
		lp.setpassword(password);
		logger.info("user password entered");
		lp.Setbtnlogin();
		InsuranceProject ip=new InsuranceProject(driver);
		ip.clickinsurance();
		logger.info("clicked insurance project");
		ip.setRegister();
		logger.info("clicked Register");
		ip.dropdown().click();
		logger.info("clicked on the Dropdown box");
          
		Select select=new Select(ip.dropdown());
		select.selectByVisibleText("Doctor");
		logger.info("Selected Doctor");
		ip.setFirstname("siva");
		logger.info("first name entered");
		ip.setlname("darani");
		logger.info("last name entered");
		ip.setphone("12345");
		logger.info("phone number entered");
		
		ip.year().click();
		Select select1=new Select(ip.year());
		select1.selectByVisibleText("1990");
		logger.info("year entered");
		
		ip.month().click();
		Select select2=new Select(ip.month());
		select2.selectByVisibleText("January");
		logger.info("month  entered");
		
		ip.date().click();
		Select select3=new Select(ip.date());
		select3.selectByVisibleText("1");
		logger.info("date entered");
		
		ip.RDbtn2();
		logger.info("radio btn2 selected");
		
		ip.licenceperiod().click();
		Select select4=new Select(ip.licenceperiod());
		select4.selectByVisibleText("80");
		logger.info("licence period entered");
		
		
		ip.occuption().click();
		logger.info("doctor selected");
		Select select5=new Select(ip.occuption());
		select5.selectByVisibleText("Doctor");
		logger.info("doctor selected");
		
		ip.setaddress("hyd");
		logger.info("address entered");
		
		ip.setcity("hyd");
		logger.info("city entered");
		
		ip.setcountry("india");
		logger.info("country entered");
		
		ip.setpin("1234");
		logger.info("pin entered");
		
		ip.setemail("siva@gmail.com");
		logger.info("mail entered");
		
		ip.setepwd("1234");
		logger.info("password entered");
		
		ip.setcpwd("1234");
		logger.info("conform password entered");
		
		ip.clicksub();
		logger.info("login entered");
		
		
	}

}
