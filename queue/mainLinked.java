package eg.edu.alexu.csd.datastructure.queue;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class mainLinked {

	static QueueLinked test= new QueueLinked();
	 static Scanner sc = new Scanner(System.in);
		static char selectM;
		static boolean exit = false;
	public static void menu () {
		System.out.println("====================================================================");
		System.out.println("Please choose an action:");
		System.out.println("-----------------------");
		System.out.println("1- enqueue");
		System.out.println("2- dequeue");	
		System.out.println("3- Get size");
		System.out.println("4- Check if empty");
		System.out.println("5- Exit the menu");
		System.out.println("6- show the queue");

		System.out.println("====================================================================");
	}	
	

	public static void main(String[] args) {
while ( !exit ) {
	menu();
    selectM = sc.next().charAt(0);
    switch ( selectM ) {
	case '1' :
		System.out.println("please enter your input:");
		int n=sc.nextInt();	
		test.enqueue(n);
	    break;
	case '2' :
		 try {
			 System.out.println(test.dequeue());	            
	         } catch (NoSuchElementException e) {
	        	 System.out.println("the queue is empty");
	         }
		break;
	
	case '3' :
		int k =test.size();
		System.out.printf("the size is equal to: %d \n", k);
		break;
	case '4' :
		System.out.println(test.isEmpty());
		break;
	case '5' :
		exit = true;
		break;
	case '6' :
		test.show();
		break;
	default :
		System.out.println(" invalid input");	
	}


}}
}
