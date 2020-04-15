package junit_framework;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Junit_With_Webdriver<TestInfo> {


	static WebDriver driver;
	static String filepath="drivers//";
	String url="http://facebook.com";
	
	
	
	@Test
	public void Tc001_Singup_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		System.out.println("Singup link verified");
	}
	
	
	@Test
	public void Tc002_SingIn_link()
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		System.out.println("Login link verified");
	}
	
	
	@Test
	public void Tc003_Messenger_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger link verified");
	}
	
	
	
	@BeforeClass
	static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", filepath+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	static void tearDownAfterClass() throws Exception 
	{
		//Close browser
		driver.close();
	}

	@Before
	void setUp() throws Exception
	{
		driver.get(url);
	}

	@After
	void tearDown(TestInfo testInfo) throws Exception 
	{
		

		//Capture screen and converting into file format.
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dumping file into local utilities..
		FileUtils.copyFile(src, new File("screens\\"  +".png"));
	}



}
