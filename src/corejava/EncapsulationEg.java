package corejava;

public class EncapsulationEg {
	
	// private fields - hidden fro  outside access
	
	private String name;
	private int age;
	
	// public getter method for name 
	
	public String getName() {
		
		return name ;
	}
	
	// public setter method for name 
	
		public void setName(String name ) {

			this.name = name;

		}
	
	// public getter method for age 
	
		public int getAge() {
			
			return age ;
		}

		
		// public setter method for age 
		
			public void setAge(int age) {
				
				this.age=  age ;
			}

	
	
	public static void main(String[] args) {
		
		EncapsulationEg obj = new EncapsulationEg();
		
		obj.setAge(23);
		
		obj.setName("Harry");
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());



	}

}
