package corejava;

public class StringBufferEg {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		
		System.out.println(sb);
		
		// mutable in nature 
		
		// append 
		
		sb.append("world");
		
		System.out.println(sb);

		
		System.out.println(sb.replace(0, 2, "abc"));
		
		// string buffer methdos 
		
		// reverse , is empty, // insert // delete // substring 
		// replace // char at index // index of // lenght // repeat 
		


	}

}
