package corejava;

public class CustomException {
	
	public static void checkage(int age) throws Exception{
		
		if (age < 18) {
			
			System.out.println("create a new exeception");
			
			Thread.sleep(5000);
			
			// using throw keyword 
			
			throw new Exception("Age must be 18 or older to vote");
			
		}else {
			
			System.out.println("Person is not eligible for voting");
		}
		
		
	}
	
	

	public static void main(String[] args) throws Exception {

		CustomException obj = new CustomException();
		
		obj.checkage(15);

	}

}
