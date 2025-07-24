package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoGetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com/");
		driver1.manage().window().maximize();
		
		String currentUrl1 = driver1.getCurrentUrl();
		System.out.println(currentUrl1);

		driver1.quit();
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://demo.opencart.com/");
		driver2.manage().window().maximize();
		
		String currentUrl2 = driver2.getCurrentUrl();
		System.out.println(currentUrl2);

		driver2.quit();
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.bing.com");
		driver3.manage().window().maximize();
		
		String currentUrl3 = driver3.getCurrentUrl();
		System.out.println(currentUrl3);

		driver3.quit();
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.freecrm.com/");
		driver4.manage().window().maximize();
		
		String currentUrl4 = driver4.getCurrentUrl();
		System.out.println(currentUrl4);

		driver4.quit();
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.half.ebay.com");
		driver5.manage().window().maximize();
		
		String currentUrl5 = driver5.getCurrentUrl();
		System.out.println(currentUrl5);

		driver5.quit();
	}

}
