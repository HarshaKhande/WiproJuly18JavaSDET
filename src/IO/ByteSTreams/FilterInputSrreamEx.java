package IO.ByteSTreams;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputSrreamEx {

	public static void main(String[] args) {
		
		//filter streams filter data as they read and write data in the input stream ,
		
		//filters it and pass to on to the underlying streams
		
		FileInputStream fis = null;
		
		FilterInputStream filterinput = null;
		
		try {
			
			// create file input stream foe the file 
			
			fis = new FileInputStream("C://Users//Harsha Patil//Documents//dev//file2.txt");
			
			// wrap file input stream with buffered input stream 
			
			filterinput = new BufferedInputStream(fis);
			
			// read and print the file content 
			
			int data ;
			
			while ((data = filterinput.read())  != -1 ) {
				
				System.out.print((char)data);
			
			
			}
			
			fis.close();
					
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
		
		
		
		
		
		



	}

}
