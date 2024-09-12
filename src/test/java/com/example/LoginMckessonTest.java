package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import com.example.BaseClass;
import com.example.LoginPageMKH;

public class LoginMckessonTest extends BaseClass {

	private static Logger Logger = LogManager.getLogger(LoginMckessonTest.class);

	@BeforeMethod
	public void browserlaunch() throws InterruptedException {

		openbrowser();
		Thread.sleep(2000);
		extent.flush();

	}

	@Test
	public void loginprocess() throws InterruptedException {

		ExtentTest test = extent.createTest("Login Process Verification");

		LoginPageMKH LP = new LoginPageMKH(driver);
		Logger.info("Add  credentials");

		LP.username();
		LP.Password();
		LP.LoginBTW();

		Logger.info("Login done now ");
		Thread.sleep(2000);
		extent.flush();
	}

}
