package IO.CharStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEg {

	public static void main(String[] args) throws IOException {
		
		try {

		// serialization is a process of converting objects into bytes 
				
		// write Object ()
		
		// creating the object 
		
		Student s1 = new Student (211, "John");
		
		// creating the output stream writing the object 
		
		FileOutputStream fout = new FileOutputStream("C://Users//Harsha Patil//Documents//dev//test1.txt");;
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		
		out.flush();
		
		// closing the stream 
		
		fout.close();
		
		out.close();
		
		System.out.println("object is serialazed");
		
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		
		
		
		


		
		
		

	}

}
