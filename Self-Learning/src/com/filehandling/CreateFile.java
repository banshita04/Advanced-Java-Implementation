package com.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("banshita.txt");
		file.createNewFile();
		System.out.println("File created!");

	}

}
