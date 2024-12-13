package com.filehandling;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File file = new File("banshita.txt");
		if(file.delete()) {
			System.out.println("File deleted!");
		}else {
			System.out.println("File deletion has some error(s)");
		}
	}
}
