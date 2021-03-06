package com.design.pattern;

import com.design.BackgroundThread;
import com.design.BackupTask;
import com.design.BuildTask;
import com.design.ScheduledTask;
import com.design.TaskGroup;

public class JobFactory {
   private static final TaskGroup backup=new BackupTask();
   private static final TaskGroup background=new BackgroundThread();
   private static final TaskGroup scheduled=new ScheduledTask();
   private static final TaskGroup build=new BuildTask();
   
   private JobFactory() {}
   
   public static TaskGroup getObject(String type) {
	   switch(type) {
	   case "background":
		   				return background;
	   case "backup":
		   				return backup;
	   case "scheduled":
		   				return scheduled;
	   case "build":
		   			    return build;
	   default:
		                return null;
	   }
   }
   
}
