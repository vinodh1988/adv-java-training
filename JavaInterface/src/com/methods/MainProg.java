package com.methods;

public class MainProg {
   public static void main(String[] args) {
	    //type1
	   Process.doTask(
	   (activity)->{
	    	System.out.println("Doing "+activity);
	         }, 
	   "Programming");
	    
	    //type2 - method reference -- static method
	    Process.doTask(General::printing,"Ebook");
	    
	    //type3 - method reference -- instance method
	    
	    Process.doTask(new Stateful("testing")::perform,"Faster");
	    
	    
    }
}
