package programming;

import java.util.List;

public class SumList {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		
		int sum1 = addListStructured(list);
		System.out.println(sum1);
		
		int sum2 = addListFunctional(list);
		System.out.println(sum2);
	}

	private static int sum(int aggregate, int nextNumber) {
		return aggregate+nextNumber;
	}
	private static int addListFunctional(List<Integer> list) {
		int sum = 0;
		
		System.out.println("**Using method reference**");
		sum=0;
		sum =  list.stream().
		reduce(0,SumList::sum);
		
		System.out.println("**Using lambda expression**");
		sum = 0;
		sum = list.stream().
		reduce(0,(x,y)->x+y);
		
		System.out.println("**Using Integer class**");
		sum = 0;
		sum = list.stream().
		reduce(0,Integer::sum);
		
		return sum;
	}

	private static int addListStructured(List<Integer> list) {
		int sum = 0;
		for(int n:list) {
			sum+=n;
		}
		return sum;
	}
}
