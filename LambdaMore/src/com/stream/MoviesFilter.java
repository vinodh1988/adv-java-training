package com.stream;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MoviesFilter {
   public static void main(String n[]) {
	   try {
		    Stream<String> stream = Files.lines(Paths.get("e:\\movies.csv"));
	        //stream.forEach(MoviesFilter::processData);
		    stream.filter(MoviesFilter::checkGross).forEach(MoviesFilter::processData);
	   }
	   catch(Exception e){
		   
	   }
   }
   
   public static void processData(String x) {
	   String[] n=x.split(",");
	   System.out.println(n[0]+"  "+n[2]+" "+n[6]);
   }
   
   public static boolean checkGross(String x) {
	   String items[]=x.split(",");
	   //System.out.println(items[0]);
	   try {
	   float result = Float.parseFloat(items[6].replace("$", ""));
	   if(result>300)
		   return true;
	   else
		    return false;
	   }
	   catch(NumberFormatException e) {
		   return false;
	   }
   }
}
