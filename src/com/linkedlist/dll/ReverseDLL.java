package com.linkedlist.dll;

import com.misc.DLLNode;

public class ReverseDLL 
{
	public static void main(String[] args) 
	{
		DLLNode n1=new DLLNode(1);
		DLLNode n2=new DLLNode(2);
		DLLNode n3=new DLLNode(3);
		DLLNode n4=new DLLNode(4);
		DLLNode n5=new DLLNode(5);


		DLLNode head=n1;
		n1.next=n2;
		n2.prev=n1;

		n2.next=n3;
		n3.prev=n2;

		n3.next=n4;
		n4.prev=n3;

		n4.next=n5;
		n5.prev=n4;
		
		DLLNode curr=head;
		while(curr!=null)
		{
			DLLNode temp=curr.next;
			curr.next=curr.prev;
			curr.prev=temp;
			curr=curr.next;
		}
		curr=head;
		while(curr!=null)
		{
			System.out.println("Data:::::::"+curr.data);
			curr=curr.next;
		}
	}
	
}
