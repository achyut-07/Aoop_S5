package com.GenericPriorityQueue;
import java.util.*;
public class PriorityQueue<T> {
	
	private ArrayList<T> heap;
    private Comparator<T> comparator; 
    
    public PriorityQueue(Comparator<T> comparator) {
        heap = new ArrayList<>();
        this.comparator = comparator;
    }
    
    public void add(T element) {
        heap.add(element);        
        heapifyUp(heap.size() - 1);
    }
    
    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        T root = heap.get(0);
        T lastElement = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, lastElement); // Replace the root with the last element
            heapifyDown(0);           // Restore heap property
        }
        return root;
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return heap.get(0);
    }
    
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    
    private void heapifyUp(int index) {
        T current = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap.get(parentIndex);
            if (comparator.compare(current, parent) >= 0) {
                break;
            }
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, current);
    }
    
    private void heapifyDown(int index) {
        T current = heap.get(index);
        int size = heap.size();
        while (index < size / 2) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestChildIndex = leftChildIndex;
            if (rightChildIndex < size && comparator.compare(heap.get(rightChildIndex), heap.get(leftChildIndex)) < 0) {
                smallestChildIndex = rightChildIndex;
            }
            if (comparator.compare(heap.get(smallestChildIndex), current) >= 0) {
                break;
            }
            heap.set(index, heap.get(smallestChildIndex));
            index = smallestChildIndex;
        }
        heap.set(index, current);
    }


}
