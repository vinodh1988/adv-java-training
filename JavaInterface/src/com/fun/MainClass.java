package com.fun;

public class MainClass {
   public static void main(String n[]) {
	  /* class Temp implements CallBack{
		   public void process(String data) {
			   System.out.println("Processing "+data);
		   }
	   }
	   Task.taskExecution(new Temp());*/
	   
	 /*  Task.taskExecution(new CallBack() {
		   public void process(String data) {
			   System.out.println("Processing "+data);
		   }
		   public void funny() {}
	   });
	   */
	   Task.taskExecution((data)->{
		   System.out.println("Processing "+data);
	   });
	   
	   CallBack.adhoc2();
   }
}
