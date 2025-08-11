package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSubClass implements Comparator<Emlpoyee> {
	
		public int compare(Emlpoyee e1, Emlpoyee e2) {
			
			return e1.name.compareTo(e2.name); // ascedning order 
			
			
		}
	
	
	public static void main(String[] args) {



		List<Emlpoyee>  empoyees = new ArrayList<>();
		
		empoyees.add(new Emlpoyee (103, "Ravi"));
		
		empoyees.add(new Emlpoyee (101, "Amit"));
		
		empoyees.add(new Emlpoyee (102, "Zara"));
		
	
		empoyees.add(new Emlpoyee (102, "Zara"));
		
		
		empoyees.add(new Emlpoyee (104, "John"));
		
		Collections.sort(empoyees, new ComparatorSubClass()); 
		
		for (Emlpoyee e: empoyees ) {
			
			System.out.println(e);
		}
	}

}
