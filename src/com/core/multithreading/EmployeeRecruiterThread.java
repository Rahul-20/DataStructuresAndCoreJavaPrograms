package com.core.multithreading;

import java.util.LinkedList;

public class EmployeeRecruiterThread extends Thread 
{
	LinkedList<String> li;
	int cap;
	public EmployeeRecruiterThread(LinkedList<String> li, String threadname,int cap)
	{
		this.li=li;
		this.cap=cap;
	}

	public void run()
	{
		int addJobs=0;
		
		while(true)
		{
			synchronized (this.li)
			{

				if(li.size()==cap)
				{
					try {
						this.li.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					addJobs=addJobs+1;
					li.add("JOB Num::"+String.valueOf(addJobs));
					System.out.println("Added JOB::::::::"+addJobs);
					this.li.notify();
					
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
