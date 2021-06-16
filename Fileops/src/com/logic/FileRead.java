package com.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class FileRead {
  public static void main(String n[]) {
	  TreeSet<Person> t=new TreeSet<Person>();
	  
	  File f=new File("E:\\JavaBatch\\p.txt");
	  File f1=new File("E:\\JavaBatch\\file2.txt");
	  
	  try {
		FileReader reader=new FileReader(f);
		FileWriter writer=new FileWriter(f1);
		BufferedReader br=new BufferedReader(reader);
		BufferedWriter bw=new BufferedWriter(writer);
		String data=null;
		while((data=br.readLine())!=null)
		    {
			    
			    String x[]=data.split(",");
			    Person p =new Person(Integer.parseInt(x[0]),x[1]);
			    System.out.println(p);
			    t.add(p);
		    }
	
		for(Person temp:t) {
		
			bw.write(temp.toString());
			bw.newLine();
		}
		bw.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
