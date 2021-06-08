package com.first;

public class OnlyOne {
   private  String connect=null;
   private static  OnlyOne connection; 
   
   static {
	   String connect=Resource.getConnection();
	   connection=new OnlyOne();
	   connection.connect=connect;
   }
   
   private OnlyOne() {}
 
   public static OnlyOne getOnlyOne() {
	   return connection;
   }
   
   public void show() {
	   System.out.println("Connect data "+connect);
   }
  
}
