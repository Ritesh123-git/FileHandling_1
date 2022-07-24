package Handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample4 {

	public static void main(String args[]) throws IOException {
		FileWriter fw= new FileWriter("E:/JavaProgram/name4.txt",true);
		BufferedWriter out = new BufferedWriter(fw );
		
		out.write("computer");
		out.close();
		
	}
	
}
