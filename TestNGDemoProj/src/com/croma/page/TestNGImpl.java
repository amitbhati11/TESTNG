package com.croma.page;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGImpl {

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before mthods..");
	}
	
	@Test(description="Login with valid user" , groups={"login","Sanity","Regression"})
	public void login(){
		System.out.println("login with credentials");
	}
	
	@Test(description="Select Mobile category", dependsOnMethods="login",groups={"selectCategory","Sanity","Regression"})
	public void selectCategory() throws Exception{
		System.out.println("Mobile category");
//		throw new Exception();
	}
	
	
	@Test(description="Select Nokia mobile", dependsOnMethods="selectCategory",groups={"Regression"})
	public void selectItem(){
		System.out.println("Nokia Mobile");
	}
	
	@Test(description="Buying selected item", dependsOnMethods="selectItem",groups={"Regression"})
	public void buyItem(){
		System.out.println("buying mobile");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("close all connections");
	}

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional("Chrome") String browser){
		System.out.println("Load property files , created DB connection"+" Browsername: "+browser);
	}
	
}
