package com.first;

public class MainRunner {
   public static void main(String n[]) {
	   
	 // Person.CallThis();
	   new Person();
	   new Person();
	   new Person().show();
	   Person.CallThis();
	   OnlyOne obj = OnlyOne.getOnlyOne();
	   System.out.println(obj.hashCode());
	   obj.show();
	   OnlyOne obj1 = OnlyOne.getOnlyOne();
	   System.out.println(obj1.hashCode());
	   obj.show();
   }
   
   /*
    * 
    * 
    *   try {
		//	Class.forName("com.first.Person");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    *   Person p,p1,p2;
	   
	   p=new Person();
	   
	   p1=new Person("Rahul");
	   
	   p2=new Person("Kiran");
	   
	   p=new Person("Jacques");
	   
	   p1=p;
	   
	   new Person().show();
	   p2.show();
	   p1.show();
	   new Person("Zaheer").show();
	   System.gc();
    */
}
