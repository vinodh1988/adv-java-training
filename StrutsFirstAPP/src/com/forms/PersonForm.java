package com.forms;

import org.apache.struts.action.ActionForm;

public class PersonForm extends ActionForm{
  private int sno;
  private String name;
  private String city;
  

public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
  
  
}
