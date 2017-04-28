package com.matrix.bool;

import java.util.HashSet;

import com.misc.TreeNode;

//Print all unique rows in matrix

public class UniqueRows 
{
	public static void main(String[] args) 
	{
		//Read each row and calculate hash num for each row and put that hash number in hashset
		//and check for every row has generated the same hash number or not if Yes, then duplicate row print.
		printUinqueRowsTech1();

		System.out.println("=================================");
		//Using Trie Data structure
		//Read each and every value if if it is not there in tree place it and 0 at left and 1 at right
		//Maintain Uinque flag, if true print.
		printUinqueRowsUsingTrieDS();
		System.out.println("=================================");
	}
	
	public static void printUinqueRowsTech1()
	{
		int a[][]={{1,0,0},{0,1,1},{1,0,0}};
		int r=3;
		int c=3;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<r;i++)
		{
			int row[]=a[i];
			int bigdecimal=0;
			for(int j=0;j<row.length;j++)
			{
				if(row[j]==1)
				{
					bigdecimal=(int) (bigdecimal+Math.pow(2,(row.length-1)-j));
				}
			}

			if(false == set.contains(bigdecimal))
			{
				set.add(bigdecimal);
				//Print
				for(int el : row)
				{
					System.out.print(el + " ");
				}
				System.out.println();
			}
			else
			{
				for(int el : row)
				{
					System.out.print("Duplicate"+" "+el + " ");
				}
				System.out.println();
			}
		}
	}

	public static void printUinqueRowsUsingTrieDS()
	{
		int[][] mat= new int[][]{
			{0, 1, 0, 0, 1},
			{1, 0, 1, 1, 0},
			{0, 1, 0, 0, 1},
			{1, 1, 1, 0, 0},
			{0, 1, 0, 0, 1} };

			TreeNode tempNode=new TreeNode();
			for(int i=0;i<mat.length;i++)
			{
				boolean isUnique=false;
				TreeNode root=tempNode;
				for(int j=0;j<mat[0].length;j++)
				{
					if(mat[i][j]==1)
					{
						if(root.right==null)
						{
							TreeNode newNode=new TreeNode();
							root.right=newNode;
							root=root.right;
							isUnique=true;
						}
						else
						{
							root=root.right;
						}
					}
					else
					{
						if(root.left==null)
						{
							TreeNode newNode=new TreeNode();
							root.left=newNode;
							root=root.left;
							isUnique=true;
						}
						else
						{
							root=root.left;
						}
					}
				}
				if(isUnique)
				{
					for(int j=0;j<mat[0].length;j++){
						System.out.print(mat[i][j] + " ");
					}
					System.out.println();
				}

			}
	  }

}

