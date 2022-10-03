package com.selenium.indata;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Browser {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\new\\ZSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("count " + allLinks.size());

		for (WebElement links : allLinks) {
			String link = links.getAttribute("href");

			URL url = new URL(link);
			URLConnection con = url.openConnection();
			HttpURLConnection http = (HttpURLConnection) con;
			int responseCode = http.getResponseCode();
			if (responseCode >= 400) {
				System.out.println("broken " + responseCode +link);
			}

		}

	}

}
