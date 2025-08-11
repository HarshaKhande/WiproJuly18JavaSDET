package corejava;

public interface Interface1 {
	
	
	// abstract methods 
	
	 abstract  void display();
	 
	 static void write() {
		 
		 System.out.println("writing in interface");
	 }
	 
	  default void show() {
		 
		 System.out.println("showing");
	 }
	  
	
	
	public static final String employeename = "Jaya";
	
	int employeeId = 6767;
	

	

	

}
