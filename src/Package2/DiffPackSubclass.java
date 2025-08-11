package Package2;

import Package1.Class1;

public class DiffPackSubclass extends Class1{
	
	public void create() {
		
		System.out.println("creating in sub class");
	}

	public static void main(String[] args) {
		
		DiffPackSubclass obj = new DiffPackSubclass();
		
		obj.create(); // own method
		obj.display(); // inherited
		
		
		

	}

}
