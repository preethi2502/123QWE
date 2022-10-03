package com.selenium.indata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver; // null driver

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN\\eclipse-workspace\\new\\ZSelenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("invalid: check the browser name");
		}
		driver.manage().window().maximize();

		return driver;
	}

	// get
	public static void openUrl(String url) {
		driver.get(url);
	}

	// close
	public static void closethepage() {
		driver.close();

	}

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	public static void rightclick(WebElement target) {
		Actions ac = new Actions(driver);
		ac.contextClick(target).build().perform();
	}

	// quit
	public static void quitthebrowser() {
		driver.quit();
	}

	// click
	public static void clickonElement(WebElement ele) {
		ele.click();
	}

	// send keys
	public static void inputValues(WebElement e, String value) {
		e.sendKeys(value);
	}

	// gettext
	public static void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);

	}

}
