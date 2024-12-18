package lambdaexpressions.geeksforgeeks;

import java.util.function.Function;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> largestPrimeFactor = num ->{
			int copy = 0; 
			for(int i = num-1; i >= 1; i--) { 
				if(isFactor(num, i))
					if(isPrime(i)) {
						copy = i;
						break;
					}
			}
			if(copy!=0)
				return copy;
			else 
				return -1;
		};

		System.out.println(largestPrimeFactor.apply(10));
	}
	public static boolean isPrime(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i==0)
				count++;
		}
		if(count == 2) {
			return true;
		}else
			return false;
	}
	public static boolean isFactor(int num, int factor) {
		if(num%factor==0) {
			return true;
		}else
			return false;
	}

}
