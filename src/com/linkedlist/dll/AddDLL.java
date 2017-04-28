package com.linkedlist.dll;

import com.misc.DLLNode;

public class AddDLL 
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
		DLLNode n1=new DLLNode(1);
		DLLNode n2=new DLLNode(2);
		DLLNode n3=new DLLNode(3);
		DLLNode n4=new DLLNode(4);
		DLLNode n5=new DLLNode(5);

		n1.next=n2;
		n2.prev=n1;
		
		n2.next=n3;
		n3.prev=n2;
		
		n3.next=n4;
		n4.prev=n3;
		
		n4.next=n5;
		n5.prev=n4;
		
		DLLNode head=n1;

		DLLNode new_node=new DLLNode(0);
		new_node.next=head;
		head.prev=new_node;
		head=new_node;
		
		DLLNode previous=null;
		while(head!=null)
		{
			previous=head;
			System.out.println("Data::::"+head.data);
			head=head.next;
		}
		
		System.out.println("==============Reverse Print===============");
		while(previous!=null)
		{
			System.out.println("Data::::"+previous.data);
			previous=previous.prev;
		}
	}

	public static void addingNewNodeAtEnd()
	{
		DLLNode n1=new DLLNode(1);
		DLLNode n2=new DLLNode(2);
		DLLNode n3=new DLLNode(3);
		DLLNode n4=new DLLNode(4);
		DLLNode n5=new DLLNode(5);

		n1.next=n2;
		n2.prev=n1;
		
		n2.next=n3;
		n3.prev=n2;
		
		n3.next=n4;
		n4.prev=n3;
		
		n4.next=n5;
		n5.prev=n4;
		DLLNode head=n1;

		DLLNode new_node=new DLLNode(6);
		
		DLLNode prev=null;
		DLLNode curr=head;
		
		while(curr!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		prev.next=new_node;
		new_node.prev=prev;
		prev=new_node;
		
		
		while(head!=null)
		{
			System.out.println("Data::::"+head.data);
			head=head.next;
		}
		
		System.out.println("================Reverse Print================");
		while(prev!=null)
		{
			System.out.println("Data::::"+prev.data);
			prev=prev.prev;
		}
	}
}
