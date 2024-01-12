package dsa_2_S_linked_List_delete;

public class SlinkedListDel {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			
					
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data) {
		Node newNode=new Node(data);
		
		if (head==null) {
			head=newNode;
		}
		else {
			tail.next=newNode;
		}
		tail=newNode;
	}
	
	
	public void delete(int key) {
		Node temp=head,prev=null;
		if (temp !=null && temp.data==key) {
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
			
		}
		if (temp==null) {
			return;
			
		}
		if(temp==tail) {
			tail=prev;
			tail.next=null;
			return;
		}
		prev.next=temp.next;
	}
	
	
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
		SlinkedListDel list=new SlinkedListDel();
		list.display();
		
		list.addNode(10);
		list.addNode(20);
		list.addNode(50);
		list.delete(10);
		list.display();
		
	}


}

