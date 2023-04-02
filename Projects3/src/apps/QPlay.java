package apps;
//import adts.ArrayListQueue;
import adts.ArrayQ;

public class QPlay {

	public static void main(String[] args) {
		
		ArrayQ<String> myQ = new  ArrayQ<String>();
		
		for (int i = 0; i < 10; i++) {
			myQ.enqueue("String " + i);			
		}		
		
		System.out.println(myQ.isEmpty() ? "myQ is empty" : "myQ is not empty");
		System.out.println(myQ.isFull()  ? "myQ is full"  : "myQ is not full");
		System.out.println("Check array after full capacity load \n" + myQ.toString());
		
		if (!myQ.isFull()) {
		 	myQ.enqueue("testCapacity");
		}


	    System.out.println("Dequeuing one element: " + myQ.dequeue());  		
		System.out.println("Dequeuing one element: " + myQ.dequeue());
		System.out.println("Dequeuing one element: " + myQ.dequeue());

		System.out.println("Adding one element: " + "testNewLap1");		
		System.out.println("check new lap \n" + myQ.toString());
		
	/*	System.out.println("Adding one element: " + "testNewLap2");
		myQ.enqueue("testNewLap2");
		System.out.println("check new lap \n" + myQ.toString());
		
	

		
		myQ.dequeue();
		myQ.dequeue();
		myQ.dequeue();
		myQ.dequeue();
		System.out.println(myQ);
		System.out.println(myQ.isEmpty() ? "myQ is empty" : "myQ is not empty");
		System.out.println(myQ.isFull()  ? "myQ is full"  : "myQ is not full");
		
		
		ArrayQ<Integer> myIntQ = new ArrayQ<Integer>();
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				myIntQ.enqueue(i);
			}
		}
		System.out.println(myIntQ);
		
		while (!myIntQ.isEmpty()) {
			myIntQ.dequeue();
		}
		System.out.println(myIntQ);
		System.out.println(myIntQ.isEmpty() ? "It's empty now!" : "How did I get here?");
		*/

	}

}
