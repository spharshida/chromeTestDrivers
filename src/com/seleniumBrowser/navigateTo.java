package com.seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://login.yahoo.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
