package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListUsingDeque {

	public static void main(String[] args) {
		
		Queue<String> lang = new LinkedList<>();
		
		// add elements
		
		lang.add("Python");
		
		lang.add("Java");
		
		lang.add("C");
		
		lang.add("C++");
		
		System.out.println(lang);
	
		
		// access the first element
		
		System.out.println(lang.peek());
		
		// remove 
		
		System.out.println(lang.remove("c"));
		
		System.out.println(lang);
		
		// poll
		
		System.out.println(lang.poll());
		
		


		
	


	}

}
