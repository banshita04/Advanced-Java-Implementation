package programming;

import java.util.List;

public class Sum {
	public static void main(String[] args) {
		int sumSquare1 = squareSumListStructured(List.of(1,2,3,4,5,6,7,8,9));
		System.out.println("Sum of Squares: "+sumSquare1);
		
		int sumSquare2 = squareSumListFunctional(List.of(1,2,3,4,5,6,7,8,9));
		System.out.println("Sum of Squares: "+sumSquare2);
		
		int sumCube = cubeSumListFunctional(List.of(1,2,3,4,5,6,7,8,9));
		System.out.println("Sum of Cubes: "+sumCube);
		
		int sumOdd = oddSumListFunctional(List.of(1,2,3,4,5,6,7,8,9));
		System.out.println("Sum of odd: "+sumOdd);
		
		int sumEven = evenSumListFunctional(List.of(1,2,3,4,5,6,7,8,9));
		System.out.println("Sum of even: "+sumEven);
	}
	
	private static int isSum(int a, int b) {
		return a+b;
	}

	private static int evenSumListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("**Using lambda expression**");
		return list.stream().filter(n->n%2==0).reduce(0,Integer::sum);
	}
	
	private static int oddSumListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("**Using lambda expression**");
		return list.stream().filter(n->n%2!=0).reduce(0,Sum::isSum);
	}

	private static int cubeSumListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("**Using lambda expression**");
		return list.stream().
		map(n->n*n*n).reduce(0,(x,y)->x+y);
	}

	private static int squareSumListFunctional(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("**Using lambda expression**");
		return list.stream().map(n->n*n).reduce(0,Integer::sum);
	}

	private static int squareSumListStructured(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("**Using traditional loop**");
		int sum = 0;
		for(int num : list) {
			sum+= num*num;
		}
		return sum;
	}

}
