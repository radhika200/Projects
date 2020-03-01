package facebook_home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run
{

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
				System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();  		//Launch browser
				driver.get("https://www.facebook.com/"); 		//Load webpage
				driver.manage().window().maximize();    	//maximize browser window
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Facebook_signpage_with_pagefactory obj=new Facebook_signpage_with_pagefactory(driver);
		obj.inputs("radhika", "beeram");
		
		

	}

}
