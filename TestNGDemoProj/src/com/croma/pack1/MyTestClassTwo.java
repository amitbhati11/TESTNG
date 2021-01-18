package com.croma.pack1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestClassTwo {

	@BeforeMethod(alwaysRun=true)
	public void runBeforeEveryMethod(){
		System.out.println(" The annotated method will be run before each test method");
	}
	
	
	@Test(description="Second User registration first" , enabled=true , groups={"register","Sanity","Regression"})
	public void register(){
		System.out.println("User register...class2");
	}
	
	@Test(description="Second login with newly created cred..", dependsOnMethods={"register"} , groups={"login1","Sanity","Regression"})
	public void login() throws Exception{
		System.out.println("Second user login into the page...class2");
//		throw new Exception();

	}
	
	@Test(description="selecting mobile category...class2", dependsOnMethods={"login"} , groups={"selectCategory","Sanity","Regression"})
	public void selectCategory() throws Exception{
		System.out.println("selecting mobile category...class2");
//		throw new Exception();
	}
	
	@Test(description="buy mobile ...class2", dependsOnMethods={"selectCategory"} , groups={"buyMobile","Sanity","Regression"})
	public void buyMobile(){
		System.out.println("Buying HTC android mobile...class2");
	}
	
	
	@Test(description="fill Address Details ...class2", dependsOnMethods={"buyMobile"} , groups={"buyMobile","Sanity","Regression"})
	public void fillAddressDetails(){
		System.out.println("Filling shipping details...class2");
	}
	
	@Test(description="makePayment ...class2", dependsOnMethods={"fillAddressDetails"} , groups={"makepayment","Sanity","Regression"})
	public void makePayment(){
		System.out.println("Making payment through creadit cards...class2");
	}
	
}
