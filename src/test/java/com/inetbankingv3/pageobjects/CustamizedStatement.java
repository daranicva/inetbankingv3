package com.inetbankingv3.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustamizedStatement {
	WebDriver ldriver;

	public CustamizedStatement(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver , this);
	}
	@FindBy(xpath="/html/body/div[3]/div/ul/li[14]/a")
	WebElement Custamized;
	@FindBy(name="accountno")
	WebElement txtaccount;
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	WebElement fromdate;
	@FindBy(name="tdate")
	WebElement toodate;
	@FindBy(name="amountlowerlimit")
	WebElement minimum;
	@FindBy(name="numtransaction")
	WebElement nooftransation;
	@FindBy(name="AccSubmit")
	WebElement submit;
	@FindBy(id="message2")
	WebElement fieldmsg;
	public void clickCustamized() {
		Custamized.click();
	}
		public void setaccount(String number) {
		txtaccount.sendKeys(number);
		
		}
		public void clearaccountfield() {
			txtaccount.clear();
		}
		public void fromdate(String frdate) {
			//fromdate.click();
			fromdate.sendKeys(frdate);
		}
		public void todate(String todate) {
			toodate.sendKeys(todate);
		}
		public void minimum(String value) {
			minimum.sendKeys(value);
		}
		public void  nooftransation(String value1) {
			 nooftransation.sendKeys(value1);
		}
		public void submit() {
			submit.click();
		}
		public WebElement fieldmsg() {
			return fieldmsg;
		}
		
		
			
		
	
}
