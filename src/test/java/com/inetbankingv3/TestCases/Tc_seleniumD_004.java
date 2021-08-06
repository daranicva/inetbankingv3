package com.inetbankingv3.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.inetbankingv3.pageobjects.LoginPage;
import com.inetbankingv3.pageobjects.Selenium;

public class Tc_seleniumD_004 extends Baseclass {
	Actions ac;
	@Test
	public void seleniumd() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.Setbtnlogin();
		Selenium sc=new Selenium(driver);
		sc.clickselenium();
		sc.dragdrop();
		 ac=new Actions(driver);
		ac.dragAndDrop(sc.dragbank(), sc.draganddropbank()).perform();
		ac.dragAndDrop(sc.dragamount(), sc.dropamount()).perform();
		Thread.sleep(2000);
		driver.navigate().back();
		sc.clickselenium();
		sc.Clickscrollbar();
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", sc.clickvbScript());
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",sc.SAP());
		
		
		sc.SAP().click();
		
	}
}
