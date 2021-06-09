package com.design;

public class ScheduledTask implements TaskGroup{

	@Override
	public void job(String name) {
		// TODO Auto-generated method stub
		System.out.println("Deploying Scheduled Task "+name);
	}

}
