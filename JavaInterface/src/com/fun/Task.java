package com.fun;

public class Task {
   public static void taskExecution(CallBack b) {
	   System.out.println("Part1");
	   b.process("Part2");
	   System.out.println("Part3");
	   b.process("Part3");
	   System.out.println("Finished");
   }
}
