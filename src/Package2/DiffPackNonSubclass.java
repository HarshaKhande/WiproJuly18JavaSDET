package Package2;

import Package1.Class1;

public class DiffPackNonSubclass {
	
	public void print() {
		
		System.out.println("printing the data ");
	}

	public static void main(String[] args) {

		Class1 obj = new Class1();
		
		DiffPackNonSubclass obj1 = new DiffPackNonSubclass();
		
		obj.display();
		
		obj1.print();
		
		
		
		


	}

}
