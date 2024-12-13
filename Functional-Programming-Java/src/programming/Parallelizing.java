package programming;

import java.util.stream.LongStream;

public class Parallelizing {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		
		System.out.println(
		LongStream.range(0, 100000000).parallel().sum());
		
		System.out.println(System.currentTimeMillis() - time);
	}

}
