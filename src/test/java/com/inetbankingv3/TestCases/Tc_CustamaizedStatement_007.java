package com.inetbankingv3.TestCases;

import org.testng.annotations.Test;

import com.inetbankingv3.pageobjects.CustamizedStatement;
import com.inetbankingv3.pageobjects.LoginPage;

public class Tc_CustamaizedStatement_007 extends Baseclass {
	@Test
	public  void statement() {
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		logger.info("user name entered");
		lp.setpassword(password);
		logger.info("user password entered");
		lp.Setbtnlogin();
		CustamizedStatement cs=new CustamizedStatement(driver);
		cs.clickCustamized();
		cs.setaccount("1234");
		cs.fromdate("11091990");
		cs.todate("01012001");
		cs.minimum("100000");
		cs.submit();
		String test =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(test);
		String actualtext="Account does not exist";
		if(test.equals(actualtext)==true) {
			logger.info("test case pass");
		}
		else {
			logger.info("test case fail");
		}
		
	}

}
