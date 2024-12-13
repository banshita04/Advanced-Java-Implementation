package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BEST PRACTICE -> use try with resources and .close() method.
		//
		
		try(BufferedReader br = new BufferedReader(new FileReader("folder\\test.txt"))){
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Something went wrong!");
		}
	}

}
