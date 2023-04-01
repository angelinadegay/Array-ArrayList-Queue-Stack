package adts;

import interfaces.StackInterface;


public class ArrayStack<E> implements StackInterface<E> {

    protected E[] data;
    protected int top;
    protected int numElements;
    protected  final int DEFAULT_CAPACITY = 10;
    protected int capacity;

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
        numElements=0;
        top = 0;
        this.capacity = capacity;
    }
    public ArrayStack() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        numElements=0;
        top = 0;
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return numElements==0;
    }

    @Override
    public void push(E element) {
    	data[top]=element;
    	top++;
    	numElements++;
       
    }

    @Override
    public E pop() {
    	top--;
        E element = data[top];
        numElements--;
        return element;
    }

    @Override
    public E peek() {

        return data[top-1];
    }

    @Override
    public String toString() {
    	StringBuilder stackStr = new StringBuilder("\n--------------------\n");
		
		int ptr = numElements-1;
		
		while(ptr>=0)
		{
			stackStr.append(data[ptr] + "\n");
			ptr--;
		}
		
		return stackStr.toString();
    }

	@Override
	public boolean isFull() {
		return top == capacity;
	}
}
