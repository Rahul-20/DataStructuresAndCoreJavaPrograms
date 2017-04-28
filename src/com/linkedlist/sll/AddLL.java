package com.linkedlist.sll;

import com.misc.SLLNode;

public class AddLL 
{
	public static void main(String[] args) 
	{
		System.out.println("=============================");
		addingNewNodeAtFront();
		System.out.println("=============================");
		addingNewNodeAtEnd();
	}

	public static void addingNewNodeAtFront()
	{
		SLLNode n1=new SLLNode(1);
		SLLNode n2=new SLLNode(2);
		SLLNode n3=new SLLNode(3);
		SLLNode n4=new SLLNode(4);
		SLLNode n5=new SLLNode(5);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		SLLNode head=n1;

		SLLNode new_node=new SLLNode(0);
		new_node.next=head;
		head=new_node;

		while(head!=null)
		{
			System.out.println("Data::::"+head.data);
			head=head.next;
		}
	}

	public static void addingNewNodeAtEnd()
	{
		SLLNode n1=new SLLNode(1);
		SLLNode n2=new SLLNode(2);
		SLLNode n3=new SLLNode(3);
		SLLNode n4=new SLLNode(4);
		SLLNode n5=new SLLNode(5);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		SLLNode head=n1;

		SLLNode new_node=new SLLNode(6);
		
		SLLNode prev=null;
		SLLNode curr=head;
		
		while(curr!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		prev.next=new_node;
		
		while(head!=null)
		{
			System.out.println("Data::::"+head.data);
			head=head.next;
		}
	}
}
