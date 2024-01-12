package dsa_3_S_linked_List_Insert;

public class Sll_insert {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void addNode(int key) {
		Node newNode=new Node(key);
		
		if(head==null) {
			head=newNode;
		}
		else {
			tail.next=newNode;
		}
		tail=newNode;
	}
	
	public void insertBiginning(int key) {
		Node newNode=new Node(key);
		newNode.next=head;
		head=newNode;
	}
	
	public void insertAfer(int nextTo,int key) {
		Node newNode=new Node(key);
		Node temp=head;
		
		while(temp!=null && temp.data!=nextTo) {
			temp=temp.next;
		}
		if(temp==null) {
			return;
		}
		if(temp==tail) {
			tail.next=newNode;
			tail=newNode;
			return;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
	}
	public void insertEnd(int key) {
		Node newNode=new Node(key);
		Node temp=head; //what is the use of Node(cant use int)//
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		tail=newNode;
		
	}
//	public void insertEnd(int key) { we can also use like this if tail only have
//		Node newNode=new Node(key);
//		tail.next=newNode;
//		tail=newNode;
//		
//	}
	
	public void display() {
		if (head==null) {
			System.out.println("Empty");
			return;
		}
		Node temp=head;
		while(temp != null) {
		   System.out.println(temp.data);
		   temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		Sll_insert list=new Sll_insert();
		list.display();
		list.addNode(10);
		list.addNode(20);
		list.addNode(50);
		
		list.insertAfer(10, 100);
	    list.insertEnd(500);
		list.insertBiginning(200);
		list.display();
		
		
	}
	

}
