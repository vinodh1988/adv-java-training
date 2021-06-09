package com.lambatypes;

import java.util.function.Predicate;

public class PredicateDemo {
	
   public static void main(String[] args) {
	   Predicate<String> lengthValidator= (data)-> {
		    if(data.length()>15)
		    	return true;
		    else
		    	return false;
	   }  ;
	   
	   
	   Predicate<Integer> even = (data)-> data%2==0;
	   
	   if(lengthValidator.test("This is a very very big string"))
		   System.out.println("Validation Passed");
	   
	   
	   if(even.test(343562))
		    System.out.println("It is even");
    }
}

