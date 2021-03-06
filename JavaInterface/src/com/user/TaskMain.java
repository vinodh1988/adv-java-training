package com.user;

import java.util.Scanner;

import com.design.TaskGroup;
import com.design.pattern.JobFactory;

import com.design.pattern.TaskFacade;

public class TaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("What task you want us to perform");
         System.out.println("type 'backup' for taking backup");
         System.out.println("type 'scheduled' for schedule a job");
         System.out.println("type 'background' for running background thread");
         System.out.println("type 'build' for building the code");
         
         String choice=sc.next();
         
         TaskGroup tg=JobFactory.getObject(choice);
         System.out.print("Value for "+choice);
         String data = sc.next();
       
         TaskFacade.performActivity(tg::job,data );
	}

}
