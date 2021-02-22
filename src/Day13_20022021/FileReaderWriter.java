package Day13_20022021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
	public static void main(String[] args) {
		System.out.println("Start program");
		
		String directory = "/Users/alex/eclipse-workspace/AvensysTraining/files/";
		
		String inputFileName = "input.txt";
		String outputFileName = "output.txt";
		try {
			FileReader fis = new FileReader(directory + inputFileName);
			FileWriter fos = new FileWriter(directory + outputFileName);
			
			BufferedReader br = new BufferedReader(fis);
			BufferedWriter bw = new BufferedWriter(fos);
			
			// read and write file content
			int ch = br.read();
			String hello = "hello world";
			
			bw.write(hello);						// write string
			while(ch != -1) {
				bw.write(ch);						// write Integer
				ch = br.read();
			}
			
			br.close();
			bw.close();
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
