package dsa_4_Array_to_S_linked_List_;


public class ArraytoSll {
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
		ArraytoSll list=new ArraytoSll();
        int[] arr = {10, 20, 30, 40};
        for (int i=0; i< arr.length; i++) {
        	list.addNode(arr[i]);
        }
        list.display();
	
	}
}
