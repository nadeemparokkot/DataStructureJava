package dsa_7_queue;


public class Queue {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public Node front=null;
	public Node rear=null;
	
	public void enqueue(int key) {
		Node newNode =new Node(key);
		if (front==null) {
			front=newNode;
			
		}else {
			rear.next=newNode;
		}
		rear=newNode;
		
	}
	public void dequeue() {
		if (front ==null) {
			System.out.println("empty");
		}
		front=front.next;
		
	}
	public void display(){
		Node temp =front;
		
		while (temp!=null) {
			System.out.println(temp.data);
			System.out.println(temp.next);

			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Queue list=new Queue();
		list.enqueue(10);
		list.enqueue(20);
		list.enqueue(50);
		list.enqueue(90);
		list.dequeue();
		list.display();
		
	}

}
