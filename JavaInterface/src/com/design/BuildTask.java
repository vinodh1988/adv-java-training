package com.design;

public class BuildTask implements TaskGroup{

	@Override
	public void job(String name) {
		// TODO Auto-generated method stub
		System.out.println("Building "+name);
	}

}
