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
				"/opt/hostedtoolcache/setup-chrome/chromedriver/128.0.6613.137/x64/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {

			driver.get("https://ability-data-1503--cgatqa.sandbox.my.salesforce.com/");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
