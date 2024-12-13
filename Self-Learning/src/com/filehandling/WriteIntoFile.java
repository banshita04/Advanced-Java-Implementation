package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BEST PRACTICE -> use try with resources and .close() method.
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("folder\\test.txt",true))){
			bw.write("Name:");
			bw.write("Banshita Datta Roy");
			bw.newLine();
			System.out.println("File written");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Something went wrong!");
		}
	}

}
