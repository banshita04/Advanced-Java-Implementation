package com.filehandling;

import java.io.File;

public class CreateDirectory {
	public static void main(String[] args) {
		File file = new File("folder\\subfolder\\yetanotherfolder\\nextfolder");
		if(file.mkdirs()) {
			System.out.println("Folder created!");
		}else {
			System.out.println("Folder already exist!");
		}
	}
}
