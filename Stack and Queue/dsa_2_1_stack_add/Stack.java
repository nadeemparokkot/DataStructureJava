package dsa_6_stack_add;

public class Stack {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public Node top=null;
		
	public void push(int key) {
		Node newNode=new Node(key);
		if (top==null){
			top=newNode;
		}else {
			newNode.next=top;
			top=newNode;
		}
	}
	public void pull() {
		if (top==null) {
			System.out.println("stack underflow");
		}
		top=top.next;
	}
	public void display(){
		Node temp =top;
		
		while (temp!=null) {
			System.out.println(temp.data);
			System.out.println(temp.next);

			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Stack list=new Stack();
		list.push(10);
		list.push(20);
		list.push(50);
		list.push(90);
		list.pull();
		list.display();
	}

}
