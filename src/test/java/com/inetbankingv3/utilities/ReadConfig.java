package com.inetbankingv3.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src= new File("./Configuration/confic.properties");
		try {
		FileInputStream fis=new FileInputStream(src);	
		 pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e) {
		System.out.println("Exception"+e.getMessage());	
		}
	}
	public String getapplication() {
	String url=pro.getProperty("baseURL");
	return url;

	}
	public String getusername() {
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;
	}
	public String getchrome() {
		String chrome=pro.getProperty("chromepath");
		return chrome;
	}
	public String getfirefox() {
		String firefox=pro.getProperty("firefoxpath");
		return firefox;
	}
	
	
	
	
	
	}
		
	
