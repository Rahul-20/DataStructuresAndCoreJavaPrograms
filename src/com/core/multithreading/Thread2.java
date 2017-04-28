package com.core.multithreading;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Thread2 extends Thread
{
	List<String> sample=null;
	public Thread2(List<String> sample)
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
				sample.add("aaaaaaaaaaaaa");
			}
			while(it.hasNext())
			{
				System.out.println(it.hasNext());
			}

		}
	}
}
