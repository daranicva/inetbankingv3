package com.inetbankingv3.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Selenium
 {
	WebDriver ldriver;
	
	public Selenium(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a" )
	WebElement Selenium;
	
	@FindBy(how=How.XPATH,using="//a[text()='Drag and Drop Action']")
	WebElement DragDrop;
	
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a")
	WebElement bank;
	
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li")
	WebElement bankdrop;
	
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a")
	WebElement Dragamount;
	
	@FindBy(how=How.XPATH,using="/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li")
	WebElement Dropamount;
	
	 @FindBy(how=How.XPATH,using="//a[text()='Scrollbar Demo']")
	WebElement scroll;
	 @FindBy(how=How.XPATH,using="//a[text()='VBScript']")
	 WebElement vbScript;
	 @FindBy(how=How.XPATH,using="//a[text()='SAP MM']")
	 WebElement sap;
	 
	public void clickselenium() {
		Selenium.click();
	}
	public void dragdrop() {
		DragDrop.click();
	}
	public WebElement dragbank() {
		return bank;
	}
	public WebElement draganddropbank() {
	
	return bankdrop;
	}
	public WebElement dragamount()
	{
		return Dragamount;
	}
	public  WebElement dropamount() {
		return Dropamount; 
	}
	public void Clickscrollbar() {
		scroll.click();
	}
	public WebElement clickvbScript() {
		return vbScript;
	}
	public WebElement SAP() {
		return sap;
	}
		

	
	
	
	
	
	}	
	
	
	
	


