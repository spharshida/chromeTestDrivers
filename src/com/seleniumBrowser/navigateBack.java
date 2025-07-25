package com.seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateBack {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		driver.navigate().to("https://login.yahoo.com/");
		System.out.println(url);
		
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}

}
