package com.core.multithreading;

import java.util.LinkedList;
import java.util.Map;

public class EmployeeViewerThread extends Thread 
{
	LinkedList<String> li;
	int cap;
	int i=0;
	public EmployeeViewerThread(LinkedList<String> li, String threadname,int cap)
	{
		this.li=li;
		this.cap=cap;
	}

	public void run()
	{
		while(true)
		{
			synchronized (this.li) 
			{
				if(li.size()==0)
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
					String re=li.removeFirst();
					System.out.println("Removeddddd:"+re);
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
