package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	// Loading Properties file
	public TestBase() {
		
		try {
			prop =new Properties();
		FileInputStream file = new FileInputStream(
				"F:\\MGK\\workspace\\ComTest\\src\\main\\java\\com\\amazon\\qa\\config\\config.properties");
		prop.load(file);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
	
     //Browser Initialization
	public static void initialize(){
		
	 String Browsername=prop.getProperty("browser");
	 System.out.println(Browsername);
	 if(Browsername.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
	
	 
	 //Maximizing the Window
	 driver.manage().window().maximize(); 
	 //delete Browser cookies
	 driver.manage().deleteAllCookies();
	 //set page load time
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 
	 driver.get(prop.getProperty("Url"));
	
	
	}
	
}
  
  
