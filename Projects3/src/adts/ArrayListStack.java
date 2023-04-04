package adts;

import java.util.ArrayList;

import interfaces.StackInterface;

import java.util.ArrayList;
import interfaces.StackInterface;

public class ArrayListStack<E> implements StackInterface<E> {
    protected ArrayList<E> data;
    protected int numElements;
    protected int top;
    protected int capacity;
    protected  final int DEFAULT_CAPACITY = 10;

    public ArrayListStack() {
        data = new ArrayList<>(DEFAULT_CAPACITY);
        capacity=DEFAULT_CAPACITY;
        for (int i = 0; i < capacity; i++) {
            data.add(null);
        }
        top=0;
       
        numElements=0;
    }
    public ArrayListStack(int capacity){
        data = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            data.add(null);
        }
        top=0;
        this.capacity=capacity;
        numElements=0;
        
    }

    @Override
    public boolean isEmpty() {
    	 return numElements == 0;
        
    }

    @Override
    public void push(E element) {
    	if(isFull()) {
    		return;
    	}
        data.set(top,element);
        top++;
        numElements++;
    }

    @Override
    public E pop() {
    	if(isEmpty()) {
    		return null;
    	}
    	top--;
        E element = data.get(top);
        data.set(top, null);
        numElements--;
        return element;
    }

    @Override
    public E peek() {
    	if (isEmpty()) {
            return null; 
        }
        return data.get(top - 1);
    }

	@Override
	public boolean isFull() {
		return numElements==capacity;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder("\n--------------------\n");
	    for (int i = top-1; i >= 0; i--) {
	        sb.append(data.get(i) + "\n");
	    }
	    return sb.toString();
	}
	}

