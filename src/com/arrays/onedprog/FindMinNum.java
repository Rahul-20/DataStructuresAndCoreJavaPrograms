package com.arrays.onedprog;

public class FindMinNum 
{
	public static void main(String[] args) 
	{
		int min=-1;
		int arr[]={-20,1,2,4,5};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min::::"+min);
	}
}
