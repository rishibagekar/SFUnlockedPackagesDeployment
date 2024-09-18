package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public static ExtentReports extent = new ExtentReports();
	static ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");

	protected static WebDriver driver;

	public static void openbrowser() {

		extent.attachReporter(spark);
		System.setProperty("webdriver.chrome.driver",
				"/opt/hostedtoolcache/setup-chrome/chromedriver/127.0.6533.119/x64/chromedriver");

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
