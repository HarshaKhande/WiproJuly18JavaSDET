package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Setseg {

	public static void main(String[] args) {
		
		// Treeset example 
		
		//contains no duplicate elements.
		
		//  no  null values are allowed element
		
		// non synchronzied
		
		// data is displayed in ascending order 
		
		// operations are faster than the lists interface 
		
		
		
		Set<String> st = new TreeSet<String>();
		
		st.add("orange");
		
		st.add("banana");
		
		st.add("grapes");
		
		st.add("apple");
		
		st.add("pineapple");
		
		st.add("grapes");
		
		st.add("null");
		
		st.add("null");
		

		System.out.println(st);
		

		System.out.println(st.isEmpty());
		
		System.out.println(st.remove("apple"));
		
		System.out.println(st);
		
		System.out.println(st.add("King"));
		
		System.out.println(st);

		System.out.println(st.size());
		

		
		
		

		

	}

}
