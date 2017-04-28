package com.ds.trees;

public class FindLeafNodes 
{
	public static void main(String[] args) 
	{
		treeCreation();		
	}

	public static void treeCreation()
	{
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		
		TreeNode root=n1;
		root.left=n2;
		root.right=n3;
		n2.left=n4;
		n2.right=n5;
		
		findLeafNodes(root);
		
	}
	
	public static void findLeafNodes(TreeNode root)
	{
		if(root.right!=null)
			findLeafNodes(root.right);
		
		if(root.left!=null)
			findLeafNodes(root.left);
		
		if(root.right==null || root.left==null)
		{
			System.out.println("Leaf Node:::::"+root.data);
		}
	}
}
