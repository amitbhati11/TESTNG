package com.croma.pack1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestClass {


	


	@Test(description="New user registration", enabled=true, groups={"registration","Sanity","Regression"})
	public void register(){
		System.out.println("User register...");
//		throw new Exception();
	}
	
	@Test(description="login with newly created cred..", dependsOnMethods={"register"} , groups={"login","Sanity","Regression"})
	public void login(){
		System.out.println("login into the page...");
		
	}
	
	@Test(description="selecting mobile category",dependsOnMethods={"login"} , groups={"selectCategory","Regression"})
	public void selectCategory(){
		System.out.println("selecting mobile category...");
	}
	
	
	@Test(description="Buying HTC android mobile",dependsOnMethods={"selectCategory"}, groups={"buyMobile","Regression"})
	public void buyMobile(){
		System.out.println("Buying HTC android mobile...");
		
	}
	
	
	@Test(description="Filling shipping details", dependsOnMethods="buyMobile", groups={"Regression"})
	public void fillAddressDetails() throws Exception{
		System.out.println("Filling shipping details...");
//		throw new Exception();
	}
	

	@Test(description="Making payment through creadit cards", dependsOnMethods="fillAddressDetails", enabled=true,groups={"Regression"})
	public void makePayment(){
		System.out.println("Making payment through creadit cards...");
	}
	
	
	
	@Parameters({"browser"}) //chrome
	@BeforeClass
	public void runBeforeClass(@Optional("Firefox") String browser){
	    System.out.println("browser name"+ browser);
		System.out.println("The annotated method will be run once before the first test method in the current class is invoked");
	
	}
	
/*	@DataProvider
	public Object[][] dataProvider(){
		
		
		return 
	}*/
	
}
