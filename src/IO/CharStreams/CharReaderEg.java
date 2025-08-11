package IO.CharStreams;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharReaderEg {

	public static void main(String[] args) {

		
		try {
			CharArrayWriter ch = new CharArrayWriter();
			ch.write("Hello boys");
			ch.write(" I am Sanjay singh Mehara");
		 
			FileWriter fw=new FileWriter("C:\\Users\\my pc\\eclipse-workspaceWipro\\SDET_WIPRO\\src\\IO_CharStream\\CharArrayWriter_Reader");
			ch.writeTo(fw);
			fw.close();
			ch.close();
			CharArrayReader cr=new CharArrayReader(ch.toCharArray());
			int i=cr.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=cr.read();
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
		 
		}
	

