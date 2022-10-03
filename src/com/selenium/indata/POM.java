package com.selenium.indata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM {
	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement email;
	
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(xpath="eghfghj/")
	private WebElement login;
	
	
	

}
