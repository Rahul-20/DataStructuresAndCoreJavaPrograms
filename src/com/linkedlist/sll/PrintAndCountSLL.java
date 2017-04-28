package com.linkedlist.sll;

import com.misc.SLLNode;

public class PrintAndCountSLL 
{
	public static void main(String[] args) 
	{
		SLLNode n1=new SLLNode(1);
		SLLNode n2=new SLLNode(2);
		SLLNode n3=new SLLNode(3);
		SLLNode n4=new SLLNode(4);
		SLLNode n5=new SLLNode(5);
		
		
		SLLNode head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		SLLNode curr=head;
		System.out.println("============Print SLL============");
		while(curr!=null)
		{
			System.out.println("Data::::"+curr.data);
			curr=curr.next;
		}
		
		System.out.println("============Count of SLL============");
		countLength(head);
	}
	
	public static void countLength(SLLNode head)
	{
		int count=0;
		SLLNode curr=head;
		while(curr!=null)
		{
			count=count+1;
			curr=curr.next;
		}
		
		System.out.println("Total Length::::::"+count);
	}
}
