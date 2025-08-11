package corejava;

public class MethodOverloadingeg {
	
	/*1. same method name 
	2. diff no of parameters
	3.diff types of parameters
	4. it happens in the same class
	5. diff order of parameters  */
	
	//  method add with 2 parameters 	
	public int add(int a,int b) {
		
		int c = a + b;
		
		return c;
		
	}
	
	//  method add with 3 parameters 	
	public int add(int a,int b, int c ) {
		
		int d = a + b+c;
		
		return d;
		
	}
	
	//  method add with 4 parameters 	
	public int add(int a,int b, int c , int d) {
		
		int e = a + b+c+d;
		
		return e;
		
	}



	public static void main(String[] args) {

		MethodOverloadingeg obj = new MethodOverloadingeg();
		
		System.out.println(obj.add(1, 2));
		
		
		
		System.out.println(obj.add(1, 2, 3, 4));
		
		

	}

}



