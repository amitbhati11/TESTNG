package com.croma.example;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	

	@Parameters({"browser"})
	@BeforeClass(groups={"Regression","Sanity"})
	public void beforeClass(@Optional("Chrome") String browser){
	    System.out.println("browser name   "+ browser);
		System.out.println("The annotated method will be run once before the first test method in the current class is invoked");
	
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("closing all resource ..");
	}
	
	@Test(description="Create user with valid details", groups={"Regression","Sanity","createUser"})
	public void createUser(){
		System.out.println("User created");
		Reporter.log("login with cred shail and pwd: xyz");
	}
	
	@Test(description="Login with correct credetials", dependsOnMethods="createUser", groups={"Regression","Sanity","login"})
	public void login(){
		System.out.println("logined in");
	}

	@Test(description="Selecting electronic category", dependsOnMethods="login",groups={"Regression","Sanity"})
	public void selectCategroy() throws Exception{
		Reporter.log("Selection electronic category");
		System.out.println("selected Electronics");
//		throw new Exception("my exception");
	}
	
	
	@Test(description="Buying item" , dependsOnMethods="selectCategroy",groups={"Regression","Sanity"})
	public void buyItem(){
		System.out.println("going to buy");
	}
	
	@Test(description="Fill shpiing detils", dependsOnMethods="buyItem",groups={"Regression","Sanity"})
	public void shippingDetails(){
		System.out.println("Filling address details");
	}
	
}
