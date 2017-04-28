package com.sorting.algos;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		bubbleSort();
	}
	
	public static void bubbleSort()
	{
		int a[]={10,3,1,5};
		
		for(int i=a.length-2;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		printArr(a);
	}
	
	public static void printArr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}