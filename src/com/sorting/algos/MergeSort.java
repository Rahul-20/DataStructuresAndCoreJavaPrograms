package com.sorting.algos;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		int a[]={2,18,39,0};
		mergeSort(a,0,a.length-1);
	}

	public static void mergeSort(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			
			merge(a,low,mid,high);
		}
	}
	
	public static void merge(int a[],int low,int mid,int high)
	{
		 int n1 = mid - high + 1;
	     int n2 = high - mid;
		
	}
}
