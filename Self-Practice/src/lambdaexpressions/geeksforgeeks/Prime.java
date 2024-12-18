package lambdaexpressions.geeksforgeeks;

import java.util.function.Predicate;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> prime = num -> {
			int count = 0;
			for(int i = 1; i <= num; i++) {
				if(num%i==0)
					count++;
			}
			if(count==2)
				return true;
			else 
				return false;
		};

		System.out.println(prime.test(14));
	}

}
