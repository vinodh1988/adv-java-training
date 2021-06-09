package com.design;

public class BackgroundThread implements TaskGroup{

	@Override
	public void job(String name) {
		// TODO Auto-generated method stub
		System.out.println("Background Thread"+name);
	}

}
