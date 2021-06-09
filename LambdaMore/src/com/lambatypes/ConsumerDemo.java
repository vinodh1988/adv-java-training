package com.lambatypes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static List<String> global =new ArrayList<String>();
   public static void main(String[] args) {
	  Consumer<String> myconsumer= x -> {
		  global.add(x);
		  System.out.println("stored into the storage");
	  };
	 
	  myconsumer.accept("Jay");
	  
	  System.out.println(global);
	  
   }
}
