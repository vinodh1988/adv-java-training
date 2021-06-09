package com.stream;

import java.util.stream.Stream;

public class StreamDemo {
   public static void main(String n[]) {
	   String []names= {
			   "Jack","Harry","Peter","Johny","Kenny","Roger"
	   };
	   
	   Stream<String> stream =Stream.of(names);
	   
	   stream.forEach(x->System.out.println(x));
   }
}
