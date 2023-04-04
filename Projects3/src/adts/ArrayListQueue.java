package adts;

import java.util.ArrayList;


import interfaces.QueueInterface;

public class ArrayListQueue<E> implements QueueInterface<E> {
    protected ArrayList<E> data;
    protected String queueString;
    protected int front;
    protected int rear;
    protected int numElements;
    protected int capacity;
    protected final int DEFAULT_CAPACITY = 10;
    
    public ArrayListQueue() {
    	data = new ArrayList<>(DEFAULT_CAPACITY);
    	capacity=DEFAULT_CAPACITY;
   	 for (int i = 0; i < capacity; i++) {
         data.add(null);
     }
        front = 0;
        rear = 0;
        numElements=0;
    }

    public ArrayListQueue(int capacity) {
        data = new ArrayList<>(capacity);
         front=0;
         rear=0;
         this.capacity=capacity;
    	 for (int i = 0; i < capacity; i++) {
             data.add(null);
         }
         numElements=0;
    }

    @Override
    public boolean isEmpty() {
        return numElements==0;
    }

    @Override
    public void enqueue(E element) {
        if (isFull()) {
            return ;
        }
        data.set(rear, element);
        rear = (rear + 1) % capacity;
        numElements++;
       
     
    }

    @Override
    public E dequeue() {

        E element = data.get(front);
        data.set(front, null);
        front=(front+1) % capacity;
        numElements--;
        return element;
    }

    public E peek() {

        return data.get(front);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int current = front;
        for (int i = 0; i < numElements; i++) {
            sb.append(data.get(current)).append(" ");
            current = (current + 1) % capacity;
        }
        return sb.toString();
    }

    @Override
    public boolean isFull() {
    	return numElements == capacity;
    }
}
