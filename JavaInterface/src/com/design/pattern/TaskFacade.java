package com.design.pattern;

public class TaskFacade {
   public static void performActivity(ITask task,String name) {
	   System.out.println("Task Started");
	   task.doTask(name);
	   System.out.println("Task Finished");
   }
}
