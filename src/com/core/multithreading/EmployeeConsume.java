package com.core.multithreading;

import java.util.List;

public class EmployeeConsume extends Thread 
{
	List<String> liConsu=null;
	int cap;
	EmployeeConsume(List<String> liConsu,int cap)
	{
		this.liConsu=liConsu;
		this.cap=cap;
	}

	public void run()
	{
		int jobNum=1;
		while(true)
		{
			synchronized (this.liConsu) 
			{	
				if(liConsu.size()==0)
				{
					try {
						this.liConsu.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					liConsu.remove("Job"+jobNum);
					System.out.println("Removed JobNum:::::"+" "+"JOB"+jobNum);
					jobNum++;
					this.liConsu.notify();

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
