package com.threadexample;

public class MyThreadExample implements Runnable
{
	  
	public void run()  
	{    
		System.out.println("Now the thread is running ...");    
	}    
	    
	public static void main(String args[])  
	{   
	 
		Runnable r1 = new MyThreadExample();   
		 
		Thread th1 = new Thread(r1, "My new thread");    
		th1.start();   
		  
		String str = th1.getName();  
		System.out.println(str);  
	}    
}