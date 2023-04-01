package adts;

import interfaces.QueueInterface;

public class ArrayQ<E> implements QueueInterface<E> {
    protected E[] data;
    protected int front;
    protected int rear;
    protected int numElements;
    protected final int DEFAULT_CAPACITY = 10;
    protected int initialCapacity;
    
    public ArrayQ() {
    	data= (E[]) new Object[DEFAULT_CAPACITY];
    	initialCapacity=DEFAULT_CAPACITY;
        front = 0;
        rear = 0;
        numElements=0;
    }
    		
    
    public ArrayQ(int capacity) {
        data= (E[]) new Object[capacity];
        front = 0;
        rear = 0;
        initialCapacity=capacity;
        numElements=0;
    }
    
    

	@Override
	public void enqueue(E element) {
			if(front>0) {
				rear=0;
			}
			data[rear]=element;
			rear++;
			numElements++;
	        
	    }
	

	@Override
	public E dequeue() 
	{
		
        E element = data[front];
        front ++;
        numElements--;
        return element;
    }
	
	 public E peek() 
	 {
	        return data[front];
	  }
	 

	@Override
	public boolean isEmpty() {// TODO Auto-generated method stub
		return numElements==0;
	}

	@Override
	public boolean isFull() {
		return numElements==initialCapacity;
	}
	public String toString() {
        StringBuilder sb = new StringBuilder();
        int current = front;
        while (current != rear ) {
            sb.append(data[current]).append(" ");
            current = (current + 1) % data.length;
        }
        return sb.toString();
    }

}
