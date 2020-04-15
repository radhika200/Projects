package facebook_home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_signpage_with_pagefactory
{

	WebDriver driver;

	public Facebook_signpage_with_pagefactory(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath="//input[@id='u_0_m']") public WebElement firstname;
	@FindBy(xpath="//input[@id='u_0_s']") public WebElement surname;
	
	public void inputs(String name,String lastname)
	{
		firstname.clear();
		firstname.sendKeys(name);
		surname.clear();
		surname.sendKeys(lastname);
	}

}
