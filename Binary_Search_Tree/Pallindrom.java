import java.util.*;
public class Pallindrom {
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	void insert(int new_data)
	{
		Node current=head;
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new_node;
			return;
		}
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=new_node;
	}
	void print()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	void check(Node head)
	{
		Node current=head;
		boolean ispalindrom=true;
		Stack<Integer>s=new Stack<Integer>();
		while(current!=null)
		{
			s.push(current.data);
			current=current.next;
		}
		while(head!=null)
		{
			
			if(head.data==s.pop())
			{
				ispalindrom=true;
			}
			else
			{
				ispalindrom=false;
				break;
			}
			head=head.next;
			
		}
		System.out.println(ispalindrom);
	}
	static Node head;
	public static void main(String[] args)
	{
		Pallindrom p=new Pallindrom();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of linked list");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		p.insert(sc.nextInt());
	}
		p.check(p.head);
	}
}
