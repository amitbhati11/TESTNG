package com.croma.example;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@Parameters({"browser"})
	@BeforeClass(groups={"Regression","Sanity"})
	public void beforeClass(@Optional("Firefox") String browser){
	    System.out.println("browser name   "+ browser);
		System.out.println("The annotated method will be ru0n once before the first test method in the current class is invoked");
	
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("closing all resource ..");
		
		
	}
	
	@Test(description="Create user for flipkart", groups={"Regression","Sanity"})
	public void createUser(){
		
		Reporter.log("Creating user with proper credentials");
		System.out.println("User created");
	}
	
	@DataProvider(name="dataProvider")
	@Test(description="Login with valid credentials", dependsOnMethods="createUser", groups={"Regression","Sanity","login"})
	public void login(String name, String age) throws Exception{
		
		Reporter.log("Login with correct user/pwd"+ name+" age: "+ age);
		System.out.println("logined in");
	}
	
	@Test(description="Selecting electronic category", dependsOnMethods="login",groups={"Regression","Sanity"})
	public void cselectCategroy() throws Exception{
		System.out.println("selected Electronics");
		Reporter.log("Selection electronic category");
		
//		throw new Exception("my exception");
	}
	
	@Test(description="Buying item" , dependsOnMethods="cselectCategroy", groups={"Regression"})
	public void buyItem(){
		System.out.println("going to buy");
	}
	
	
	@Test(description="Fill shpiing detils", dependsOnMethods="buyItem", groups={"Regression"})
	public void shippingDetails(){
		System.out.println("Filling address details");
	}
	
	@Test(description="Fill shpiing detils", dependsOnMethods="shippingDetails", dependsOnGroups={"Regression"})
	public void paymentDetails(){
		System.out.println("Filling Payment details..........................");
	}
	
	@DataProvider
	public Object[][] dataProvider(){
		String[][] cred = {{"Sachin", "Saurabh","Rohit"},{"10","20","30"}};
		return cred;
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Execute before any test method.");
	}
	
}
