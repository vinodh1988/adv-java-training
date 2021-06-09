package com.lambatypes;

import java.util.function.Supplier;

public class SupplierDemo {
   public static void main(String n[]) {
	   Supplier<String> supplier= ()->"Hello";
	   
	   System.out.println(supplier.get());
	   
   }
}
