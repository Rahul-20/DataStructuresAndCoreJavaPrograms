package com.arrays.onedprog;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		int arr[]={3,1,2,2,3,3};
		byte bit[]=new byte[100];
		ArrayList<Integer> aList=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(bit[arr[i]]==0)
			{
				aList.add(arr[i]);
				bit[arr[i]]=1;
			}
		}

		Iterator it=aList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}