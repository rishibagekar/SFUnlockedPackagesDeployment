package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	protected static WebDriver driver;

	public static void openbrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\eyenims\\Downloads\\Maven_Selenium\\demo\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		try {

			driver.get("https://ability-data-1503--cgatqa.sandbox.my.salesforce.com/");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
