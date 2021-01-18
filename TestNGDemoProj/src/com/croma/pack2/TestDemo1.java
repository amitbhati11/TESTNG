package com.croma.pack2;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.croma.pack1.MyTestClass;

public class TestDemo1 {

	MyTestClass mtc = null;
	
	@Parameters({ "browser", "qa_env" })
	@BeforeClass(alwaysRun=true )
	public void runBeforeClass(@Optional("CH") String browser, @Optional("10.10.1.11") String qa_env){
		
		System.out.println("The annotated method will be run once before the first test method in the current class is invoked");
		System.out.println(browser +" "+qa_env);
		
	}
   
	@Test(description="Demo New user registration",  groups={"registration","Sanity","Regression"})
	public void register(){
		System.out.println("User register...");
		Reporter.log("uesr rohit and pwd 1234");
	}
	
	@Test(description="Demo login with newly created cred..", dependsOnMethods={"register"} , groups={"login","Sanity","Regression"})
	public void login() throws Exception{
		System.out.println("login into the page...");
//		throw new Exception();
	}
	
	@Test(description="Demo selecting mobile category",dependsOnMethods={"login"} , groups={"selectCategory","Regression"})
	public void selectCategory(){
		System.out.println("selecting mobile category...");
	}
	
	
	@Test(description="Demo Buying HTC android mobile",dependsOnMethods={"selectCategory"}, groups={"buymobile","Regression"})
	public void buyMobile(){
		System.out.println("Buying HTC android mobile...");
		
	}
	
}
