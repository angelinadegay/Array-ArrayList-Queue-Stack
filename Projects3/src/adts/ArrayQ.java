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
    	data = (E[]) new Object[DEFAULT_CAPACITY];
    	initialCapacity=DEFAULT_CAPACITY;
        front = 0;
        //Initiating rear to -1 to avoid confusion with the first element in the array
        rear = -1;
        numElements=0;
    }
    		
    
    public ArrayQ(int capacity) {
        data= (E[]) new Object[capacity];
        front = 0;
        //Initiating rear to -1 to avoid confusion with the first element in the array
        rear = -1;
        initialCapacity=capacity;
        numElements=0;
    }
    
    

	@Override
	public void enqueue(E element) {
			if(front>0) {
				rear=0;
			}
            
            rear++;
			data[rear]=element;
			
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
        System.out.println("\n numElements_:" + numElements);
        System.out.println("\n initialCapacity_:" + initialCapacity);
		return numElements==initialCapacity;
	}
	public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        int current = front;
        System.out.println("\n numElements value: " + numElements);
        System.out.println("\n front value: " + front);
        System.out.println("\n rear value: " + rear);
        System.out.println("\n DEFAULT_CAPACITY value: " + DEFAULT_CAPACITY);       
        

        System.out.println("\n data array: ");        
       /* for (int i = 0; i < data.length; i++) {
            str += data[i] + " ";
        } */

        while (current != rear) {            
            str += data[current] + " "; 
            //System.out.println("current " + current + " rear " + rear);    
            current = (current + 1) % data.length;
         }
         str += data[current] + " "; 
     
        return str;
    }

}
