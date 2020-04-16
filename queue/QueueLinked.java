package eg.edu.alexu.csd.datastructure.queue;
import java.util.NoSuchElementException;

public class QueueLinked implements IQueue ,ILinkedBased{

	public Node head;
	public Node tail;
	public int size=0;
	
	@Override
	public void enqueue(Object item) {
    Node node =new Node();
    node.setData(item); 
    if(isEmpty()==true) {
    	head=node;
    	tail=node;
    	  }
    else {
    	tail.setNext(node);
    	node.setNext(null);
    	tail=node;
    }
    size++;
	}

	@Override
	public Object dequeue() {
		Node node =new Node();
		if(isEmpty()==true) {
			throw new  NoSuchElementException ();
		}
		Object data=head.getData();
		head=head.getNext();
		size--;
		if(size==0) {
			tail=null;
		}
		return data;
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
		// TODO Auto-generated method stub
		return size;
	}
	public void show() {
		Node currentNode = head;
		if( isEmpty()) {
			throw new NullPointerException (" empty list");
		}
		while(currentNode!=null) {
			System.out.printf("%d ",currentNode.getData());
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

}
