package com.inetbankingv3.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inetbankingv3.pageobjects.InsuranceProject;
import com.inetbankingv3.pageobjects.LoginPage;

public class Tc_InsuranceProject_005 extends Baseclass{
	    
	@Test
	
       public void insurance() {
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		logger.info("user name entered");
		lp.setpassword(password);
		logger.info("user password entered");
		lp.Setbtnlogin();
		InsuranceProject ip=new InsuranceProject(driver);
		
		ip.clickinsurance();
		logger.info("clicked life insurance Webelement");
		ip.setmailid("qwert@gmail.com");
		logger.info("email id entered");
		ip.setpassword("qwert");
		logger.info("password entered");
		ip.clicklogin();
		logger.info("submit bitton entered");
		ip.linktext();
		String Actual=ip.linktext().getText();
		System.out.println(Actual);
		String Expected="Broker Insurance WebPage";
		if (Actual.equals(Expected)==true) {
		//	System.out.println("pass");
			logger.info("test case pass");
		}
		else {
			
		//	System.out.println("fail");	
			logger.warn("testcase fail");
		}
		driver.navigate().back();
		driver.navigate().back();
		WebElement logout =driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a"));
		logout.click();
		
	 }
}
