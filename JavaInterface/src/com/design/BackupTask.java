package com.design;

public class BackupTask implements TaskGroup {

	@Override
	public void job(String name) {
		// TODO Auto-generated method stub
		System.out.println("Backing up "+name);
	}
     
}
