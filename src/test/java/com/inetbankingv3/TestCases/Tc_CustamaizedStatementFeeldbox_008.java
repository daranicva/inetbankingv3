package com.inetbankingv3.TestCases;

import org.testng.annotations.Test;

import com.inetbankingv3.pageobjects.CustamizedStatement;
import com.inetbankingv3.pageobjects.LoginPage;

public class Tc_CustamaizedStatementFeeldbox_008 extends Baseclass {
	
	@Test
	public void fealdbox() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		logger.info("user name entered");
		lp.setpassword(password);
		logger.info("user password entered");
		lp.Setbtnlogin();
		CustamizedStatement cs=new CustamizedStatement(driver);
		cs.clickCustamized();
		cs.setaccount("abc");
	    String actualFieldText	=cs.fieldmsg().getText();
	    System.out.println(actualFieldText);
		String expectedFieldText="Characters are not allowed";  //Characters are not allowed
		if(expectedFieldText.equals(actualFieldText)==true)
		logger.info("testcase pass");
		else {
			logger.info("testcase fail");
		}
		
		cs.clearaccountfield();
		Thread.sleep(2000);
		cs.setaccount("@#$%");
	    String ActualFieldText	=cs.fieldmsg().getText();
	    System.out.println(actualFieldText);
		String ExpectedFieldText="Characters are not allowed";  //Characters are not allowed
		if(expectedFieldText.equals(actualFieldText)==true)
		logger.info("testcase pass");
		else {
			logger.info("testcase fail");
		}
		
			
		
	}
	 
		
	

}
