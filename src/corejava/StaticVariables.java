package corejava;

public class StaticVariables {
	
	// variables declared at class level with static keywords.
	
	// there is no need to create the  object of the  class 
	
	public static String studentName = "Jaya";
	
	public String college = "ChandiGharh University";

	public static int studid = 787;
	

	public static void main(String[] args) {

		StaticVariables sv = new StaticVariables();
		
		// accessing the static variables 
		
		System.out.println(studentName);
		
		System.out.println(studid);
		
		// access the non static varaibles 
		
		System.out.println(sv.college);
		
		

	}

}
