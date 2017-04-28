package com.matrix.bool;


/* if the row has atleast 1 then make the corresponding row and col as 1's
 * 
 */
public class BooleanMat1 
{
	public static void main(String[] args) 
	{
		int mat[][]={{1,0},{0,0}};
		int r = 2,c=2;
		
		//Create Temp Array's
		int row[]=new int[r];
		int col[]=new int[c];
		
		// Traverse through the matrix and enable the positions in the created bit arrays;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat[i][j]==1)
				{
					row[i]=1;
					col[j]=1;
				}
			}
		}
		
		//Traverse again and modify the matrix based on the enabled temp aarrays
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(row[i]==1 || col[j]==1)
				{
					mat[i][j]=1;
				}
			}
		}
		
		//Print
		for(int i=0;i<r;i++)
		{
			System.out.print("[");
			for(int j=0;j<c;j++)
			{
				System.out.print(" "+mat[i][j]+" ");
			}
			System.out.print("]");
			System.out.println();
		}
		
	}
}
