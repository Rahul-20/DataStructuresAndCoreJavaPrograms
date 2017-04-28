package com.core.multithreading;

import java.util.List;

public class RecruiterProduce extends Thread 
{
	List<String> liProd;
	int cap;
	RecruiterProduce(List<String> liProd,int cap)
	{
		this.liProd=liProd;
		this.cap=cap;
	}

	public void run()
	{
		
		int jobNum=1;
		while(true)
		{
			synchronized (this.liProd) 
			{
				if(liProd.size()==cap || liProd.size()==1)
				{
					try {
						this.liProd.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					liProd.add("Job"+jobNum);
					System.out.println("AddedJobNum:::::"+" "+"Job"+jobNum);
					jobNum++;
					this.liProd.notify();
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}	
		}
	}
}
