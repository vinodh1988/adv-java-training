package com.first;

public class Person extends Object {
	
     static {
        System.out.println("This is loaded first and only once");	 
     }
     
	 private String name;
     private static int instances;
	 public Person() {
		 this.name = "Noname";
		 instances++;
	}
	 
	 public Person(String name) {
		 this.name =name;
		 instances++;
	 }
	 public void show() {
		 System.out.println("Name "+this.name);
	 }
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	    System.out.println("object with name "+ this.name + "is deleted");
	    
	}
	
	public static void CallThis() {
		System.out.println("Number of instances "+instances);
	}
	 
	 

}
