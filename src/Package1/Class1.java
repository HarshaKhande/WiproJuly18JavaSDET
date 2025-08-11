package Package1;

public class Class1 {
	
	// private variable
	
	private static String employeeSalary = "5666787";
	
	// private method
	
	private void fetchsalary() {
		
		System.out.println("The employee salary is" + employeeSalary );
	}
	
	// public method 
	
	public void display() {
		
		System.out.println("Displaying the data in parent class");
	}
	
	// default variable
	
	int employeeId = 77887;
	
	// default method 
	
	 void fetchemployeeID() {
		 
		 System.out.println("The employee id is"  +employeeId );
	 }

	public static void main(String[] args) {
		
		Class1 obj = new Class1();
		
		obj.display();
		
		obj.fetchsalary();
		
		obj.fetchemployeeID();
		
	
	}

}
