package dsa_4_6_maxheap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MaxHeap {
	List<Integer> heap = new ArrayList<>();
	
	public MaxHeap() {
		
	}
	public MaxHeap(List<Integer> array) {
		buildHeap(array);
		
	}
	private void buildHeap(List<Integer> array) {
		heap=array;
		for (int i =parent(heap.size()-1);i>=0;i--) {
			shiftDown(i); 
		}
		
		
	}
	private void shiftDown(int currentIdx) {
		int endIdx = heap.size()-1;
		int leftIdx = leftChild(currentIdx);
		while (leftIdx <= endIdx) {
			int rightIdx=rightChild(currentIdx);
			int idxToShift;
			if (rightIdx <= endIdx && heap.get(rightIdx)<heap.get(leftIdx)) {
				idxToShift=leftIdx;	
			}
			else {
				idxToShift=rightIdx;
			}
			if (heap.get(currentIdx) < heap.get(idxToShift)) {
				Collections.swap(heap, currentIdx, idxToShift);
				currentIdx=idxToShift;
				leftIdx = leftChild(currentIdx);
			}else {
				return;
			}
			
		}
	}
	private void shiftUp(int currentIdx) {
		int parentIdx=parent(currentIdx);
		while(currentIdx > 0 && heap.get(parentIdx)<heap.get(currentIdx)) {
			Collections.swap(heap, currentIdx, parentIdx);
			currentIdx=parentIdx;
			parentIdx=parent(currentIdx);
		}
	}
	public int peek() {
		return heap.get(0);
	}
	public void remove() {
		Collections.swap(heap,0,heap.size()-1);
		heap.remove(heap.size()-1);
		shiftDown(0);
	}
	public void insert(int value) {
		heap.add(value);
		shiftUp(heap.size()-1);
	}
	private int parent(int i) {
		return (i-1)/2;
	}
	
	private int leftChild(int i) {
		return (i*2)+1;
		
	}
	
	private int rightChild(int i) {
		return (i*2)+2;
	}
	
	public void display() {
		for (int i=0;i<heap.size(); i++) {
			System.out.println(heap.get(i));
		}
	}
	public static void main(String[] args) {
		List<Integer> array  = new ArrayList<>(Arrays.asList(2,5,8));
		MaxHeap heap = new MaxHeap(array);
		heap.display();
		System.out.println("after insert ");
		heap.insert(1);
		heap.insert(14);
		heap.insert(9);
		heap.display();
		System.out.println("after remove");
		heap.remove();
		heap.insert(1);

		heap.display();
	}

}
