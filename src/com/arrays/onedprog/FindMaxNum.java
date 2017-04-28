package com.arrays.onedprog;

public class FindMaxNum 
{
	public static void main(String[] args) 
	{
		int max=-1;
		int arr[]={10,20,304,1,32,0};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max:::::::"+max);
	}
}
