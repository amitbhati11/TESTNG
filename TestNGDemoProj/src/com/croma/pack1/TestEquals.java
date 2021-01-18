package com.croma.pack1;

public class TestEquals {

	String n ="Sachin";
	int age = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TestEquals t1 = new TestEquals();
	TestEquals t2 = new TestEquals();;
	t1.n = "Hello";
	
	
	String n1 ="sachin";
	String n2 ="sachin";
	
	if(t1.equals(t2))
		System.out.println("objects are equals");
	if(t1==t2){
		System.out.println("object are ==");
	}else{
		System.out.println("No match");
	}
		
		
	}

}
