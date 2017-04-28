package com.core.multithreading;

import java.util.LinkedList;

public class EmployeeMainThread 
{
	public static void main(String[] args) throws InterruptedException 
	{
		LinkedList<String> list=new LinkedList<String>();
		EmployeeRecruiterThread er=new EmployeeRecruiterThread(list,"ER Thread",2);
		er.start();
		EmployeeViewerThread ev=new EmployeeViewerThread(list,"ER Thread",2);
		ev.start();
		
		er.join();
		ev.join();
	}
}