package com.first;
class FindIt{
    public static void main(int []n)
	{
	   System.out.println(n.length);
	}
	public static void Main(String n[]){
	   int p[]={23,425,23,24523,232};
	   System.out.println("This is working");
	   main(p);
	}
	
	public static void main(String n[]){
		int i=-1;
		while(true){
			i++;
		    // System.out.println(i==n.length);
			if(i==n.length){
			Main(n);
			
			}
			if(i<0)
			{
				System.out.println(i);
			    break;
			}
		}
		
	}
    
}