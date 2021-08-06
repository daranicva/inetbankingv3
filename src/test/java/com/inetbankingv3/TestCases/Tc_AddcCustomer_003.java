package com.inetbankingv3.TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbankingv3.pageobjects.AddCustomerpage;
import com.inetbankingv3.pageobjects.LoginPage;

public class Tc_AddcCustomer_003 extends Baseclass {
	
	@Test
	public void addcustomer() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.Setbtnlogin();
		Thread.sleep(3000);
		AddCustomerpage addcust=new AddCustomerpage(driver);
		
		addcust.clickAddnewCustomer();
		addcust.custname("siva");
		addcust.custGender("male");
		addcust.custdob("01", "01", "1990");
		Thread.sleep(3000);
		addcust.custaddress("india");
		addcust.custcity("hyd");
		addcust.custstate("telangana");
		addcust.pincode("500036");
		addcust.custcell("9999999999");
		addcust.custmailid("d56df5@gmail.com");
		addcust.custpassword("sdwwsdsd");
		addcust.clicksubmit();
		Thread.sleep(3000);
		boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (result=true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
		
		
		
	}

}
