package com.stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class BirthDataRead {
   public static void main(String []args) {
	   try {
		    Stream<String> stream = Files.lines(Paths.get("e:\\birthplace.csv"));
	        stream.forEach(x->System.out.println(x));
	   }
	   catch(Exception e){
		   
	   }
   }
}
