package IO.CharStreams;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderEg {

	public static void main(String[] args) throws IOException {
		
		
		// string writer to the console

		  StringWriter writer = new StringWriter();
          writer.write("Hello from StringWriter!");
          String result = writer.toString();
          System.out.println(result);
          writer.close();
          
          
          // string reader from the file
          
          String data = "Hello from StringReader!";
          
              StringReader reader = new StringReader(data);
              int ch;
              while ((ch = reader.read()) != -1) {
                  System.out.print((char) ch);
              }
              reader.close();

	}

}
