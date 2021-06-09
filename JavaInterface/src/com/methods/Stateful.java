package com.methods;

public class Stateful {
  String activity;
  public Stateful(String activity) {
	  this.activity=activity;
  }
  
  public void perform(String speed)
  {
	  System.out.println("Performing Activity "+ activity+ "  "+speed);
  }
  
}
