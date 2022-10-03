package com.selenium.indata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM1 {

	public static WebDriver driver;
	
	
	@FindBy(xpath="//a[@test='test']")
	private WebElement email;
	
	
	@FindBy(id="test")
	private WebElement  pass;
	
	
	
	
	
	
	
	
	
}
