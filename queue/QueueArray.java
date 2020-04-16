package eg.edu.alexu.csd.datastructure.queue;

import java.util.NoSuchElementException;

public class QueueArray implements IQueue {
public int n;
public Object [] arr;
public int f;
public int r;
int size=0;
QueueArray(int c) 
    { 
    f = r = 0; 
     n = c; 
	arr=new Object[n];
    } 
	@Override
	public void enqueue(Object item) {
		if(size==n) {
			throw new  NoSuchElementException ();
		}

     arr[r]=item;
	 r=(r+1)%n;
size++;
	}

	@Override
	public Object dequeue() {
		if(isEmpty()==true) {
			throw new  NoSuchElementException ();
		}
		Object temp =arr[f];
		arr[f]=null;
		f=(f+1)%n;
		size--;
		return temp;
	}

	@Override
	public boolean isEmpty() {
	     if(size==0) {
		return true;
	     }
	   return false;
		}

	@Override
	public int size() {
		return size;
	}
	public void show() {
		if( isEmpty()) {
			throw new NullPointerException (" empty queue");
		}
		for(int i =f;i<r;i++) {
            System.out.printf(" %d <- ", arr[i]); 
		}
		System.out.println();
	}

}
