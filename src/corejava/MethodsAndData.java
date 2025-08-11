package corejava;

public class MethodsAndData {
	
	// employee data 
	
	// class level variables or the instance variables 
	
	public String employeeName = "Peter";
	
	int employeeid = 677887;
	
	 public static  String  employeeBU = "HR";
	 
	 public void fetchemployeedetails() {
		 
		 // local variables 
		 
		String employeeLoc = "Blr";
		 
		 System.out.println(employeeName);
		 
		 System.out.println(employeeid);
		 
		 System.out.println(employeeBU);
		 
		 System.out.println(employeeLoc);
		 
	 }
	 
	
	
	public static void main(String[] args) {

		MethodsAndData md = new MethodsAndData();
		
		md.fetchemployeedetails();
		
		

	}

}
