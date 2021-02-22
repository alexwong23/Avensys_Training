package Day13_20022021;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreams {
	public static void main(String[] args) {
		System.out.println("Start program");
		
		String directory = "/Users/alex/eclipse-workspace/AvensysTraining/files/";
		
		String inputFileName = "input.txt";
		String outputFileName = "output.txt";
		try {
			FileInputStream fis = new FileInputStream(directory + inputFileName);
			FileOutputStream fos = new FileOutputStream(directory + outputFileName);
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// read and write file content
			Integer ch = bis.read();
			String hello = "hello world";
			
			bos.write(hello.getBytes());			// write string
			while(ch != -1) {
				bos.write(ch.byteValue());			// write Integer
				ch = bis.read();
			}
			
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch(FileNotFoundException fnfe) {
			System.out.println("Files not found Exception");
			fnfe.printStackTrace();
		} catch(IOException ioe) {
			System.out.println("Files not found Exception");
			ioe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Finish program");
	}
}
