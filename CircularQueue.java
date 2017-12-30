
import java.util.Arrays;



public class CircularQueue {



public String[] queueArray;

public int queueSize;

public int front, rear, numberOfItems = 0;



CircularQueue(int size) {

queueSize = size;

queueArray = new String[size];

Arrays.fill(queueArray, "-1");

// data = newData;

}



public void insert(String input) {

if (numberOfItems + 1 <= queueSize) {

// all new information goes in the rear

queueArray[rear] = input;

rear++;	//why is this so important

numberOfItems++;

System.out.println("Insert " + input + " was added to the queue");

} else {

System.out.println("Sorry but the queue is full my brother");

}

}



public void remove() { // removes information from the front

if (numberOfItems > 0) {

System.out.println("Removed " + queueArray[front] + " was removed" + "from the array ");

queueArray[front] = "-1";

front++;

numberOfItems--;

} else {

System.out.println("Sorry the queue is empty");

}

}



public void printArray() {

for (int i = 0; i < queueSize; i++) {

System.out.println(queueArray[i]);

}



}



// public boolean isEmpty(){

// if(front == rear){

// return true;

// } else{

// return false;

// }

// }

//

// public int getData(){

// return data;

// }

//

// public void setData(int data){

// this.data = data;

// }

//

// public String toString() {

// return

// }



}