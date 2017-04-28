package com.core.multithreading;

import java.util.ArrayList;
import java.util.List;

public class FailFast 
{
	public static void main(String[] args) 
	{
		List<String> sample=new ArrayList<String>();
		sample.add("Rahul");
		sample.add("kumar");
		sample.add("pamidi");
		sample.add("abc");
		sample.add("def");
		
		Thread1 t1=new Thread1(sample);
		t1.start();
		
		Thread2 t2=new Thread2(sample);
		t2.start();	
	}
}
