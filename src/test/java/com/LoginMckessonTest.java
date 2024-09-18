package com;

import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 

public class LoginMckessonTest {

	private WebDriver driver;
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","/opt/hostedtoolcache/setup-chrome/chromedriver/127.0.6533.119/x64/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void logintoSalesforce(){
		driver.get("https://ability-data-1503--cgatqa.sandbox.my.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("rishikesh.bagekar@mckesson.com.cgatqa");
		driver.findElement(By.id("password")).sendKeys("Rishi@$039925");
		driver.findElement(By.id("loginBtn")).click();
	}

	@AfterTest
	public void tearDowb(){
		driver.quit();
	}
}
