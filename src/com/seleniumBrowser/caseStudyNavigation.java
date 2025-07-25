package com.seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class caseStudyNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.navigate().to("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
		driver.navigate().back();
		System.out.println("Navigated back to: " + driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("Navigated forward to: " + driver.getCurrentUrl());
		
		driver.navigate().to("http://www.bing.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
		driver.navigate().refresh();
		System.out.println("Refreshed page: " + driver.getTitle());
		
		driver.navigate().to("https://www.freecrm.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
		driver.navigate().to("http://www.half.ebay.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		
		driver.quit();
	}
}
