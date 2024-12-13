package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FilesProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("**Unique words in the custom made file**");
		Files.lines(Paths.get("file.txt"))
		.map(str->str.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("**All Files in the root directory**");
		Files.list(Paths.get("."))
		.forEach(System.out::println);
		
		System.out.println("**Directories in the root directory**");
		Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);

	}

}
