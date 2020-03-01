package global_variables;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusing_Global_Variables {

	public static void main(String[] args) {
		
		
		//Locate chrome browser in current system
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com"); //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		
		
		driver.findElement(Locators.Signin_email_locator).clear();
		driver.findElement(Locators.Signin_email_locator).sendKeys("9030248855");
		
		driver.findElement(Locators.Signin_pwd_locator).clear();
		driver.findElement(Locators.Signin_pwd_locator).sendKeys("hello");
		
		driver.findElement(Locators.Singin_Login_btn_locator).click();
		
	}

}