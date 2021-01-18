package com.croma.pack2;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestListener {

	@Test(description="login by the user",  groups={"login","Sanity","Regression"})
	public void testLogin() {
		System.out.println("Execution of Main test is carring on");
//		Reporter.log("Inside login method");
	}
	/*
	 * @BeforeMethod public void beforeMethod() {
	 * System.out.println("Execution of Before method is carring on"); }
	 */

	/*
	 * @AfterMethod public void afterMethod() {
	 * System.out.println("Execution of After method is carring on"); }
	 */

}
