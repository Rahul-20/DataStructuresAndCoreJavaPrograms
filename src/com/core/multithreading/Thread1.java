package com.core.multithreading;

import java.util.List;
import java.util.ListIterator;

public class Thread1 extends Thread
{
	List<String> sample=null;
	public Thread1(List<String> sample)
	{
		this.sample=sample;
	}
	public void run() 
	{
		while(true)
		{
			ListIterator<String> it=sample.listIterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			while(it.hasNext())
			{
				System.out.println("Added::::"+it.next());
			}
		}
	}
}
