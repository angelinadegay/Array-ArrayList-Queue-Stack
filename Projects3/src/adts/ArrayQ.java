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
		
		if (numElements == data.length) {
	        // Queue is full, cannot enqueue
	        return;
	    }
	    data[rear] = element;
	    rear = (rear + 1) % data.length;
	    numElements++;
	    }
	

	@Override
	public E dequeue() 
	{
		
	    E element = data[front];
	    data[front] = null;
	    front = (front + 1) % data.length;
	    numElements--;
	    return element;
	   
    }
	
	 public E peek() 
	 {
	        return data[front];
	  }
	 

		@Override
		public boolean isFull() {
	        System.out.println("\n numElements_:" + numElements);
	        System.out.println("\n initialCapacity_:" + initialCapacity);
			return numElements==initialCapacity;
		}
		public String toString() {
	        StringBuilder sb = new StringBuilder();
	        String str = "";
	        int current = front;
	        sb.append("[");
	        while (current != rear ) {
	            sb.append(data[current] + " ");
	            current = (current + 1) % data.length;
	    }
	        sb.append("]");
	        return sb.toString();
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return numElements==0;
		}

}
