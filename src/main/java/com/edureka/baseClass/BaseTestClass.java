package com.edureka.baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;

import com.edureka.utility.BaseUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	String browserName;
	String urlInvoked;
	
	public BaseTestClass()
	{
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(BaseUtility.CONFIG_FILE_PATH);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void initializeBrowser()
	{
		browserName = prop.getProperty("browser");
		urlInvoked = prop.getProperty("url");
		logger = Logger.getLogger("edureka");
		PropertyConfigurator.configure("log4j.properties");
		
		System.out.println("******BrowserName*********  "+browserName);
		System.out.println("******URL INVOKED*********  "+urlInvoked);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions capability = new ChromeOptions();
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
			driver = new ChromeDriver(capability);
			
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
			
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		
		} else {
			System.out.println("Please Check Your Browser. You have enter wrong browser......");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(BaseUtility.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(BaseUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(urlInvoked);
		
		
		
	}
	

}
