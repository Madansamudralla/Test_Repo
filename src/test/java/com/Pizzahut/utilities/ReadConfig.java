package com.Pizzahut.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configurations/config.properties");
		
		try {
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);
			}
		catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
				
	}
	
	public String getApplicationURL() {
		
		String url = pro.getProperty("baseURL");
		
		return url;
		
	}
	
public String getUserName() {
		
		String username = pro.getProperty("username");
		
		return username;
		
	}
public String getPassword() {
	
	String password = pro.getProperty("password");
	
	return password;
	
}

public String getRemarks() {
	
	String remarks = pro.getProperty("remarks");
	
	return remarks;
	}

public String getChromepath() {
	
	String chromepath = pro.getProperty("chromepath");
	
	return chromepath;
	}
}
