package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapEg {

	public static void main(String[] args) {
		/*
		 * 1.An object that maps keys to values
	2.A map cannot contain duplicate keys
	3.each key can map to at most one value. 
	4.The map is sorted according to the natural ordering of its keys, 
	5.Values can be duplicated
	6. no  null as  key is allowed
	7. Multiple null values are allowed 
	8. this implementation is not synchronize*/
		
Map<Integer, String>map = new TreeMap<Integer, String>();
		
		map.put(1, "Amit");
		map.put(5, "John");
		map.put(2,  "Vijay");
		map.put(3, "Rahul");
		
	System.out.println(map);
		
		// converting the map to the set
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		
			
			
		}
		
		


		 

	}

}
