package com.logic;

public class Person implements Comparable<Person>{
	
	private int sno;
	private String name;

	
	public Person(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}


	public String toString() {
		return sno+","+name;
				
	}


	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return sno>o.sno?1:sno<o.sno?-1:0;
	}
	
	

}
