package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Reader {

	public static Properties p;
	
	public Property_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\asus\\eclipse-workspace\\LA\\Maven_Project_7pm\\src\\main\\java\\com\\properties\\Data.properties");

		FileInputStream fis = new FileInputStream(f);

	    p = new Properties();

		p.load(fis);

	}

	public String getUrl() throws IOException {

		String url = p.getProperty("url");

		return url;
	}

	public String getUsername() throws IOException {

		String username = p.getProperty("username");

		return username;
	}

	public String getPassword() throws IOException {
		
		String password = p.getProperty("password");

		return password;
	}

}
