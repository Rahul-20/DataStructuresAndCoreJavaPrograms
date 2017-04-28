package com.sorting.algos;

//3-Way QuickSort (Dutch National Flag) Need to implement

public class QuickSort 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,10,5,0,4};
		int low=0;
		int high=a.length-1;
		quickSort(a,low,high);

		System.out.println("sorted array");
		printArr(a);

	}

	public static void quickSort(int a[],int low,int high)
	{
		if(low<high)
		{
			int partIndex=partition(a,low,high);

			quickSort(a,low,partIndex-1);
			quickSort(a,partIndex+1,high);

		}
	}

	public static int partition(int a[],int low,int high)
	{
		int i=low-1;
		int pivote=a[high];
		for(int j=low;j<=high-1;j++)
		{
			if(a[j]<=pivote)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[high];
		a[high]=temp;
		return i+1;
	}

	public static void printArr(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}