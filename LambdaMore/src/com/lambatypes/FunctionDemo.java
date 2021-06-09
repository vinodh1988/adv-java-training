package com.lambatypes;

import java.util.function.Function;

public class FunctionDemo {
   public static void main(String[] args) {
	  Function<String,Integer> lengthprovider= x -> x.length();
	  
	  
	  Integer result =lengthprovider.apply("computer science");
	  
	  System.out.println(result);
   }
}
