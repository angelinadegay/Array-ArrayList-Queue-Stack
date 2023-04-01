package adts;

import java.util.ArrayList;

import interfaces.StackInterface;

import java.util.ArrayList;
import interfaces.StackInterface;

public class ArrayListStack<E> implements StackInterface<E> {
    protected ArrayList<E> data;
    protected int numElements;
    protected int top;
    protected  final int DEFAULT_CAPACITY = 10;

    public ArrayListStack() {
        data = new ArrayList<>();
        top=0;
    }

    @Override
    public boolean isEmpty() {
    	 return numElements == 0;
        
    }

    @Override
    public void push(E element) {
        data.add(top,element);
        top++;
        numElements++;
    }

    @Override
    public E pop() {
    	top--;
        E element = data.get(top);
        numElements--;
        return element;
    }

    @Override
    public E peek() {
  
        return data.get(top - 1);
    }

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
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

