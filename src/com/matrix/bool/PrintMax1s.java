package com.matrix.bool;

import java.util.ArrayList;

public class PrintMax1s 
{
	public static void main(String[] args) 
	{
		//For each row, first find the first occ of 1 index and using BS and then subtract totaal length- index of first 1
		//which gives total number of ones.
		printMaxUsingBinarySearch();
		
		System.out.println("====================================");
		//Iterate through the  row and get count and check max
		prinitMaxusingBruteForce();
	}
	public static int getFirstOCC(int arr[],int low,int high)
	{
		if(low<=high)
		{
			int mid=low+(high-low)/2;

			if(arr[mid]==1 && (mid==0 || arr[mid-1]==0))
			{
				return mid;
			}
			else if(arr[mid]==0)
			{
				return getFirstOCC(arr,mid+1,high);
			}
			else
			{
				return getFirstOCC(arr,low,mid-1);
			}
		}
		return -1;
	}

	public static void printMaxUsingBinarySearch()
	{
		int arr[][]={{0,1},{1,1},{0,0}};
		int max_row_index = 0, max = -1;
		for(int i=0;i<arr.length;i++)
		{
			int firstOccIndex=getFirstOCC(arr[i],0,arr[i].length-1);
			if(firstOccIndex!=-1 && arr[i].length-firstOccIndex>max)
			{
				max=arr[i].length-firstOccIndex;
				max_row_index=i;
			}
		}
		System.out.println("Max Row index::::::"+max_row_index);
		System.out.println("Max 1's COunt::::::"+max);
	}

	public static void prinitMaxusingBruteForce()
	{
		int arr[][]={{0,1},{1,0},{1,0},{1,1}};
		int maxRowIndex=0;
		int max1s=0;
				
		for(int i=0;i<arr.length;i++)
		{
			int localmax1s=0;
			int a[]=arr[i];
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==1)
				{
					localmax1s=localmax1s+1;
				}
			}
			if(max1s<localmax1s)
			{
				max1s=localmax1s;
				maxRowIndex=i;
			}
		}
		
		System.out.println("Max Row Indx:::::"+maxRowIndex);
		System.out.println("max1s::::::::::"+max1s);
		
	}
}
