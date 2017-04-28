package com.core.multithreading;

import java.util.ArrayList;
import java.util.List;

public class JobsMain 
{
	public static void main(String[] args) throws InterruptedException 
	{
		List<String> listOfJobs =new ArrayList<String>();
		int cap=2;
		RecruiterProduce rp=new RecruiterProduce(listOfJobs,cap);
		rp.start();
		
		EmployeeConsume ec=new EmployeeConsume(listOfJobs,cap);
		ec.start();
		
		rp.join();
		ec.join();
		
	}
}
