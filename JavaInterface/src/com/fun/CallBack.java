package com.fun;

public interface CallBack {
   public void process(String n);
  
   default void adhoc() {
	   System.out.println("Adhoc method");
   }
   
   static void adhoc2() {
	   System.out.println("Static method");
   }
}

//functional interface -- interfaces with only one abstract method [it can have default methods]
