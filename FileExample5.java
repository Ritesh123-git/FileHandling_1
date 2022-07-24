package Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample5 {
   public static void main(String args[]) throws IOException {
	   int ch;
	   
	   
	   FileReader fw= new FileReader("E:/JavaProgram/name3.txt");
	   BufferedReader bf= new BufferedReader(fw);
	   
	   while((ch=bf.read())!=-1) {
		   System.out.print((char)ch);
	   }
	   bf.close();
   }
}
