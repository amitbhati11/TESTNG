package com.croma.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeSuite
	public void beforeSuite(){
		
		System.out.println("Before Suite use for loading pre-requisite objects..");
		
	}
	
	@BeforeTest
	public void beforeTest(){
		
		System.out.println("Before Test use for loading pre-requisite objects..");
		
	}
	
	
	@BeforeClass
	public void beforeClass(){
		
		System.out.println("Before calss use for loading pre-requisite objects..");
		
	}
	
    @AfterClass	
    public void afterClass(){
		
		System.out.println("After class use for unloading pre-requisite objects..");
		
	}
	
    @BeforeMethod	
    public void beforeMethod(){
		
		System.out.println("Before Method use for unloading pre-requisite objects..");
		
	}
    
    
    @Test(description="Creating valid user")
	public void createUser() {

		System.out.println("Creating valid user..");

	}

    @Test(description="Login with valid credentials", dependsOnMethods="createUser")
	public void login() {

		System.out.println("login with credentials..");

	}

    @Test(description="Selecting mobile category",dependsOnMethods="login")
	public void selectCategory() throws Exception {

		System.out.println("Selecting mobile category..");

//		throw new Exception();
	}

    @Test(description="Goin to buy mobile ",dependsOnMethods="selectCategory")
	public void buyItem() {

		System.out.println("Buying mobile..");

	}

}
