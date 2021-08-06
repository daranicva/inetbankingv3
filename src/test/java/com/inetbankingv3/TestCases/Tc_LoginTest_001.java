package com.inetbankingv3.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbankingv3.pageobjects.LoginPage;

public class Tc_LoginTest_001  extends Baseclass {
	
	@Test 
	public void logintest() {
		driver.get(baseURL);
		logger.info("url open");
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		logger.info("user name entered");
		lp.setpassword(password);
		logger.info("password entered");
		lp.Setbtnlogin();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			
		}
		else {
			Assert.assertTrue(false);
			
		}
		lp.setbtnlogout();
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
