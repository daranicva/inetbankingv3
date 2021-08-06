package com.inetbankingv3.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.inetbankingv3.utilities.ReadConfig;

public class Baseclass {
ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getapplication();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeTest
	public void setup(String br) throws InterruptedException{
		logger=Logger.getLogger("banking");
		PropertyConfigurator.configure("Log4j.properties");
		if(br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",readconfig.getfirefox());
		driver=new FirefoxDriver();
		}
		else if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getchrome());
			driver=new ChromeDriver();
		}
		
		driver.get(baseURL);
		
	}
	@AfterTest
	public void teardown() {
		//driver.close();
	
		
	}

}
